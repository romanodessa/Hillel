import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestCreateSub {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/Users/a1/Downloads/geckodriver");
        DesiredCapabilities caps = new FirefoxOptions()
                .setProfile(new FirefoxProfile())
                .addTo(DesiredCapabilities.firefox());
        WebDriver driver = new FirefoxDriver(caps);

        LoginPage loginPage = new LoginPage(driver);
        JiraHeader JiraPage = new JiraHeader(driver);
        NewIssue newIssuePage = new NewIssue(driver);

        loginPage.open("http://soft.it-hillel.com.ua:8080/login.jsp");
        loginPage.typeUsername("romashpiller");
        loginPage.typePassword("*******");
        loginPage.clickOnLoginButton();

        JiraPage.findCreate();
        JiraPage.findSearch();

        newIssuePage.clickNewSubtaskButton();
        newIssuePage.fillSummary("Roman test2");
        newIssuePage.clickAssign();
        newIssuePage.clickSubmitButton();

        driver.quit();
    }
}
