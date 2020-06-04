package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiautotest extends Base {

public static void main(String[] args) throws MalformedURLException {
    // TODO Auto-generated method stub
    
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //driver.findElementByAndroidUIAutomator("attribute\("value\")"); using special character because it has 2 codes
    driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
    
    //Validate clickable for all option
//  driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");  
    System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); 
	}
}