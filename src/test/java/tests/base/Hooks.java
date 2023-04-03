package tests.base;

import common.CommonActions;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import pages.my_account_page.LoginPage;
import pages.my_account_page.RegisterPage;

import static common.Config.CLEAR_COOKIES_AND_CASH;

public class Hooks {
    protected WebDriver driver = CommonActions.createWebDriver();
    protected LoginPage loginPage = new LoginPage(driver);
    protected RegisterPage registerPage = new RegisterPage(driver);

    @Before
    public void setup(){
        driver.get("https://shop.demoqa.com/my-account/");
    }

    @After
    public void close(){

    }

    @After
    public void clearCashAndCookies(){
        if(CLEAR_COOKIES_AND_CASH){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }


}
