package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.my_account_page.LoginPage;
import pages.my_account_page.MyAccountPage;
import pages.my_account_page.RegisterPage;
import utils.WaiterUtils;

public class RegisterStepDef {
    protected WebDriver driver = Hooks.getDriver();
    RegisterPage registerPage = new RegisterPage(driver);

    @Given("My Account - Register page is open")
    public void myAccountRegisterPageIsOpen() {
        Assert.assertTrue(registerPage.getTextRegister().isDisplayed());
    }

    @When("^User fills Username field with ([^\"]*)$")
    public void userFillsUsernameFieldWithUsername(String username) {
        WaiterUtils.waitForVisibilityOfElement(registerPage.getTxtUsername()).sendKeys(username);
    }

    @And("^User fills Email field with ([^\"]*)$")
    public void emailFieldIsPopulatedWithEmail(String email) {
        WaiterUtils.waitForVisibilityOfElement(registerPage.getTxtEmail()).sendKeys(email);
    }

    @And("^User fills Password field with ([^\"]*)$")
    public void userFillsPasswordFieldWithPassword(String password) {
        WaiterUtils.waitForVisibilityOfElement(registerPage.getTxtPassword()).sendKeys(password);
    }

    @And("Register button is clicked")
    public void registerButtonIsClicked() {
        WaiterUtils.waitForElementToBeClicked(registerPage.getRegisterButton()).click();
    }
}
