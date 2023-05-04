package hooks;

import common.CommonActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.*;

public class Hooks {
    protected static WebDriver driver;

    @Before
    public void setup() {
        driver = CommonActions.createWebDriver();
        driver.navigate().to("https://shop.demoqa.com/my-account/");
    }

    @After
    public void close() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
