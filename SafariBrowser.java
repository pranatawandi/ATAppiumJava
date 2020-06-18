package ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class SafariBrowser {

	@Test
	public void Browser() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Xr");
		IOSDriver<IOSElement>driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElementByXPath("//*[@id=\"m_login_email\"]").sendKeys("qwerty@yahoo.co.id");
		driver.findElementByXPath("//*[@id=\"m_login_password\"]").sendKeys("123456");
		driver.findElementByXPath("//*[@id=\"u_0_4\"]/button").click();
	}

}
