package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElemTextAreaPage extends BasePage {

    private WebElement fullName;
    private WebElement email;
    private WebElement currentAddress;
    private WebElement permanentAddress;
    private WebElement submitButton;
    private WebElement textBoxPageConfirm;
    private WebElement textBoxEmailError;

    public ElemTextAreaPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFullName() {
        this.fullName = getDriver().findElement(By.id("userName"));
        return fullName;
    }

    public WebElement getEmail() {
        this.email = getDriver().findElement(By.id("userEmail"));
        return email;
    }

    public WebElement getCurrentAddress() {
        this.currentAddress = getDriver().findElement(By.id("currentAddress"));
        return currentAddress;
    }

    public WebElement getPermanentAddress() {
        this.permanentAddress = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddress;
    }

    public WebElement getSubmitButton() {
        this.submitButton = getDriver().findElement(By.id("submit"));
        return submitButton;
    }

    public WebElement getTextBoxPageConfirm() {
        this.textBoxPageConfirm = getDriver().findElement(By.xpath("//*[@id=\"output\"]/div"));
        //this.textBoxPageConfirm = getDriver().findElement(By.name("//*[@id=\"output\"]/div")).getCssValue();
        return textBoxPageConfirm;
    }

    public WebElement getTextBoxEmailError() {
        this.textBoxEmailError = getDriver().findElement(By.xpath("//*[@id=\"userEmail-wrapper\"]/div[2]"));
        return textBoxEmailError;
    }

    public ElemTextAreaPage enterDataToFullNameField(String text) {
        getFullName().sendKeys(text);
        return this;
    }

    public ElemTextAreaPage enterDataToEmailField(String text) {
        getEmail().sendKeys(text);
        return this;
    }

    public ElemTextAreaPage enterDataToCurrentAddressField(String text) {
        getCurrentAddress().sendKeys(text);
        return this;
    }

    public ElemTextAreaPage enterDataToPermanentAddressField(String text) {
        getPermanentAddress().sendKeys(text);
        return this;
    }

    public ElemTextAreaPage clickSubmitButton() {
        getSubmitButton().click();
        return this;
    }

    public ElemTextAreaPage open() {
        getDriver().get("https://demoqa.com/text-box");
        return this;
    }
}
