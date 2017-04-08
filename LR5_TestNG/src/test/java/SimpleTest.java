
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class SimpleTest {

    boolean interactive = false;
    String createFilePath = "/Users/a1/Documents/test5.txt";
    String deleteFilePath = "/Users/a1/Documents/test1.txt";
    String filePathNegative = "/Users/a1/Documentsjh/test2.txt";

    @Parameters({"interactive"})
    SimpleTest(boolean interactive) {
        this.interactive = interactive;
    }

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Parameters({"myParam"})
    @Test(groups = {"gotParams", "runAll"})
    public void getParams(String myParam)throws IOException{
        System.out.println("I got a parameter: " + myParam);
    }

    @Test(groups = {"createFile", "runAll"})
    public void testCreateFile() throws IOException {
        FileManager fileManager = new FileManager(interactive);
        fileManager.createFile(createFilePath);
        assertEquals(true, Files.exists(Paths.get(createFilePath)));
    }

    @Test(groups = {"deleteFile", "runAll"})
    public void testDeleteFile() throws  Exception {
        FileManager fileManager = new FileManager(interactive);
        assertEquals(true, Files.exists(Paths.get(deleteFilePath)));
        fileManager.deleteFile(deleteFilePath);
        assertEquals(false, Files.exists(Paths.get(deleteFilePath)));
    }

    @Test(groups = {"CreateFileNegative", "runAll"}, expectedExceptions = {IOException.class})
    public void testCreateFileNegative() throws IOException {
        FileManager fileManager = new FileManager(interactive);
        fileManager.createFile(filePathNegative);
        assertEquals(false, Files.exists(Paths.get(filePathNegative)));
    }

}