package pages.my_account_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By logInButton = By.xpath("//button[@value='Log in']");

    public LoginPage clickToCreateAnAccount(){
        driver.findElement(logInButton).click();
        return this;
    }

}
