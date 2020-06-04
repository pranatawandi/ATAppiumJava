package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class E_Test1 extends ecommerce {

public static void main(String[] args) throws MalformedURLException {
    // TODO Auto-generated method stub
    
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
    //if this syntax does not work you can use this below
    //  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     
    driver.findElementByXPath("//android.widget.TextView[@text='Argentina']").click();
    
    driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
    driver.hideKeyboard();
    
    driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
    
    driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

}
}

