import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.fail;


public class Create_fail_sub_tasks {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/a1/Downloads/geckodriver");
        DesiredCapabilities caps = new FirefoxOptions()
                // For example purposes only
                .setProfile(new FirefoxProfile())
                .addTo(DesiredCapabilities.firefox());
        WebDriver driver = new FirefoxDriver(caps);


        driver.get("http://soft.it-hillel.com.ua:8080/login.jsp");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        try {
            driver.findElement(By.id("login-form-username")).clear();
            WebElement element = driver.findElement(By.name("os_username"));
            element.sendKeys("your login");

            driver.findElement(By.id("login-form-password")).clear();
            WebElement element1 = driver.findElement(By.name("os_password"));
            element1.sendKeys("your password");

            WebElement element2 = driver.findElement(By.id("login-form-submit"));
            element2.click();


            WebElement element3 = driver.findElement(By.id("create_link"));
            System.out.println("Find Create element: " + element3);
            WebElement element4 = driver.findElement(By.id("quickSearchInput"));
            System.out.println("Find Search element: " + element4);
            WebElement element5 = driver.findElement(By.xpath("//*[@id=\"dashboard-content\"]/div[1]/div/div[1]/h1"));
            System.out.println("Find Dashboard element: " + element5);



            /*driver.get("http://soft.it-hillel.com.ua:8080/browse/QAAUT-60");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.id("opsbar-operations_more")).click();
            driver.findElement(By.cssSelector("#create-subtask > span.trigger-label")).click();
            driver.findElement(By.id("summary")).clear();
            driver.findElement(By.id("summary")).sendKeys("test10 Roman");
            driver.findElement(By.id("aui-uid-1")).click();
            driver.findElement(By.id("description")).sendKeys("test8 Roman");
            driver.findElement(By.id("assign-to-me-trigger")).click();
            driver.findElement(By.id("create-issue-submit")).click();*/

            driver.get("http://soft.it-hillel.com.ua:8080/browse/QAAUT-58");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.id("opsbar-operations_more")).click();
            driver.findElement(By.cssSelector("#create-subtask > span.trigger-label")).click();
            driver.findElement(By.id("summary")).clear();
            driver.findElement(By.id("summary")).sendKeys("Selenium Basics - Roman");
            //driver.findElement(By.id("aui-uid-1")).click();
            driver.findElement(By.id("description")).sendKeys("test8 Roman");
            driver.findElement(By.id("assign-to-me-trigger")).click();
            driver.findElement(By.id("create-issue-submit")).click();


            driver.quit();


        } catch (NoSuchElementException e) {
            fail("Element not found!!");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }


    }
