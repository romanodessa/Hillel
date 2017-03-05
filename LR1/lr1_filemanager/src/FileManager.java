import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

    public static void createFile(String path, String name) throws IOException {
        try {
            File file = new File(path+name);
            boolean fvar = file.createNewFile();
            if (fvar){
                System.out.println("Файл был успешно создан");
            }
            else{
                System.out.println("Такой файл уже существует в системе");
            }
        } catch (IOException error) {
            System.out.println("Error");
            error.printStackTrace();
        }
    }

    public static void FileWriter(String path, String name) {

        try (FileWriter writer = new FileWriter("text.text", false)) {
            // запись всей строки
            String text = "Текст добавлен в документ";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();

            System.out.println("Информация успешно записана в файл");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static void deleteFile(String path, String name) {
        File file = new File(path + name);
        if (file.canWrite()) {
            boolean fvar = file.delete();
            if (fvar) {
                System.out.println("Файл был успешно удален");
            } else {
                System.out.println("Файл не удален");
            }
        } else {
            System.out.println("У вас нет доступа к данному файлу");
        }
    }
}



































/*import java.io.*;
import java.lang.*;

public class FileManager {
    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String text = "This new text \nThis new text2\nThis new text3\n";
    private static String fileName = "/Users/a1/Documents/1.txt";

    public static void write(String[] args) throws FileNotFoundException {

        //Запись в файл
        FileManager.write(fileName, text);

    }


}

/*    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    private static String text = "This new text \nThis new text2\nThis new text3\nThis new text4\n";
    private static String fileName = "/Users/a1/Documents/1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        //Попытка прочитать несуществующий файл
        FileManager.read("no_file.txt");

        //Чтение файла
        String textFromFile = FileManager.read(fileName);
        System.out.println(textFromFile);


    public static void update(String nameFile, String newText) throws FileNotFoundException {
        exists(fileName);
        StringBuilder sb = new StringBuilder();
        String oldFile = read(nameFile);
        sb.append(oldFile);
        sb.append(newText);
        write(nameFile, sb.toString());
    }

    private static String newText = "This new text \nThis new text2\nThis new text3\nThis new text4\n";
    private static String nameFile = "/Users/a1/Documents/1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        //Обновление файла
        FileManager.update(fileName, "This new text");
    }

} */
