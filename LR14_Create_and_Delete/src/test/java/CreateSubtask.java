import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateSubtask {

    By newSubtaskButtonLocator = By.id("stqc_show");
    By summaryLocator = By.id("summary");
    By assignToMeLocator = By.id("assign-to-me-trigger");
    By submitButtonLocator = By.id("create-issue-submit");
    private final WebDriver driver;

    public CreateSubtask (WebDriver driver) { this.driver = driver; }

    public CreateSubtask clickNewSubtaskButton () throws Exception {
        waiting(newSubtaskButtonLocator);
        driver.findElement(newSubtaskButtonLocator).click();
        return this;
    }

    public CreateSubtask fillSummary (String summary) {
        waiting(summaryLocator);
        driver.findElement(summaryLocator).sendKeys(summary);
        return this;
    }

    public CreateSubtask clickAssignToMe () {
        driver.findElement(assignToMeLocator).click();
        return this;
    }

    public CreateSubtask clickSubmitButton () {
        driver.findElement(submitButtonLocator).click();
        return this;
    }

    public CreateSubtask waiting(By locator){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }
}
