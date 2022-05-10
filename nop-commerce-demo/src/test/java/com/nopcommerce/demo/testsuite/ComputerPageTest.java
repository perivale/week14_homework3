package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ComputerPageTest extends TestBase {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;



    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        computerPage=new ComputerPage();
        homePage=new HomePage();
        desktopsPage=new DesktopsPage();
        buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    }


    @Test(groups = "sanity")
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        SoftAssert softAssert=new SoftAssert();
       homePage.clickoncomputerlink();
       String expectedtext="Computers";
      String actual= computerPage.verifycoputertext();
      softAssert.assertEquals(expectedtext,actual,"verify the text");
      softAssert.assertAll();

    }
    @Test(groups = "smoke")
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.clickoncomputerlink();
        desktopsPage.clickondesktoptext();
        String expectedtext="Desktops";
        String actualtext=desktopsPage.verifydesktoptext();
        Assert.assertEquals(expectedtext,actualtext);


    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
        homePage.clickoncomputerlink();
        computerPage.clickondesktoplink();
        buildYourOwnComputerPage.buildyoutowncomputer();
        buildYourOwnComputerPage.proseccesdropdownmenu(processor);
        buildYourOwnComputerPage.ramradiobutton(ram);
        buildYourOwnComputerPage.radioobutton(hdd);
        buildYourOwnComputerPage.clickonosbutton(os);
        buildYourOwnComputerPage.clickonsoftware(software);
        buildYourOwnComputerPage.addtocart();
        String expectedtextverify = "The product has been added to your shopping cart";
        String actualtextverify = buildYourOwnComputerPage.verifyTextOnFiled();
        Assert.assertEquals( expectedtextverify,actualtextverify,"verify the text" );



    }


}