import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        System.out.println("1 Create file");
        System.out.println("2 Create file with data");
        System.out.println("3 Delete file");
        System.out.println("0 Exit");
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        while (flag == 1){
            System.out.println("Please choose your option (For example: '1')");
            int option = scanner.nextInt();
            if (option==0){
                flag = 0;
            }
            else if (option==1) {
                System.out.println("Please enter path (For example: 'C:/')");
                String path = scanner.next();
                System.out.println("Please enter filename");
                String name = scanner.next();
                fileManager.createFile(path, name);
            }
           else if (option==2){
                System.out.println("Please enter path (For example: 'C:/')");
                String path = scanner.next();
                System.out.println("Please enter filename");
                String name = scanner.next();
               fileManager.FileWriter(path, name);
            }
            else if (option==3){
                System.out.println("Please enter path (For example: 'C:/')");
                String path = scanner.next();
                System.out.println("Please enter filename");
                String name = scanner.next();
                fileManager.deleteFile(path, name);
            }
        }
    }
}