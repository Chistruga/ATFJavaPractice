package common;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static Constants.Constant.TimeoutVariables.IMPLICIT_WAIT;
import static common.Config.BROWSER_FOR_TEST_RUNNING;
import static dev.failsafe.internal.util.Assert.isTrue;

public class CommonActions {
    public static WebDriver createWebDriver() {
        WebDriver driver = null;

        switch (BROWSER_FOR_TEST_RUNNING) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                System.setProperty("chromedriver.chrome.driver", "src/main/resources/chromedriver.exe");
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            default:
                isTrue(false, "Incorrect Browser Name! " + BROWSER_FOR_TEST_RUNNING);
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
