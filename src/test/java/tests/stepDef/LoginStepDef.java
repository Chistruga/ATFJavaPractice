package tests.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.my_account_page.LoginPage;

public class LoginStepDef {
    WebDriver driver;
    LoginPage loginPage = new LoginPage(driver);
    @Given("My Account - page is open")
    public void openMyAccountPage(){
        driver.get("https://shop.demoqa.com/my-account/");
    }

    @When("<Username> is populated with {username}")
    public void usernameIsPopulatedWith(By username) {
    }

    @And("<Password> is populated with {password}")
    public void passwordIsPopulated(String password) {
    }

    @And("<LoginButton> button is clicked")
    public void loginbuttonButtonIsClicked() {
    }

    @Then("User is successfully logged")
    public void userIsSuccessfullyLogged() {
    }
}
