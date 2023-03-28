package recap;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ClockApp {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
		
		
		String appiumServer = "http://192.168.1.5:4723/wd/hub";
		
		
		//DeviceDetails
		//real/emulator
		
//		adb devices
//		List of devices attached
//		emulator-5554   device
		
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		//Application Details
		//app1
		//adb shell dumpsys window | find "mCurrentFocus"
		//  mCurrentFocus=Window{2c0ad65 u0 com.google.android.deskclock/com.android.deskclock.DeskClock}
		
		caps.setCapability("appPackage", "com.google.android.deskclock");
		caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		//create a appium session ----- session ID
		
//		driver = new ChromeDriver();			//session ID
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), caps);
		
		
		
	}
	
	
	
	@Test
	public void verifyCurrentDateTest() {
		
		System.out.println("add test case");
		
		//identification
		String actualDate = driver.findElement(By.id("com.google.android.deskclock:id/date")).getText();		
		
		System.out.println("Current Date: " + actualDate);
		
		Assert.assertTrue(actualDate.contains("Mar"));
		
	}

}
