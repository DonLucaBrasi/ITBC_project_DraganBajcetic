package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElemTextAreaPageTests extends BaseTests {

    @Test
    public void verifyPageWillLoad() {
        getElemTextAreaPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("text-box"));
    }

    //verify that user can submit valid data in all fields
    @Test
    public void verifyUserCanSubmitTextBox() {
        getElemTextAreaPage().open()
                .enterDataToFullNameField("Pol Polic")
                .enterDataToEmailField("test@test.com")
                .enterDataToCurrentAddressField("dasda")
                .enterDataToPermanentAddressField("dase")
                .clickSubmitButton();
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getElemTextAreaPage().getTextBoxPageConfirm())).isDisplayed());
    }

    //verify that user can not submit text area with invalid email
    @Test
    public void verifyUserCantSubmitTextBox() {
        getElemTextAreaPage().open()
                .enterDataToFullNameField("John")
                .enterDataToEmailField("test.t")
                .clickSubmitButton();
        String colorCode = getElemTextAreaPage().getTextBoxEmailError().getCssValue("border-color");
        String expectedColor = "rgb(33, 37, 41)";
        Assert.assertEquals(colorCode, expectedColor);
    }
}