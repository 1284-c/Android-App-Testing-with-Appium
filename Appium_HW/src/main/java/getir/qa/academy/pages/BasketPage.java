package getir.qa.academy.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BasketPage extends TouchActions {

    public BasketPage(AppiumDriver<MobileElement> appiumDriver){
        super((AndroidDriver<MobileElement>) appiumDriver);

    }

  @AndroidFindBy(id="com.allandroidprojects.getirsample:id/action_cart")
  MobileElement basketicon;
  @AndroidFindBy(id="com.allandroidprojects.getirsample:id/tvInfo")
  MobileElement emptycart;
  @AndroidFindBy(id="com.allandroidprojects.getirsample:id/bAddNew")
  MobileElement ShopNowinEmptyCart;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='$1,98']")
  MobileElement productpriceinbasket;
  @AndroidFindBy(id="com.allandroidprojects.getirsample:id/text_action_bottom1")
  MobileElement totalamount;
  @AndroidFindBy(id="com.allandroidprojects.getirsample:id/layout_action1")
  MobileElement delete;

  public void clickbasketicon(){click(basketicon);}
  public void checkbasketicon(){waitForVisibility(basketicon);}
  public void checkemptybasket(){waitForVisibility(emptycart);}
  public void clickShopNowbutton(){click(ShopNowinEmptyCart);}
  public void checkproductpriceandtoalbasketamount(){checkText(productpriceinbasket,totalamount.getText());}
  public void removeproductfromcart(){click(delete);}
  public void checkremovedproduct(){checkText(totalamount, "$0.00");}
}
