package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends Base {

public static void main(String[] args) throws MalformedURLException {
    // TODO Auto-generated method stub
    
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //xpath id ClassName
     /*
      *    xpath syntax
      *    //tagname[@attribute='value']
      */
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]").click();
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]").click();
    driver.findElementById("android:id/checkbox").click();
    driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
    driver.findElementById("android:id/edit").sendKeys("Hello My Name is Wandi");
    driver.findElementById("android:id/button1").click();
}
}