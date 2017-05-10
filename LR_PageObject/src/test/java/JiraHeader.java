import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JiraHeader {

    By createLocator = By.id("create-menu");
    By searchLocator = By.id("quickSearchInput");
    By projects = By.id("browse_link");
    By issues = By.xpath(".//*[@id='find_link']");
    By boards = By.xpath(".//*[@id='find_link']");
    By testRail = By.xpath(".//*[@id='menu']");

    private final WebDriver driver;

    public JiraHeader(WebDriver driver){
        this.driver = driver;
    }

    public JiraHeader clickprojects(){
        driver.findElement(projects).click();
        return this;
    }
    public JiraHeader clickissues(){
        driver.findElement(issues).click();
        return this;
    }
    public JiraHeader clickboards(){
        driver.findElement(boards).click();
        return this;
    }
    public JiraHeader clicktestRail(){
        driver.findElement(testRail).click();
        return this;
    }

    public JiraHeader findCreate (){
        waiting(createLocator);
        System.out.println("Element [Create] has been found");
        return this;
    }

    public JiraHeader findSearch (){
        driver.findElement(searchLocator);
        System.out.println("Element [Search] has been found");
        return this;
    }

    public JiraHeader search (String searchWord){
        WebElement element = driver.findElement(searchLocator);
        element.sendKeys(searchWord);
        element.submit();
        System.out.println("Element [Search] has been found");
        return this;
    }

    public JiraHeader waiting(By locator){
        (new WebDriverWait(driver, 10)).
                until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }
}
