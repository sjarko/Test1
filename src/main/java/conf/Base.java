package conf;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Ярослав on 29.11.2014.
 */
public class Base {
    private static final String BASE_URL = "http://www.retailmenot.com/";
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "e:\\install\\Automation\\chromedriver_win32\\chromedriver.exe");
        setDriver(new ChromeDriver());
//        driver = new FirefoxDriver();
        getDriver().get(BASE_URL);
    }

    @AfterTest
    private void tearDown() {
        this.driver.close();
    }
}
