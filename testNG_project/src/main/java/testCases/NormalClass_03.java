package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import DynamicCode.Base_Class;

public class NormalClass_03 extends Base_Class implements ITestListener{
	
	@Test(priority = 1)
	@Override
	public void onTestStart(ITestResult result) {
		Actions act = new Actions(driver);
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
	public void onStart(ITestContext context) {
		launch_browser("chrome");
		HitUrl("https://www.snapdeal.com/");
	}

	@Override
	public void onFinish(ITestContext context) {
		driver.quit();
	}

}
