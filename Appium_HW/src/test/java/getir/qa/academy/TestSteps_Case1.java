package getir.qa.academy;

import getir.qa.academy.pages.BasketPage;
import getir.qa.academy.pages.HomePage;
import getir.qa.academy.pages.OnboardPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSteps_Case1 extends BaseClass{
    BasketPage basketPage;
    HomePage homepage;
    OnboardPage onboardPage;

    /*
         CASE 1
        ● User checks all four screens appears at onboard
        ● User checks homepage exist
        ● User checks all six category pages are exist and items in them
        ● User checks empty cart and goes to latest category with shop now */
    @Test
    public void test1() throws InterruptedException {

        onboardPage = new OnboardPage(appiumDriver);
        onboardPage.checkHelloFoodText();
        onboardPage.clickNextButton();
        onboardPage.checkSnacksText();
        onboardPage.clickNextButton();
        onboardPage.checkGreatDiscountsText();
        onboardPage.clickNextButton();
        onboardPage.checkGroceriesintenMinutesText();
        onboardPage.clickNextButton();
        homepage =new HomePage(appiumDriver);
        homepage.checkHomePage();
        homepage.opensidebar();
        homepage.checkopeningsidebar();
        homepage.checksnackscategory_sidebar();
        homepage.checkelectronicscategory_sidebar();
        homepage.checkwatercategory_sidebar();
        homepage.checkhomecarecategory_sidebar();
        homepage.checkbabycarecategory_sidebar();
        homepage.checkfruitsandvegscategory_sidebar();
        homepage.navigateelectronicscategory_sidebar();
        homepage.opensidebar();
        homepage.navigatefruitsandvegscategory_sidebar();
        //buraya smaple items bos mu değil mi kontrol edebilirsin!!!
        basketPage =new BasketPage(appiumDriver);
        basketPage.clickbasketicon();
        basketPage.checkemptybasket();
        basketPage.clickShopNowbutton();
    }


}
