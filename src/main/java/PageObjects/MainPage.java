package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    //Elements:
    @FindBy(css = ".pageheader__heading")
    protected WebElement animationText;

    //Methods:
    public String getAnimationText() {
        return getText(animationText);
    }
}
