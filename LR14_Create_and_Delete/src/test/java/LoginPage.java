import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    By usernameLocator = By.id("login-form-username");
    By passwordLocator = By.id("login-form-password");
    By loginButtonLocator = By.id("login-form-submit");

    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage open (String url){
        driver.get(url);
        return this;
    }

    public LoginPage typeUsername (String username){
        driver.findElement(usernameLocator).sendKeys(username);
        return this;
    }

    public LoginPage typePassword (String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public LoginPage submitLoginButton () {
        driver.findElement(loginButtonLocator).submit();
        return this;
    }

}
