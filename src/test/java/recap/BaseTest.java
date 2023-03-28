package recap;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	
	
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
		
		
		//clock
//		caps.setCapability("appPackage", "com.google.android.deskclock");
//		caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		//calculator
		
		//mCurrentFocus=Window{9dfbdab u0 com.google.android.calculator/com.android.calculator2.Calculator}
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		//create a appium session ----- session ID
		
//		driver = new ChromeDriver();			//session ID
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), caps);
		
		
		
	}
	

}
