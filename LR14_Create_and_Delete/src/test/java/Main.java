import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.gecko.driver", "/Users/a1/Downloads/geckodriver");
        DesiredCapabilities caps = new FirefoxOptions()
                .setProfile(new FirefoxProfile())
                .addTo(DesiredCapabilities.firefox());
        WebDriver driver = new FirefoxDriver(caps);

        LoginPage loginPage = new LoginPage(driver);
        HeaderMenu headerMenu = new HeaderMenu(driver);
        CreateSubtask subtask = new CreateSubtask(driver);
        DeleteSubtask deleteSubtask = new DeleteSubtask(driver);

        loginPage.open("http://soft.it-hillel.com.ua:8080/login.jsp");
        loginPage.typeUsername("romashpiller");
        loginPage.typePassword("Chernomorets1936");
        loginPage.submitLoginButton();

        headerMenu.findSystemDashboard();
        headerMenu.clickFindIssues();
        headerMenu.clickFakeTask();

        subtask.clickNewSubtaskButton();
        subtask.fillSummary("Roman test2");
        subtask.clickAssignToMe();
        subtask.clickSubmitButton();

        deleteSubtask.clickSubtask();
        deleteSubtask.clickMoreButton();
        deleteSubtask.clickDeleteDropdown();
        deleteSubtask.clickDeleteSubmit();

        driver.quit();
    }

}
