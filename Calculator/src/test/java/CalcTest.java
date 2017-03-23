import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;


public class CalcTest {

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = {"tests"})
    public void testSubPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in sub()",  6, Calculator.sub(7, 1));
        assertEquals("error in sub()", -4, Calculator.sub(-7, -3));
        assertEquals("error in sub()",  9, Calculator.sub(9, 0));
    }

    @Test(groups = {"tests"})
    public void testSubFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.sub(2, 1), "error in sub()");
    }

    @Test(groups = {"tests"})
    public void testAddPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in add()",  5, Calculator.add(2, 3));
        assertEquals("error in add()", -6, Calculator.add(-4, -2));
        assertEquals("error in add()",  9, Calculator.add(9, 0));
    }

    @Test(groups = {"tests"})
    public void testAddFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.add(1, 2), "error in add()");
    }

    @Test(groups = {"tests"})
    public void testMulPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in mul()",  4, Calculator.mul(1, 4));
        assertEquals("error in mul()", 8, Calculator.mul(-4, -2));
        assertEquals("error in mul()", -2, Calculator.mul(-1, 2));
        assertEquals("error in mul()",  0, Calculator.mul(9, 0));
    }

    @Test(groups = {"tests"})
    public void testMulFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.mul(2, 1), "error in mul()");
    }

    @Test(groups = {"tests"})
    public void testDivIntPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in divInt()",  2, Calculator.divInt(4, 2));
        assertEquals("error in divInt()", 4, Calculator.divInt(-8, -2));
        assertEquals("error in divInt()", -3, Calculator.divInt(-6, 2));
        try{
            assertEquals("error in divInt()", Calculator.divInt(5, 0));
            Assert.fail( "Should have thrown an exception" );
        }
        catch (Exception e){
            String expectedMessage = "Cannot divide by 0!";
            Assert.assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test(groups = {"tests"})
    public void testDivIntFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.divInt(2, 1), "error in divInt()");
    }

    @Test(groups = {"tests"})
    public void testDivRealPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in divReal()",  3.5, Calculator.divReal(7, 2));
        assertEquals("error in divReal()", 2.5, Calculator.divReal(-5, -2));
        assertEquals("error in divReal()", -4.5, Calculator.divReal(-9, 2));
        try{
            assertEquals("error in divReal()", Calculator.divReal(7, 0));
            Assert.fail( "Should have thrown an exception" );
        }
        catch (Exception e){
            String expectedMessage = "Cannot divide by 0!";
            Assert.assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test(groups = {"tests"})
    public void testDivRealFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.divReal(3, 1), "error in divReal()");
    }
}