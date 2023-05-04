package pages.my_account_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='u-column2 col-2']//h2[text()='Register']")
    WebElement textRegister;
    @FindBy(id = "reg_username")
    WebElement txtUsername;
    @FindBy(xpath = "//input[@name='email']")
    WebElement txtEmail;
    @FindBy(css = "input[id ='reg_password']")
    WebElement txtPassword;
    @FindBy(css = "button[value='Register']")
    WebElement registerButton;

    public WebElement getTextRegister() {
        return textRegister;
    }

    public WebElement getTxtUsername() {
        return txtUsername;
    }

    public WebElement getTxtEmail() {
        return txtEmail;
    }

    public WebElement getTxtPassword() {
        return txtPassword;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }
}