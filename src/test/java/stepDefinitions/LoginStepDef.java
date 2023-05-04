package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.my_account_page.LoginPage;
import pages.my_account_page.MyAccountPage;
import pages.my_account_page.RegisterPage;
import hooks.Hooks;
import utils.WaiterUtils;

import java.time.Duration;

public class LoginStepDef {
    protected WebDriver driver = Hooks.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("My Account - Login page is open")
    public void openMyAccountPage() {
        Assert.assertTrue(loginPage.getTextLogin().isDisplayed());
    }

    @When("^Username field is populated with ([^\"]*)$")
    public void usernameIsPopulated(String username) {
        WaiterUtils.waitForVisibilityOfElement(loginPage.getTxtUsername()).sendKeys(username);
    }

    @And("^Password field is populated with ([^\"]*)$")
    public void passwordIsPopulated(String password) {
        WaiterUtils.waitForVisibilityOfElement(loginPage.getTxtPassword()).sendKeys(password);
    }

    @And("LoginButton button is clicked")
    public void loginbuttonButtonIsClicked() {
        WaiterUtils.waitForElementToBeClicked(loginPage.getLogInButton()).click();
    }

}
