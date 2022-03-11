package getir.qa.academy;

import getir.qa.academy.pages.BasketPage;
import getir.qa.academy.pages.HomePage;
import getir.qa.academy.pages.OnboardPage;
import getir.qa.academy.pages.ProductDetailPage;
import org.testng.annotations.Test;

public class TestSteps_Case3 extends BaseClass{

    BasketPage basketPage;
    HomePage homepage;
    OnboardPage onboardPage;
    ProductDetailPage productDetailPage;
    /*
     CASE 3
    ● User checks all four screens appears at onboard
    ● User checks homepage exist
    ● User adds random product to favorite
    ● User remove product from favorites by clicking again
    ● User checks wishlist is empty
     */
    @Test
    public void test3() throws InterruptedException{
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
        homepage.selectProducttoaddtofav();
        // double click ile unfav olmuyor
        homepage.opensidebar();
        homepage.swipesidebar();
        homepage.clickmywishlist();
        homepage.checkproductinwishlist();
        homepage.removeproductfromwishlist();
        homepage.checkproductinwishlist();


    }
}
