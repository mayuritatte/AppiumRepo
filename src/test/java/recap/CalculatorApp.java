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

public class CalculatorApp extends BaseTest{
	
	
	//priority ---- 0
	//priority ---- same -----naming ----ascii value
	
	
	
	@Test
	public void verifyAddTest() {
		
		System.out.println("add test case");
		
		
		//clear the Results
		driver.findElement(By.id("clr")).click();
		
		//identification
		//click on 9
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on Plus icon
		driver.findElement(By.id("op_add")).click();
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on equal icon
		driver.findElement(By.id("eq")).click();
		
		
		//get the results
		String actualResult = driver.findElement(By.id("result_final")).getText();
		String attributeClass =driver.findElement(By.id("result_final")).getAttribute("class");
		
		System.out.println("Result are: " + actualResult);
		System.out.println("Attribute Value are: " + attributeClass);
		
		Assert.assertEquals(actualResult, "1996");
		
		
	}
	
	
	@Test
	public void verifyMulTest() {
		
		System.out.println("mul test case");
		
		
		//clear the Results
		driver.findElement(By.id("clr")).click();
		
		//identification
		//click on 9
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on Multiply icon
		driver.findElement(By.id("op_mul")).click();
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on equal icon
		driver.findElement(By.id("eq")).click();
		
		
		//get the results
		String actualResult = driver.findElement(By.id("result_final")).getText();
		String attributeClass =driver.findElement(By.id("result_final")).getAttribute("class");
		
		System.out.println("Result are: " + actualResult);
		System.out.println("Attribute Value are: " + attributeClass);
		
		Assert.assertEquals(actualResult, "996004");
		
		
	}
	
	
	@Test
	public void verifySubTest() {
		
		System.out.println("Sub test case");
		
		
		//clear the Results
		driver.findElement(By.id("clr")).click();
		
		//identification
		//click on 9
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on Multiply icon
		driver.findElement(By.id("op_sub")).click();
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_7")).click();
		
		//click on equal icon
		driver.findElement(By.id("eq")).click();
		
		
		//get the results
		String actualResult = driver.findElement(By.id("result_final")).getText();
		String attributeClass =driver.findElement(By.id("result_final")).getAttribute("class");
		
		System.out.println("Result are: " + actualResult);
		System.out.println("Attribute Value are: " + attributeClass);
		
		Assert.assertEquals(actualResult, "1");
		
		
	}

	
	@Test
	public void verifyDivTest() {
		
		System.out.println("Div test case");
		
		
		//clear the Results
		driver.findElement(By.id("clr")).click();
		
		//identification
		//click on 9
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on Multiply icon
		driver.findElement(By.id("op_div")).click();
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on equal icon
		driver.findElement(By.id("eq")).click();
		
		
		//get the results
		String actualResult = driver.findElement(By.id("result_final")).getText();
		String attributeClass =driver.findElement(By.id("result_final")).getAttribute("class");
		
		System.out.println("Result are: " + actualResult);
		System.out.println("Attribute Value are: " + attributeClass);
		
		Assert.assertEquals(actualResult, "1");
		
		
	}


}
