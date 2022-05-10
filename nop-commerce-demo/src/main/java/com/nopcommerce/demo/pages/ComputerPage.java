package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class ComputerPage extends Utility {

    public ComputerPage() {
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktoplink;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement notebook;
    @FindBy(xpath = "//body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[3]")
    WebElement software;
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computertext;


    public void clickondesktoplink(){
        clickOnElement(desktoplink);
    }
    public void clickonnotebooklink(){
        clickOnElement(notebook);
    }
    public void clickonsoftwarelink(){
        clickOnElement(software);}
        public String verifycoputertext(){
            return getTextFromElement(computertext);

        }
    }

