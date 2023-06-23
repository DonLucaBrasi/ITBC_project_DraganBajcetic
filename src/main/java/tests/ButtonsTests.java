package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTests {

    @Test
    public void verifyPageWillLoad() {
        getButtonsPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("buttons"));
    }

    @Test
    public void verifyDoubleClick() {
        Actions actions = new Actions(getDriver());
        getButtonsPage().open();
        actions.doubleClick(getButtonsPage().getDoubleClickMe()).perform();
        Assert.assertTrue(getButtonsPage().getDoubleClickMessage().isDisplayed());
    }

    @Test
    public void verifyRightClick() {
        Actions actions = new Actions(getDriver());
        getButtonsPage().open();
        actions.contextClick(getButtonsPage().getRightClickMe()).perform();
        Assert.assertTrue(getButtonsPage().getRightClickMessage().isDisplayed());
    }

    @Test
    public void verifyDynamicClick() {
        getButtonsPage().open()
                .clickMeButton();
        Assert.assertTrue(getButtonsPage().getClickMessage().isDisplayed());
    }


}
