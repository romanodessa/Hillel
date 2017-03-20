import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class FileManager {

    boolean interactive;

    FileManager(Boolean mode) {

        interactive = mode;
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void createFile(String filePath) {
        if (interactive) {
            try {
                filePath = pathInput();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        boolean result = false;

        File file = new File(filePath);
        try {
            result = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public void writeExcel() throws IOException {
        String path = pathInput();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");

    }


    public void readExcel() throws IOException {
        String path = pathInput();

        try {

            FileInputStream excelFile = new FileInputStream(new File(path));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    //getCellTypeEnum shown as deprecated for version 3.15
                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + "--");
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "--");
                    }

                }
                System.out.println();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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