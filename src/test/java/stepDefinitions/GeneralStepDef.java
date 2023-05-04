package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.my_account_page.LoginPage;
import pages.my_account_page.MyAccountPage;
import pages.my_account_page.RegisterPage;
import utils.WaiterUtils;

public class GeneralStepDef {
    protected WebDriver driver = Hooks.getDriver();
    MyAccountPage myAccountPage = new MyAccountPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Then("LogOut button is present on the page")
    public void logoutButtonIsPresentOnThePage() {
        Assert.assertTrue(myAccountPage.getLogoutBtn().isDisplayed());
    }

    @And("User can click on LogOut button")
    public void logoutButtonIsClicked() {
        WaiterUtils.waitForElementToBeClicked(myAccountPage.getLogoutBtn()).click();
    }

    @And("User is redirected to the Login page")
    public void checkThatUserIsOnLoginPage() {
        Assert.assertTrue(loginPage.getTextLogin().isDisplayed());
    }
}
