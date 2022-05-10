package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computer;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electronics;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement appreals;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement digitalsdownloads;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement books;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
    WebElement jeweary;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftcard;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerlink;
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement weblogo;
    public void clickoncomputerlink(){
        clickOnElement(computer);
    }
    public void clickonelectricslink(){
        clickOnElement(electronics);
    }
    public void clickonapprealslink(){
        clickOnElement(appreals);
    }
    public void clickondigitaldownloadrlink(){
        clickOnElement(digitalsdownloads);
    }
    public void clickonbookslink(){
        clickOnElement(books);
    }  public void clickonjewerlylink() {
        clickOnElement(jeweary);
    }
    public void clickongiftcardlink() {
        clickOnElement(giftcard);
    }
    public void clickonregisterlink(){
        clickOnElement(registerlink);
    }
    public void clickonlogo(){
        clickOnElement(weblogo);
    }

}
