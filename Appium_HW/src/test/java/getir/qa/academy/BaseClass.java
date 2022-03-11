package getir.qa.academy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public AndroidDriver<MobileElement> appiumDriver;
    public WebDriverWait wait;
    DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
    Boolean localAndroid=true;
    @BeforeTest
    public void setup() throws InterruptedException, MalformedURLException {
        if(localAndroid){
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.allandroidprojects.getirsample");
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.allandroidprojects.getirsample.startup.SplashActivity");
            appiumDriver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
            Thread.sleep(5000);

        }

    }
    @AfterTest
    public void tearDown(){
        appiumDriver.quit();
    }

}
