package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTests extends BaseTests {

    @Test
    public void verifyPageWillLoad() {
        getRadioButtonsPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("radio-button"));
    }

    @Test
    public void verifyYesButton() {
        getRadioButtonsPage().open()
                .clickYesButton();
        Assert.assertTrue(getRadioButtonsPage().getYesMessage().isDisplayed());
    }

    @Test
    public void verifyImpressiveButton() {
        getRadioButtonsPage().open()
                .clickImpressiveButton();
        Assert.assertTrue(getRadioButtonsPage().getImpressiveMessage().isDisplayed());
    }
}
