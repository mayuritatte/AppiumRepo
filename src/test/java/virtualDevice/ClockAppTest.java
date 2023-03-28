package virtualDevice;

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

public class ClockAppTest {
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
		System.out.println("setup configuration");
		
		String appiumServer = "http://localhost:4723/wd/hub";
		
		//Device
		//adb devices
//		List of devices attached
//		emulator-5554   device
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("udid", "emulator-5554"); 															//json format 
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0");
		
		
//		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		
		
		
		
		
		//Application
		//AppPackage and AppActivity
		
		//app1
		//using app: APK info
		//appPackage: com.google.android.calculator
		//appActivity: com.android.calculator2.Calculator
		
		
		
		//app2
		//using adb shell
		//adb shell dumpsys window
		
		//mCurrentFocus=Window{f822d38 u0 com.google.android.deskclock/com.android.deskclock.DeskClock}
		
		
//		adb shell dumpsys window | find "mCurrentFocus"
//		  mCurrentFocus=Window{f822d38 u0 com.google.android.deskclock/com.android.deskclock.DeskClock}
		
		
		
		//calculator
//		caps.setCapability("appPackage", "com.google.android.calculator");
//		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		//clock
		caps.setCapability("appPackage", "com.google.android.deskclock");
		caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		
		
		
//		driver = new ChromeDriver();    //launch a browser ---- create a session 
		
		
		//Create a session  ---- 
		
		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), caps);
		
		
		
	}
	
	
	
	@Test
	public void verifyDateTest() {
		
		System.out.println("add test case");
		
		
		String actualDate = driver.findElement(By.id("date")).getText();
		
		System.out.println("Date: " + actualDate);
		
		Assert.assertTrue(actualDate.contains("Mar"));
	
	}
	
	
}
