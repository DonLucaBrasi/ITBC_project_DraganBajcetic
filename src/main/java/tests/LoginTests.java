package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    //Verify user can log in with valid username and password
    @Test
    public void verifyUserCanLogin() {
        getDriver().manage().window().setSize(new Dimension(800, 600));
        getLoginPage().open()
                .enterDataToUsernameField("john")
                .enterDataToPasswordField("Admin123*")
                .clickLoginButton();
        getWait().until(ExpectedConditions.urlContains("/profile"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("profile"));
    }

    //Verify user can't log in with invalid username
    @Test
    public void verifyUserCantLogin() {
        getLoginPage().open()
                .enterDataToUsernameField("johnn")
                .enterDataToPasswordField("Admin123*")
                .clickLoginButton();
        getWait().until(ExpectedConditions.numberOfElementsToBe(By.id("name"), 1));
        Assert.assertTrue(getLoginPage().getUserNameErrorMessage().isDisplayed());
    }

    //Verify user can't log in with invalid password
    @Test
    public void verifyUserCantLogin1() {
        getLoginPage().open()
                .enterDataToUsernameField("john")
                .enterDataToPasswordField("dmin123*")
                .clickLoginButton();
        getWait().until(ExpectedConditions.numberOfElementsToBe(By.id("name"), 1));
        Assert.assertTrue(getLoginPage().getUserNameErrorMessage().isDisplayed());
    }


}
