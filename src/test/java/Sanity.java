import PageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sanity extends BaseTest {

    MainPage mainPage;

    @BeforeMethod
    public void initTest() {
        mainPage = new MainPage(driver);
    }

    @Test
    public void t01() {
        Assert.assertEquals(mainPage.getAnimationText(), "Exceptional living\n" + "redefined.");
    }
}
