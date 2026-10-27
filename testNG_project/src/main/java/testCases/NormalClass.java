package testCases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import DynamicCode.Base_Class;

public class NormalClass extends Base_Class implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
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
