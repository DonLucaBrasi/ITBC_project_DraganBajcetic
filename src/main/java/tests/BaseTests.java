package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.time.Duration;

public class BaseTests {
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage loginPage;
    private ElemTextAreaPage elemTextAreaPage;
    private WidgetsAccordianPage widgetsAccordianPage;
    private AlertsPage alertsPage;
    private ButtonsPage buttonsPage;
    private RadioButtonsPage radioButtonsPage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Jelena//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver, wait);
        elemTextAreaPage = new ElemTextAreaPage(driver, wait);
        widgetsAccordianPage = new WidgetsAccordianPage(driver, wait);
        alertsPage = new AlertsPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        radioButtonsPage = new RadioButtonsPage(driver, wait);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public ElemTextAreaPage getElemTextAreaPage() {
        return elemTextAreaPage;
    }

    public WidgetsAccordianPage getWidgetsAccordianPage() {
        return widgetsAccordianPage;
    }

    public AlertsPage getAlertsPage() {
        return alertsPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public RadioButtonsPage getRadioButtonsPage() {
        return radioButtonsPage;
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
