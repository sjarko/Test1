import conf.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Ярослав on 29.11.2014.
 */
public class BaseTest extends Base {

    @Test
    public void firstTest() {
        WebElement buttonTest = getDriver().findElement(By.className("top-picks-six-title"));
        String test = buttonTest.getText();
        System.out.print(test);
        Assert.assertEquals(test, "Browse these stores for more great offers", "ASSERT EQ");
        Assert.assertTrue(!test.isEmpty(), "ASSERT TRUE");
        Assert.assertFalse(test.isEmpty(), "ASSERT FALSE");
    }
}
