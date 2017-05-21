import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderMenu {

    By systemDashboardLocator = By.cssSelector("div.aui-header-primary");
    By issuesLocator = By.id("find_link");
    By fakeTaskLocator = By.id("issue_lnk_11527_lnk");

    private final WebDriver driver;

    public HeaderMenu(WebDriver driver){
        this.driver = driver;
    }

    public HeaderMenu findSystemDashboard (){
        waiting(systemDashboardLocator);
        driver.findElement(systemDashboardLocator);
        return this;
    }

    public HeaderMenu clickFindIssues () {
        waiting(issuesLocator);
        driver.findElement(issuesLocator).click();
        return this;
    }

    public HeaderMenu clickFakeTask (){
        waiting(fakeTaskLocator);
        driver.findElement(fakeTaskLocator).click();
        return this;
    }

    public HeaderMenu waiting(By locator){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }

}
