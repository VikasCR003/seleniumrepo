package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReports {

public static	ExtentSparkReporter extReports;
public static ExtentReports ext;
	public static ExtentReports reports() {
		
		
		String reportPath = System.getProperty("user.dir")+"\\Reports\\Report.html";
		ExtentSparkReporter extReports = new ExtentSparkReporter(reportPath);
		extReports.config().setDocumentTitle("E2E Project");
		extReports.config().setReportName("url1 Test Reports");
		
		
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(extReports);
		ext.setSystemInfo("vikas", reportPath);
		
		return ext;
		
		
		
		
		
	}
}
