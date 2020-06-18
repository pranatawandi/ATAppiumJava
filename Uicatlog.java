package ios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

	public class Uicatlog {
		IOSDriver driver;

		@Before
			public void setup() throws MalformedURLException {

				// TODO Auto-generated method stub
				File app = new File("/Users/xcodeclub/Desktop/UICatalog.app.zip");
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
				capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
				driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				}

		//@Test

			public void switches() {
				driver.scrollTo("Switches").click();
				System.out.println(driver.findElements(By.className("UIASwitch")).get(0).getAttribute("value"));
				driver.findElements(By.className("UIASwitch")).get(0).click();
				System.out.println(driver.findElements(By.className("UIASwitch")).get(0).getAttribute("value"));
			
			}

			//@Test

			public void Pickers() {
				driver.scrollTo("Picker View").click();
				System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(0).getAttribute("value"));
				driver.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("85");
				driver.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("215");
				System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(0).getAttribute("value"));
			}

			@Test
			
			public void Alerts() {
				driver.scrollTo("Alert Views").click();
				driver.findElementByName("Simple").click();
				driver.switchTo().alert().accept();
			}
	}