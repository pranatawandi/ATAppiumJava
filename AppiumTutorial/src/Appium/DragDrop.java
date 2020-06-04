package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragDrop extends Base {

public static void main(String[] args) throws MalformedURLException {
    // TODO Auto-generated method stub
    
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]").click();
    TouchAction t = new TouchAction(driver);
    //longpress/move/release/
    WebElement Dot1 = driver.findElementsByClassName("android.view.View").get(0);
    WebElement Dot2 = driver.findElementsByClassName("android.view.View").get(1);
    //t.longPress(longPressOptions().withElement(element(Dot1))).moveTo(element(Dot2)).release().perform();
    // digunakan jika tidak ada multiple action seperti duration dll
    t.longPress(element(Dot1)).moveTo(element(Dot2)).release().perform(); 

}
}