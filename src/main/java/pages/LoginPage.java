package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private WebElement userName;
    private WebElement password;
    private WebElement login;
    private WebElement userNameErrorMessage;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getUserName() {
        this.userName = getDriver().findElement(By.id("userName"));
        return userName;
    }

    public WebElement getPassword() {
        this.password = getDriver().findElement(By.id("password"));
        return password;
    }

    public WebElement getLogin() {
        this.login = getDriver().findElement(By.id("login"));
        return login;
    }

    public WebElement getUserNameErrorMessage() {
        this.userNameErrorMessage = getDriver().findElement(By.id("name"));
        return userNameErrorMessage;
    }

    public LoginPage enterDataToUsernameField(String text) {
        getUserName().sendKeys(text);
        return this;
    }

    public LoginPage enterDataToPasswordField(String text) {
        getPassword().sendKeys(text);
        return this;
    }

    public LoginPage clickLoginButton() {
        getLogin().click();
        return this;
    }

    public LoginPage open() {
        getDriver().get("https://demoqa.com/login");
        return this;
    }


}
