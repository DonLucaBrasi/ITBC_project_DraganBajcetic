package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WidgetsAccordianTests extends BaseTests {

    @Test
    public void verifyPageWillLoad() {
        getWidgetsAccordianPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("accordian"));
    }

    @Test
    public void verifyUserCanClickAllButtons() {
        getDriver().manage().window().maximize();
        getWidgetsAccordianPage().open()
                .clickWhatButton()
                .clickWhereButton()
                .clickWhyButton();
        Assert.assertTrue(getWidgetsAccordianPage().getWhere().isEnabled());
    }

    @Test
    public void verifyContentIsShownOnButtonClick() {
        getDriver().manage().window().maximize();
        getWidgetsAccordianPage().open()
                .clickWhereButton();
        Assert.assertTrue(getWidgetsAccordianPage().getWhereC().isDisplayed());
    }
}
