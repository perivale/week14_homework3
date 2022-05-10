package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginlink;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @FindBy(id="Password")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginbutton;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcometext;
    @FindBy(xpath = "//div[@class=\"message-error validation-summary-errors\"]")
    WebElement verifyerrormess;
    @FindBy (id="Log out")
    WebElement logoutbutton;




    public void clickonloginlink(){
        clickOnElement(loginlink);
    }public void enteremailid(String id){
        sendTextToElement(email,id);
    }
    public void enterpassword(String password1){
        sendTextToElement(password,password1);
    }
    public void clickonloginbottuon(){
        clickOnElement(loginbutton);
    }
    public String welcometextonloginpage(){
        return getTextFromElement(welcometext);
    }
    public String verifyerrormessage(){
        return getTextFromElement(verifyerrormess);
    }
    public String verifyLogoutbutton(){
        return getTextFromElement(logoutbutton);

    }public void clickonlogoutbutton(){
        clickOnElement(logoutbutton);
    }
    public String verifyloginlink(){
       return getTextFromElement(loginlink);
    }

}
