package getir.qa.academy.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAccessibilityId;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;
import java.util.Random;

public class HomePage extends TouchActions {
    public HomePage(AppiumDriver<MobileElement> appiumDriver){
        super((AndroidDriver<MobileElement>) appiumDriver);

    }
    @AndroidFindBy(xpath="//android.widget.TextView[@text='GetirSample']")
    MobileElement getirsample;
    @AndroidFindBy(accessibility="Open navigation drawer")
    MobileElement hamburgericon;
    @AndroidFindBy(id="com.allandroidprojects.getirsample:id/imageView")
    MobileElement imageview;
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Snacks']")
    MobileElement Snacks;
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Electronics']")
    MobileElement Electronics;
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Water']")
    MobileElement Water;
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Home Care']")
    MobileElement HomeCare;
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Baby Care']")
    MobileElement BabyCare;
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Fruits & Veg']")
    MobileElement FruitsandVeg;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='ELECTRONICS']")
    MobileElement ElectronicsToolbar;

    @AndroidFindBy(className = "android.widget.FrameLayout")
    List<MobileElement> items;

    @AndroidFindBy(xpath = "//*[@resource-id='com.allandroidprojects.getirsample:id/ic_wishlist']")
    List<MobileElement> wishlistitems;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='My Wishlist']")
    MobileElement  MyWishlist;
    @AndroidFindBy(id = "com.allandroidprojects.getirsample:id/ic_wishlist")
    MobileElement deleteproductinwishlist;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Sample Item']")
    List<MobileElement>  checkproductinwishlist;

    public void checkHomePage(){waitForVisibility(getirsample);}
    public void opensidebar(){click(hamburgericon);}
    public void checkopeningsidebar(){waitForVisibility(imageview);}
    public void checksnackscategory_sidebar(){waitForVisibility(Snacks);}
    public void navigatesnackscategory_sidebar(){click(Snacks);}
   // public void navigatesnackscategory_toolbar(){click(SnacksToolbar);}
    public void checkelectronicscategory_sidebar(){waitForVisibility(Electronics);}
    public void navigateelectronicscategory_sidebar(){click(Electronics);}
    public void navigateelectronicscategory_toolbar(){click(ElectronicsToolbar);}
    public void checkwatercategory_sidebar(){waitForVisibility(Water);}
    public void navigatewatercategory_sidebar(){click(Water);}
   // public void navigatewatercategory_toolbar(){click(WaterToolbar);}
    public void checkhomecarecategory_sidebar(){waitForVisibility(HomeCare);}
    public void navigatehomecarecategory_sidebar(){click(HomeCare);}
  //  public void navigatehomecarecategory_toolbar(){click(HomeCareToolbar);}
    public void checkbabycarecategory_sidebar(){waitForVisibility(BabyCare);}
    public void navigatebabycarecategory_sidebar(){click(BabyCare);}
   // public void navigatebabycarecategory_toolbar(){click(BabyCareToolbar);}
    public void checkfruitsandvegscategory_sidebar(){waitForVisibility(FruitsandVeg);}
    public void navigatefruitsandvegscategory_sidebar(){click(FruitsandVeg);}
   // public void navigatefruitsandvegscategory_toolbar(){click(FruitsandVegToolbar);}
    public void clickmywishlist(){click(MyWishlist);}
    public void swipesidebar(){swipe(DIRECTION.DOWN);}
    public void removeproductfromwishlist(){click(deleteproductinwishlist);}


    public void selectProduct(){
        Random random =new Random();
        int randomNumber=random.nextInt(items.size());
        items.get(randomNumber).click();
    }

    public void selectProducttoaddtofav() {
        Random random = new Random();
        int randomNumber = random.nextInt(wishlistitems.size());
        for (int i = 1; i < 2; i++) {
            wishlistitems.get(randomNumber).click();
        }
    }
    public void checkproductinwishlist()
    {
        if(checkproductinwishlist.size()==0) {
            System.out.println("Wishlist Screen is empty");
        }
        else
            System.out.println("Wishlist Screen is NOT empty");

    }


}
