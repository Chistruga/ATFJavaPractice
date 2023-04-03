package common;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static Constants.Constant.TimeoutVariables.IMPLICIT_WAIT;
import static common.Config.BROWSER_FOR_TEST_RUNNING;

public class CommonActions {
    public static WebDriver createWebDriver() {
        WebDriver driver = null;

        switch (BROWSER_FOR_TEST_RUNNING) {
            case "chrome":
                System.setProperty("chromedriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                Assert.isTrue(false, "Incorrect Browser Name!" + BROWSER_FOR_TEST_RUNNING);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
