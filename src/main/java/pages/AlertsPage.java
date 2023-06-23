package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage {
    private WebElement alertButton;
    private WebElement confirmButton;
    private WebElement alertButtonConfirm;

    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getAlertButton() {
        this.alertButton = getDriver().findElement(By.id("alertButton"));
        return alertButton;
    }

    public WebElement getConfirmButton() {
        this.confirmButton = getDriver().findElement(By.id("confirmButton"));
        return confirmButton;
    }

    public WebElement getAlertButtonConfirm() {
        this.alertButtonConfirm = getDriver().findElement(By.id("confirmResult"));
        return alertButtonConfirm;
    }

    public AlertsPage clickAlertButton() {
        getAlertButton().click();
        return this;
    }

    public AlertsPage clickConfirmButton() {
        getConfirmButton().click();
        return this;
    }

    public AlertsPage open() {
        getDriver().get("https://demoqa.com/alerts");
        return this;
    }


}
