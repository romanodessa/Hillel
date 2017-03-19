import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String action;

        FileManager fm = new FileManager();

        System.out.println("Choose an action:");
        System.out.println("1. Create File");
        System.out.println("2. Delete File");
        System.out.println("3. Rename File");
        System.out.println("4. Find Word");
        System.out.println("5. Replace Word");
        System.out.println("6. Write Excel");
        System.out.println("7. Read Excel");
        System.out.println("0. Exit");

        do {
            action = reader.readLine();
            switch (action) {
                case "0":
                    break;

                case "1":
                    fm.createFile();
                    break;

                case "2":
                    fm.deleteFile();
                    break;

                case "3":
                    fm.renameFile();
                    break;

                case "4":
                    fm.findWord();
                    break;

                case "5":
                    fm.replaceWord();
                    break;

                case "6":
                    fm.writeExcel();
                    break;

                case "7":
                    fm.readExcel();
                    break;

                default:
                    System.out.println("Unacceptable action! Choose an action from the list");
            }
        }
        while (!action.equals("0"));
    }
}