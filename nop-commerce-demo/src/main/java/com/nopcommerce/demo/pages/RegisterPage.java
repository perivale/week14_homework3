package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerlink;
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement radiobutton;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement fristname;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dataofbirth;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement dateofmonth;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement dateofyesr;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement conformpassword;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registercomplet;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continuebutton;
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registertext;


    public void clickonregisterlink() {
        clickOnElement(registerlink);
    }

    public void clickonradiobutton() {
        clickOnElement(radiobutton);
    }

    public void enterfristname(String fname) {
        sendTextToElement(fristname, fname);
    }

    public void enterlastname(String lname) {
        sendTextToElement(lastname, lname);
    }

    public void dropdowndateofbirth(String date) {
        sendTextToElement(dataofbirth, date);
    }

    public void dropdowndateofmoth(String months) {
        sendTextToElement(dateofmonth, months);
    }

    public void dropdowndateofyear(String yesy) {
        sendTextToElement(dateofyesr, yesy);
    }

    public void enteremail(String id) {
        sendTextToElement(email, id);
    }

    public void enterpassword(String password1) {
        sendTextToElement(password, password1);
    }

    public void enterconform(String conformpass) {
        sendTextToElement(conformpassword, conformpass);
    }

    public String textonrigetrfiled() {
        return getTextFromElement(registercomplet);
    }

    public void clickoncontinuebutton() {
        clickOnElement(continuebutton);
    }

    public String verifyregistertextcompleted() {
        return getTextFromElement(registercomplet);
    }

    public void clickonregisterbutton() {
        clickOnElement(registertext);
    }

    public String verifyfristname() {
        return getTextFromElement(fristname );

    }
    public String verifylastname() {
        return getTextFromElement(lastname);

    }
    public String verifypassword() {
        return getTextFromElement(password);

    }
    public String verifyconformpassword() {
        return getTextFromElement(conformpassword);

    }
    public String verifyregistertextonregisterpage() {
        return getTextFromElement(registertext);
    }

}
