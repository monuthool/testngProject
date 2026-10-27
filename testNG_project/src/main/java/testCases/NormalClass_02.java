package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import DynamicCode.Base_Class;

public class NormalClass_02 extends Base_Class implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		Actions act = new Actions(driver);
		act = new Actions(driver);
		
		try {
			takeScreenshot(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		launch_browser("chrome");
		HitUrl("https://www.snapdeal.com/");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");

	}

}
