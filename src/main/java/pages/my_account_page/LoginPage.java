package pages.my_account_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='u-column1 col-1']//h2[text()='Login']")
    WebElement textLogin;

    @FindBy(id = "username")
    WebElement txtUsername;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@value='Log in']")
    WebElement logInButton;

    public WebElement getTxtUsername() {
        return txtUsername;
    }

    public WebElement getTxtPassword() {
        return txtPassword;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    public WebElement getTextLogin() {
        return textLogin;
    }

    public void enterUsername(String username) {
        txtUsername.sendKeys(username);
    }
}
