package getir.qa.academy.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailPage extends TouchActions{

    public ProductDetailPage(AppiumDriver<MobileElement> appiumDriver){
        super((AndroidDriver<MobileElement>) appiumDriver);

    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='$1,98']")
    MobileElement productprice;
    @AndroidFindBy(id="com.allandroidprojects.getirsample:id/text_action_bottom1")
    MobileElement addtoCart;

    public void checkProductprice(){checkText(productprice,"$1,98");}
    public void addtoCart (){click(addtoCart);}

}
