package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Constants.Constant.TimeoutVariables.EXPLICIT_WAIT;
import static Constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public WebElement waitUntilElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void closeDriver(){
        driver.quit();
    }
}
