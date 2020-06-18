package ios;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSTestCase extends IOSBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		IOSDriver<IOSElement> driver = Capabilities();
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByAccessibilityId("Text Entry").click();
		driver.findElementByClassName("XCUIElementTypeField").sendKeys("Hello");
		driver.findElementByAccessibilityId("OK").click();
		driver.navigate().back();
		
		//scroll
		// LINK https://developers.perfectomobile.com/pages/viewpage.action?pageId=25199704
		//identifying the parent Table
		RemoteWebElement parent = (RemoteWebElement)driver.findElementByClassName("XCUIElementTypeTable"); 
		String parentID = parent.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", parentID);
		// Use the predicate that provides the value of the label attribute
		scrollObject.put("predicateString", "label == 'Web View'");
		driver.executeScript("mobile:scroll", scrollObject);  // scroll to the target element
        
		
		driver.findElementByAccessibilityId("Steppers").click();
		driver.findElementsByAccessibilityId("Increment").get(0).click();
		driver.findElementsByAccessibilityId("Increment").get(0).click();
		System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(2).getText());
		driver.findElementsByAccessibilityId("Decrement").get(0).click();
		System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		driver.navigate().back();
		
		//Picker for IOS only
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
		driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).sendKeys("55");
		driver.findElementByXPath("//*[@name='Blue color component value']").sendKeys("130");
	}

}
