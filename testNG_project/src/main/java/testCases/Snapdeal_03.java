package testCases;

import java.awt.event.ItemListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DynamicCode.Base_Class;
@Listeners(NormalClass_03.class)
public class Snapdeal_03 extends Base_Class implements ITestListener{
	
	  @Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
	}
	  
	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takeScreenshot(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("onTestSuccess");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
	try {
		Screenshot(result.getMethod().getMethodName());
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("onTestFailure");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("onTestSkipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		driver.quit();
	}
	  @Test
	  public void launch_browser() {
		  System.out.println("chrome");
	  }
	  @Test
	  public void Url() {
		  System.out.println("Snapdeal Url");
  }
	  @Test
	  public void MensFashion() {
			Actions act = new Actions(driver);

		  WebElement MensFashion = driver.findElement(By.xpath("//div[text()=\"Men's Fashion\"]"));
		  act.moveToElement(MensFashion).build().perform();
		  System.out.println("MensFashion");

	  }
	  @Test
	  public void WomensFashion() {
		  WebElement WomensFashion = driver.findElement(By.xpath("//div[text()=\"Women's Fashion\"]"));
			Actions act = new Actions(driver);
		  act.moveToElement(WomensFashion).build().perform();
		  System.out.println(WomensFashion);

	  }
	  @Test
	  public void HomeKitchen() {
	  WebElement HomeKitchen = driver.findElement(By.xpath("//div[text()=\"Home & Kitchen\"]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(HomeKitchen).build().perform();
	  System.out.println(HomeKitchen);
}
	  @Test
	  public void Toys() {
		  WebElement Toys = driver.findElement(By.xpath("//input[@value=\"toys\"]"));
		  Actions act = new Actions(driver);
		  act.moveToElement(Toys).build().perform();
		  System.out.println(Toys);
	  }
}
