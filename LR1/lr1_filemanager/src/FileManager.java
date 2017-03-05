import java.io.*;

public class FileManager {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void createFile() throws IOException {
        boolean result;

        File file = new File(pathInput());
        result = file.createNewFile();
        if (result) {
            System.out.println("File has been created");
        } else {
            System.out.println("File already exists");
        }
    }

    public void deleteFile() throws IOException {
        boolean result;

        File file = new File(pathInput());
        result = file.delete();

        if (result) {
            System.out.println("File has been deleted");
        } else {
            System.out.println("File hasn't been found or can't be deleted");
        }
    }

    public void renameFile() throws IOException {
        boolean result;
        String pathNew;

        File file = new File(pathInput());
        System.out.println("Please, input a path and new file name: ");

        pathNew = reader.readLine();
        File fileNew = new File(pathNew);
        result = file.renameTo(fileNew);

        if (result) {
            System.out.println("File has been renamed");
        } else {
            System.out.println("File hasn't been renamed");
        }
    }

    public void findWord() throws IOException {
        String word;
        int val = 0;
        String line;

        File file = new File(pathInput());

        System.out.println("Input the word for search: ");
        word = reader.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        while ((line = reader.readLine()) != null) {
            if (line.contains(word)) {
                System.out.println("The word has been found");
                val = 1;
                break;
            } else {
                val = 0;
            }
        }

        if (val == 0) {
            System.out.println("The word hasn't been found");
        }
    }

    public void replaceWord() throws IOException {
        String word;
        String wordNew;
        String line;
        String textOld = "";
        String textNew;
        String path = pathInput();

        File file = new File(path);

        System.out.println("Input the word that should be replaced: ");
        word = reader.readLine();

        System.out.println("Input the new word: ");
        wordNew = reader.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        while ((line = reader.readLine()) != null) {
            if (System.getProperty("os.name").contains("Windows")) {
                textOld += line + "\r\n";
            } else {
                textOld += line + "\n";
            }
        }
        reader.close();

        if (textOld.contains(word)) {
            textNew = textOld.replaceAll(word, wordNew);
            FileWriter writer = new FileWriter(path);
            writer.write(textNew);
            writer.close();
            System.out.println("The word has been replaced");
        } else {
            System.out.println("Such word is missing in this file");
        }
    }

    public String pathInput() throws IOException {
        String os;
        String path;

        os = System.getProperty("os.name");
        System.out.println("Your operation system is " + os);

        if (os.contains("Windows")) {
            System.out.println("Please, input a path and file name in format (example): C:\\Users\\user\\test.txt");
            path = reader.readLine();
        } else if (os.contains("Mac")) {
            System.out.println("Please, input a path and file name in format (example) /Users/user/projects/test.txt");
            path = reader.readLine();
        } else if (os.contains("Linux")) {
            System.out.println("Please, input a path and file name in format (example) /home/user/projects/test.txt");
            path = reader.readLine();
        } else {
            System.out.println("Please, input a path and file name");
            path = reader.readLine();
        }

        return path;
    }
}