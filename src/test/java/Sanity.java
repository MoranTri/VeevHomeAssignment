import PageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class Sanity extends BaseTest {

    MainPage mainPage;

    @BeforeMethod
    public void initTest() {
        mainPage = new MainPage(driver);
    }

    @Test
    public void t01() {
        System.out.println("first test");
        Assert.assertEquals(mainPage.getAnimationText(), "Exceptional living\n" + "redefined.");
    }
}
