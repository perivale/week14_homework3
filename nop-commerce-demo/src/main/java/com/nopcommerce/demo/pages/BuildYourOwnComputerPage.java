package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildyourowncom;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processercdropdown;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramdropdown;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement radiobutton;
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osbutton;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement software;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addtocart;
    @FindBy(xpath="//p[contains(text(),'The product has been added to your shopping cart')]")
WebElement verifytext2;
    public void buildyoutowncomputer() {
        clickOnElement(buildyourowncom);
    }

    public void proseccesdropdownmenu(String processor)

    {sendTextToElement(processercdropdown,processor);
    }

    public void ramradiobutton(String ram) {
        sendTextToElement(ramdropdown,ram);
    }

    public void radioobutton(String radiobutto) {
        sendTextToElement(radiobutton,radiobutto);
    }

    public void clickonosbutton(String osbutton1) {
        sendTextToElement(osbutton,osbutton1);
    }

    public void clickonsoftware(String softwser) {
        sendTextToElement(software,softwser);
    }

    public void addtocart() {
        clickOnElement(addtocart);
    }
    public String verifyTextOnFiled(){
        return getTextFromElement(verifytext2);

    }


}
