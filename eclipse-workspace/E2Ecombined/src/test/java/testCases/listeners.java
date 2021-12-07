package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.extentReports;
import resources.resourceBaseFile;

public class listeners extends resourceBaseFile implements ITestListener {
	
	
	ExtentReports extent = extentReports.reports();
	ExtentTest test;
	
	ThreadLocal<ExtentTest> TL =new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		
		 test = extent.createTest( result.getMethod().getMethodName());
		TL.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		TL.get().log(Status.PASS,"This test is passed ");
		String successMethodName = result.getMethod().getMethodName();
		WebDriver	driver= null;
	/*	try {
			driver=	(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		TL.get().addScreenCaptureFromPath(successScreeShot(driver,successMethodName), successMethodName)	;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	WebDriver	driver= null;
	
	try {
		driver=	(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} catch (IllegalArgumentException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IllegalAccessException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (NoSuchFieldException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (SecurityException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	TL.get().fail(result.getThrowable());
	
		String failMethodName = result.getMethod().getMethodName();
		try {
		TL.get().addScreenCaptureFromPath(screenShot(failMethodName,driver), failMethodName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		 extent.flush(); 
	}

	
	
	
}
