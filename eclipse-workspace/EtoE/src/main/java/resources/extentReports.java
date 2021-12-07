package resources;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReports {
	
	static ExtentHtmlReporter EHTML;
	
	public static ExtentReports reportConfiguration() {
		
		
		String ExtentFilepath = System.getProperty("user.dir")+"\\reports\\index.html";		
		ExtentHtmlReporter EHTML = new ExtentHtmlReporter(ExtentFilepath);
		EHTML.config().setReportName("Vikas Report");
		EHTML.config().setDocumentTitle("E2E Projec Document");
		
		
		ExtentReports ER = new ExtentReports();
		ER.attachReporter(EHTML);
		ER.setSystemInfo("Tester", "QA VIKAS");
		
		return ER;
	
	}
	
}
