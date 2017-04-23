import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2Example {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the ismplementation.

        /*System.setProperty("webdriver.gecko.driver", "/Users/a1/Downloads/geckodriver3");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);

        DesiredCapabilities caps = new FirefoxOptions()
                // For example purposes only
                .setProfile(new FirefoxProfile())
                .addTo(DesiredCapabilities.firefox());
        WebDriver driver = new FirefoxDriver(caps);  */



        System.setProperty("webdriver.gecko.driver", "/Users/a1/Downloads/geckodriver");
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        //WebDriver driver = new FirefoxDriver(capabilities);

        DesiredCapabilities caps = new FirefoxOptions()
                // For example purposes only
                .setProfile(new FirefoxProfile())
                .addTo(DesiredCapabilities.firefox());
        WebDriver driver = new FirefoxDriver(caps);


        driver.get("https://google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
                                                  }
                                              });
        System.out.println("Page title is: " + driver.getTitle());

       driver.quit();

        /*
        // And now use this to visit Google
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser
        driver.quit();      */

    }
}
