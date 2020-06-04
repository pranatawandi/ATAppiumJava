package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome {

public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
    // TODO Auto-generated method stub

    //Appium code
    
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "cbce97bd");
    //cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
    cap.setCapability("chromedriverExecutable", "/Users/macbook/node_modules/chromedriver/bin/chromedriver");
    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
    AndroidDriver<AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"),cap);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
}
}