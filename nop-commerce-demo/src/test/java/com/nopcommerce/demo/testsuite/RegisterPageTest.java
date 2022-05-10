package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends TestBase {
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        registerPage = new RegisterPage();
    }

    @Test(groups = "sanity")
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        registerPage.clickonregisterlink();
        String expected = "Register";
        String actual = registerPage.verifyregistertextonregisterpage();
        Assert.assertEquals(expected, actual, "verifytext");
    }

    @Test(groups = {"smoke", "sanity"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(
    ) {
        SoftAssert softAssert = new SoftAssert();
        registerPage.clickonregisterlink();
        registerPage.clickonregisterbutton();
        String expectedname = "First name is required.";
        String actualname = registerPage.verifyfristname();
        softAssert.assertEquals(expectedname, actualname, "verify the fristname is reqried");
        String expectedlastname = "Last name is required.";
        String actuallastname = registerPage.verifylastname();
        softAssert.assertEquals(expectedlastname, actuallastname, "verify the lastname is reqried");
        String expectedpassword="Password is required";
        String actualpassword=registerPage.verifypassword();
        softAssert.assertEquals(expectedpassword,actualpassword,"verify the password text");
        String expectedconpasswordtext="Password is required";
        String actualconpasswordtext=registerPage.verifyconformpassword();
        softAssert.assertEquals(expectedconpasswordtext,actualconpasswordtext,"verify the conform password text");
        softAssert.assertAll();

    }

    @Test(groups = {"smoke", "sanity", "regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        registerPage.clickonregisterlink();
        registerPage.clickonradiobutton();
        registerPage.enterfristname("shilpa");
        registerPage.enterlastname("patel");
        registerPage.dropdowndateofbirth("02");
        registerPage.dropdowndateofmoth("April");
        registerPage.dropdowndateofyear("1998");
        registerPage.enteremail("shilpa2_@gmail.com");
        registerPage.enterpassword("123456");
        registerPage.enterconform("123456");
        registerPage.clickonregisterbutton();
        String expected = "Your registration completed";
        String actual = registerPage.verifyregistertextcompleted();
        Assert.assertEquals(expected, actual, "verify the message");

    }

}