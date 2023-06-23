package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonsPage extends BasePage {

    private WebElement yesButton;
    private WebElement impressiveButton;
    private WebElement yesMessage;
    private WebElement impressiveMessage;

    public RadioButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getYesButton() {
        this.yesButton = getDriver().findElement(By.xpath("//label[contains(text(), 'Yes')]"));
        return yesButton;
    }

    public WebElement getImpressiveButton() {
        this.impressiveButton = getDriver().findElement(By.xpath("//label[contains(text(), 'Impressive')]"));
        return impressiveButton;
    }

    public WebElement getYesMessage() {
        this.yesMessage = getDriver().findElement(By.xpath("//span[contains(text(), 'Yes')]"));
        return yesMessage;
    }

    public WebElement getImpressiveMessage() {
        this.impressiveMessage = getDriver().findElement(By.xpath("//span[contains(text(), 'Impressive')]"));
        return impressiveMessage;
    }

    public RadioButtonsPage clickYesButton() {
        getYesButton().click();
        return this;
    }

    public RadioButtonsPage clickImpressiveButton() {
        getImpressiveButton().click();
        return this;
    }

    public RadioButtonsPage open() {
        getDriver().get("https://demoqa.com/radio-button");
        return this;
    }

}
