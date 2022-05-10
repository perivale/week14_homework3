package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktoptext;

    @FindBy(xpath = "//span[contains(text(),'Sort by')]")
    WebElement sortby;
    @FindBy(xpath = "//span[contains(text(),'Display')]")
    WebElement disply;

    public void clickondesktoptext() {
        clickOnElement(desktoptext);
    }

    public void clickonsortbytext() {
        clickOnElement(sortby);
    }

    public void clickondisplytext() {
        clickOnElement(disply);

    }
    public String verifydesktoptext(){
        return getTextFromElement(desktoptext);

    }
}