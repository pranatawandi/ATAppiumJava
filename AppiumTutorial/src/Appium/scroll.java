package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scroll extends Base {

public static void main(String[] args) throws MalformedURLException {
    // TODO Auto-generated method stub
    
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));");

}
}