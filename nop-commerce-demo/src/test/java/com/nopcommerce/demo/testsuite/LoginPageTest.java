package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginpage;
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginpage = new LoginPage();
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }


    @Test(groups = "sanity")
    public void userShouldNavigateToLoginPageSuccessFully() {
        loginpage.clickonloginlink();
        String expected = "Welcome, Please Sign In!";
        String actual = loginpage.welcometextonloginpage();
        Assert.assertEquals(expected, actual);
    }

    @Test(groups = {"sanity","smoke"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        loginpage.clickonloginlink();
        loginpage.enteremailid("shilpa2_@gmail.com");
        loginpage.enterpassword("123456");
        loginpage.clickonloginbottuon();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String Actualtext = loginpage.verifyerrormessage();
        // loginpage.welcometextonloginpage();
    }

    @Test(groups = "smoke")
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        loginpage.clickonloginlink();
        loginpage.enteremailid("shilpa2_@gmail.com");
        loginpage.enterpassword("123456");
        loginpage.clickonloginbottuon();
        String expectedrusults = "Logout";
        String actualresult = loginpage.verifyLogoutbutton();
        Assert.assertEquals(expectedrusults, actualresult, "verify the logout button");

    }

    @Test(groups = {"smoke","regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
        loginpage.clickonloginlink();
        loginpage.enteremailid("shilpa2_@gmail.com");
        loginpage.enterpassword("123456");
        loginpage.clickonloginbottuon();
        loginpage.clickonloginbottuon();
        String expectedloginlink = "Log in";
        String actualloginlink = loginpage.verifyloginlink();
        Assert.assertEquals(expectedloginlink, actualloginlink, "verify the logintext");

    }

}

























