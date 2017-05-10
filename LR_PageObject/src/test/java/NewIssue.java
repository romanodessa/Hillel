import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewIssue {

    JiraHeader headerPage;

    By newSubtaskButtonLocator = By.id("stqc_show");
    By summaryLocator = By.id("summary");
    By submitButtonLocator = By.id("create-issue-submit");
    By assign = By.id("assign-to-me-trigger");

    private final WebDriver driver;

    public NewIssue(WebDriver driver){
        this.driver = driver;
        headerPage = new JiraHeader(driver);
    }

    public NewIssue clickNewSubtaskButton () throws InterruptedException {
        headerPage.search("QAAUT-60");
        Thread.sleep(4000);
        driver.findElement(newSubtaskButtonLocator).click();
        return this;
    }

    public NewIssue clickAssign(){
        driver.findElement(assign).click();
        return this;
    }

    public NewIssue fillSummary (String summary) {
        System.out.println("Creating of new sub task...");
        waiting(summaryLocator);
        driver.findElement(summaryLocator).sendKeys(summary);
        return this;
    }

    public NewIssue clickSubmitButton () {
        driver.findElement(submitButtonLocator).click();
        System.out.println("Sub-task has been created successfully!");
        return this;
    }

    public NewIssue waiting(By locator){
        (new WebDriverWait(driver, 10)).
                until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }
}