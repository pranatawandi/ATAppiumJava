package Appium;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swipe extends Base {

public static void main(String[] args) throws MalformedURLException {
    // TODO Auto-generated method stub
    
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Date Widgets\"]").click();
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"2. Inline\"]").click();
    //*[@attribute='value'] thats mean the all tagname is accaptable
    driver.findElementByXPath("//*[@content-desc='9']").click();
    
    TouchAction t = new TouchAction(driver);
    WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
    WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
    //long press //on element // 2 second / move to another element and release
    t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
}
}

