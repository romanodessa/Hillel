import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class SimpleTest {

    boolean interactive = false;
    String createFilePath = "/Users/a1/Documents/";

    @Parameters({"interactive"})
    SimpleTest(boolean interactive) {
        this.interactive = interactive;
    }

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Parameters({"myParam"})
    @Test(groups = {"functest", "checkintest"})
    public void testMethod1(String myParam) {
        System.out.println("I got a parameter: " + myParam);
    }

    @Test(groups = {"functest", "checkintest"})
    public void testMethod2() {
        FileManager fileManager = new FileManager(interactive);
        fileManager.createFile(createFilePath);
        assertEquals(true, Files.exists(Paths.get(createFilePath)));
    }

    @Test(groups = {"functest"})
    public void testMethod3() {
    }

}