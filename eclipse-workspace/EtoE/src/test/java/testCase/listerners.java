package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import resources.baseFile;
import resources.extentReports;

public class listerners extends baseFile implements ITestListener{
	String fileDestination; // sicnce it extends base classs i'll define it lpublic
	
	ExtentTest test; // declaring it in global level to Access it anywhere- here the ExtentTest type is comingfrom inbuit class of test variable,
	ExtentReports extent =extentReports.reportConfiguration(); // capturing the return exent to local variable extent of this class
	
	ThreadLocal<ExtentTest> TL =new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		
	 test = extent.createTest(result.getMethod().getMethodName());
	 TL.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		TL.get().log(Status.PASS, "Test is passed");
		
	}
	

	public void onTestFailure(ITestResult result) {
		WebDriver driver=null;
		String failingMethodName = result.getMethod().getMethodName();
		TL.get().fail(result.getThrowable());
		
		
	try {
		 driver=(WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
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
		TL.get().addScreenCaptureFromPath(screenShot(failingMethodName,driver), failingMethodName);
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}

	}

	public void onTestSkipped(ITestResult result) {
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
