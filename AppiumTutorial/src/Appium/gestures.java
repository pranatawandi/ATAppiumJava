package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends Base {

public static void main(String[] args) throws MalformedURLException {
    // TODO Auto-generated method stub
    
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
    //using Tap (The function is same with the click but its really helpful when using gesture
    TouchAction t = new TouchAction(driver);
    WebElement ExpandList = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
    t.tap(tapOptions().withElement(element(ExpandList))).perform();
    
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]").click();
    
    WebElement PeopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
    t.longPress(longPressOptions().withElement(element(PeopleNames)).withDuration(ofSeconds(2))).release().perform();
    
    //Jika terlalu lama execute bisa menggunakan ini
    //Thread.sleep(2000);
    
    System.out.println(driver.findElementById("android:id/title").isDisplayed());
	}
}
