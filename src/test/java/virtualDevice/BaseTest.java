package virtualDevice;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {
	
	
	AppiumDriver<MobileElement> driver ;
	
	@BeforeTest
	public void setup() throws Exception {

		System.out.println("setup configuration");

		String appiumServer = "http://localhost:4723/wd/hub";

		// Device
		// adb devices
//		List of devices attached
//		emulator-5554   device

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("udid", "emulator-5554"); // json format
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0");

//		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");

		// Application
		// AppPackage and AppActivity

		// app1
		// using app: APK info
		// appPackage: com.google.android.calculator
		// appActivity: com.android.calculator2.Calculator

		// app2

		// using adb shell
		// adb shell dumpsys window

		// mCurrentFocus=Window{f822d38 u0
		// com.google.android.deskclock/com.android.deskclock.DeskClock}

//		adb shell dumpsys window | find "mCurrentFocus"
//		mCurrentFocus=Window{f822d38 u0 com.google.android.deskclock/com.android.deskclock.DeskClock}

		
		// mCurrentFocus=Window{f75f02 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		

//		driver = new ChromeDriver();    //launch a browser ---- create a session 

		// Create a session ----

		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), caps);

	}
	

}
