package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTests {

    @Test
    public void verifyPageWillLoad() {
        getAlertsPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("alerts"));
    }

    //Click Button to see alert
    @Test
    public void verifyAlertButton(){
        getAlertsPage().open()
                .clickAlertButton();
        getDriver().switchTo().alert().accept();
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getAlertsPage().getAlertButton())).isDisplayed());

    }
    //On button click, confirm box will appear
    @Test
    public void verifyConfirmBox(){
        getAlertsPage().open()
                .clickConfirmButton();
        getDriver().switchTo().alert().accept();
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getAlertsPage().getAlertButtonConfirm())).isDisplayed());

    }
}
