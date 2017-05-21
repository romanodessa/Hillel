import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DeleteSubtask {

    By subtaskLocator = By.xpath("//a[contains(text(),'Roman test2')]");
    By moreButtonLocator = By.id("opsbar-operations_more");
    By deleteDropdownLocator = By.id("delete-issue");
    By deleteSubmitLocator = By.id("delete-issue-submit");

    private final WebDriver driver;

    public DeleteSubtask(WebDriver driver) { this.driver = driver; }

    public DeleteSubtask clickSubtask() {
        waitUntilElementToBeClickable(subtaskLocator);
        driver.findElement(subtaskLocator).click();
        return this;
    }

    public DeleteSubtask clickMoreButton() {
        waitUntilElementToBeClickable(moreButtonLocator);
        driver.findElement(moreButtonLocator).click();
        return this;
    }

    public DeleteSubtask clickDeleteDropdown() {
        waitUntilElementToBeClickable(deleteDropdownLocator);
        driver.findElement(deleteDropdownLocator).click();
        return this;
    }

    public DeleteSubtask clickDeleteSubmit() {
        waitUntilElementToBeClickable(deleteSubmitLocator);
        driver.findElement(deleteSubmitLocator).click();
        return this;
    }

    public DeleteSubtask waitUntilElementToBeClickable(By locator) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(locator));
        return this;
    }

}
