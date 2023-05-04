package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import hooks.Hooks;

import java.time.Duration;

public class WaiterUtils {
    protected static WebDriver driver = Hooks.getDriver();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public static WebElement waitForVisibilityOfElement(WebElement element) {
        WebElement elementToBeReturned = wait.until(ExpectedConditions.visibilityOf(element));
        return elementToBeReturned;
    }

    public static WebElement waitForElementToBeClicked(WebElement element) {
        WebElement elementToBeReturned = wait.until(ExpectedConditions.elementToBeClickable(element));
        return elementToBeReturned;
    }
}
