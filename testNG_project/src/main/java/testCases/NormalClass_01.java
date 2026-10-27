package testCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import DynamicCode.Base_Class;

public class NormalClass_01 extends Base_Class implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
	try {
		takeScreenshot(result.getMethod().getMethodName());
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("onTestStart");
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
	public void onStart(ITestContext context) {
	System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("onFinish");
	}
	
	}