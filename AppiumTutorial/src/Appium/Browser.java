package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browser extends BaseChrome {

public static void main(String[] args) throws MalformedURLException {
    // TODO Auto-generated method stub
    
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    /*driver.get("https://facebook.com");
    driver.findElementByXPath("//*[@id=\"m_login_email\"]").sendKeys("qwerty");
    driver.findElementByXPath("//*[@id=\"m_login_password\"]").sendKeys("123123");
    driver.findElementByXPath("//button[@value='Masuk']").click();*/

    driver.get("https://cricbuzz.com");
    driver.findElementByXPath("//a[@href='#menu']").click();
    driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
    System.out.println(driver.getCurrentUrl());
    
    //Scroll on Mobile Browser
    //you cant scrolling using selenium
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,480)","");
    Assert.assertTrue(driver.findElementByXPath("//h4[text()='Top Stories']").getAttribute("class").contains("header"));
}
}

