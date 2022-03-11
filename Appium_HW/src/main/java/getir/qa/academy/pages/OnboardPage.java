package getir.qa.academy.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnboardPage extends TouchActions {
    public OnboardPage(AppiumDriver<MobileElement>appiumDriver){
        super((AndroidDriver<MobileElement>) appiumDriver);

    }

    @AndroidFindBy(id="com.allandroidprojects.getirsample:id/btn_skip")
    MobileElement skipbutton;
    @AndroidFindBy(id="com.allandroidprojects.getirsample:id/btn_next")
    MobileElement nextbutton;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Hello Food!']")
    MobileElement hellofood;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Snacks']")
    MobileElement snacks;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Great Discounts']")
    MobileElement greatdiscounts;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Groceries in 10 Minutes']")
    MobileElement groceriesintenminutes;
    public void clickSkipButton(){click(skipbutton);}
    public void clickNextButton(){click(nextbutton);}
    public void checkHelloFoodText(){waitForVisibility(hellofood);}
    public void checkSnacksText(){waitForVisibility(snacks);}
    public void checkGreatDiscountsText(){waitForVisibility(greatdiscounts);}
    public void checkGroceriesintenMinutesText(){waitForVisibility(groceriesintenminutes);}











}
