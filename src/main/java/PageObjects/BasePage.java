package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected JavascriptExecutor js;
    protected WebDriverWait wait;
    protected final int waitDuration = 30;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    //Ui Actions
    protected void click(WebElement el) {
        waitForElementToBeClickable(el);
        el.click();
    }

    protected String getText(WebElement el) {
        waitForElementToBeVisibility(el);
        return el.getText();
    }

    protected void writeText(WebElement el, String text) {
        waitForElementToBeVisibility(el);
        el.sendKeys(text);
    }

    //Wait's
    protected void waitForElementToBeClickable(WebElement el) {
        wait = new WebDriverWait(driver, waitDuration);
        wait.until(ExpectedConditions.elementToBeClickable(el));
    }

    protected void waitForElementToBeVisibility(WebElement el) {
        wait = new WebDriverWait(driver, waitDuration);
        wait.until(ExpectedConditions.visibilityOf(el));
    }
}
