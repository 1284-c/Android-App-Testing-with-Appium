package getir.qa.academy;

import getir.qa.academy.pages.BasketPage;
import getir.qa.academy.pages.HomePage;
import getir.qa.academy.pages.OnboardPage;
import getir.qa.academy.pages.ProductDetailPage;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.Test;

public class TestSteps_Case2 extends BaseClass{
    BasketPage basketPage;
    HomePage homepage;
    OnboardPage onboardPage;
    ProductDetailPage productDetailPage;
    /*
     CASE 2
    ● User passes onboarding screen
    ● User check homepage exist
    ● User changes category to electronics
    ● User opens random product at the category (open latest product if you able to)
    ● User checks price of the product
    ● User adds item to cart
    ● User checks cart total amount is same with item’s price
    ● User remove all products at the cart
     */
    @Test
    public void test2() throws InterruptedException{
        onboardPage = new OnboardPage(appiumDriver);
       // appiumDriver.navigate().refresh();
        onboardPage.checkHelloFoodText();
        onboardPage.clickSkipButton();
        homepage =new HomePage(appiumDriver);
        homepage.checkHomePage();
        homepage.navigateelectronicscategory_toolbar();
        homepage.selectProduct();
        productDetailPage =new ProductDetailPage(appiumDriver);
        productDetailPage.checkProductprice();
        productDetailPage.addtoCart();
        appiumDriver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        basketPage =new BasketPage(appiumDriver);
        basketPage.checkbasketicon();
        basketPage.clickbasketicon();
        basketPage.checkproductpriceandtoalbasketamount();
        basketPage.removeproductfromcart();
        basketPage.checkremovedproduct();


    }

}
