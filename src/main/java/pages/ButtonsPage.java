package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage {

    private WebElement doubleClickMe;
    private WebElement rightClickMe;
    private WebElement clickMe;
    private WebElement doubleClickMessage;
    private WebElement rightClickMessage;
    private WebElement clickMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickMe() {
        this.doubleClickMe = getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickMe;
    }

    public WebElement getRightClickMe() {
        this.rightClickMe = getDriver().findElement(By.id("rightClickBtn"));
        return rightClickMe;
    }

    public WebElement getClickMe() {
        this.clickMe = getDriver().findElement(By.xpath("//button[text() ='Click Me']"));
        return clickMe;
    }

    public WebElement getDoubleClickMessage() {
        this.doubleClickMessage = getDriver().findElement(By.id("doubleClickMessage"));
        return doubleClickMessage;
    }

    public WebElement getRightClickMessage() {
        this.rightClickMessage = getDriver().findElement(By.id("rightClickMessage"));
        return rightClickMessage;
    }

    public WebElement getClickMessage() {
        this.clickMessage = getDriver().findElement(By.id("dynamicClickMessage"));
        return clickMessage;
    }

    public ButtonsPage clickMeButton() {
        getClickMe().click();
        return this;
    }

    public ButtonsPage open() {
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }

}
