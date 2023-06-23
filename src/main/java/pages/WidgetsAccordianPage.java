package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetsAccordianPage extends BasePage {

    private WebElement what;
    private WebElement where;
    private WebElement why;
    private WebElement whatC;
    private WebElement whereC;
    private WebElement whyC;

    public WidgetsAccordianPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getWhat() {
        this.what = getDriver().findElement(By.id("section1Heading"));
        return what;
    }

    public WebElement getWhere() {
        this.where = getDriver().findElement(By.id("section2Heading"));
        return where;
    }
    public WebElement getWhy() {
        this.why = getDriver().findElement(By.id("section3Heading"));
        return why;
    }
    public WebElement getWhatC() {
        this.whatC = getDriver().findElement(By.id("section1Content"));
        return whatC;
    }

    public WebElement getWhereC() {
        this.whereC = getDriver().findElement(By.id("section2Content"));
        return whereC;
    }
    public WebElement getWhyC() {
        this.whyC = getDriver().findElement(By.id("section3Content"));
        return whyC;
    }

    public WidgetsAccordianPage clickWhatButton() {
        getWhat().click();
        return this;
    }
    public WidgetsAccordianPage clickWhereButton() {
        getWhere().click();
        return this;
    }
    public WidgetsAccordianPage clickWhyButton() {
        getWhy().click();
        return this;
    }

    public WidgetsAccordianPage open() {
        getDriver().get("https://demoqa.com/accordian");
        return this;
    }
}
