package Ralali;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class R_Login extends R_Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Negative-Case invalid Email
		Thread.sleep(10000);
		driver.findElementById("android:id/button1").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ProfileTab\"]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("abc123@gmail.com");
		String failmsg1 = driver.findElementByXPath("//*[@text='Email belum terdaftar']").getText();
		Assert.assertEquals("Email belum terdaftar", failmsg1);
		
		//Negative-Case invalid Email
//		Thread.sleep(10000);
//		driver.findElementById("android:id/button1").click();
//		Thread.sleep(4000);
//		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ProfileTab\"]").click();
//		driver.findElementByClassName("android.widget.EditText").sendKeys("testing123@gmail.com");
//		driver.findElementByClassName("android.widget.EditText").sendKeys("12345678");
//		driver.findElementByXPath("//android.view.ViewGroup[@index='6']").click();
//		String failmsg2 = driver.findElementByXPath("//*[@text='Email belum terdaftar']").getText();
//		Assert.assertEquals("Email belum terdaftar", failmsg2);
		
		//Positive-Case
		Thread.sleep(10000);
		driver.findElementById("android:id/button1").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ProfileTab\"]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("testing123@gmail.com");
		driver.findElementByXPath("//android.view.ViewGroup[@index='6']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("12345678");
		driver.findElementByXPath("//android.view.ViewGroup[@index='6']").click();
		Thread.sleep(10000);
		String name = driver.findElementByXPath("//android.widget.TextView[@index='1']").getText();
		Assert.assertEquals("test", name);
	}

}
