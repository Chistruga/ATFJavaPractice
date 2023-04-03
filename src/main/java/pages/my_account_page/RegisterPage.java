package pages.my_account_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private final By username = By.id("reg_username");
    private final By email = By.xpath("//input[@name='email']");
    private final By password = By.cssSelector("input[id ='reg_password']");
    private final By registerButton = By.cssSelector("button[value='Register']");

    public RegisterPage clickToRegisterButton() {
        driver.findElement(registerButton).click();
        return this;
    }
}