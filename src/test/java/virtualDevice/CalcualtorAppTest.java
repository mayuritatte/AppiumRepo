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

public class CalcualtorAppTest extends BaseTest{

	

	//@Test
	public void verifyAppTest() {

		
		System.out.println("add test case");
		
		//Clear the Result
		
		driver.findElement(By.id("clr")).click();
		
		
		//click on nine- 9
//		driver.findElement(By.id("digit_9")).click();
//		driver.findElement(By.id("digit_8")).click();
//		driver.findElement(By.id("digit_9")).click();
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		
	
		//click on plus icon
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
		
		//click on equal icon
		driver.findElement(By.id("eq")).click();
		
		
		
		//get the Result
		String actualResult = driver.findElement(By.id("result_final")).getText();
		
		System.out.println("Addition Result: " + actualResult);
		
		Assert.assertEquals(actualResult, "1995");
		
	}
	
	
	
	@Test
	public void verifyMulTest() {

		
		System.out.println("Multiply test case");
		
		//Clear the Result
		
		driver.findElement(By.id("clr")).click();
		
		
		//click on nine- 9
//		driver.findElement(By.id("digit_9")).click();
//		driver.findElement(By.id("digit_8")).click();
//		driver.findElement(By.id("digit_9")).click();
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		
	
		//click on multiply icon
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
		
		//click on equal icon
		driver.findElement(By.id("eq")).click();
		
		
		
		//get the Result
		String actualResult = driver.findElement(By.id("result_final")).getText();
		
		System.out.println("Addition Result: " + actualResult);
		
		Assert.assertEquals(actualResult, "995006");
		
	}
	
	
	

}
