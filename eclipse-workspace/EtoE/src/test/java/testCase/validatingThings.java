package testCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.loadingPage;
import resources.baseFile;

public class validatingThings extends baseFile {
	public WebDriver driver;
	public static Logger	log = LogManager.getLogger(baseFile.class.getName());
	@BeforeTest
	public void driverLife() throws IOException {
		driver = initiateDriver();
		driver.get(prop.getProperty("url"));
		log.info("QA Accademy browser has opened for - Validating Things ");
	}
	@Test
	public void validateThings() throws IOException {

		loadingPage loadP = new loadingPage(driver);
		String featureTabText = loadP.fetureTab().getText();
		System.out.println(featureTabText);
		Assert.assertEquals(featureTabText, "FEATURED COURSES1235"); // this will fail
		log.info("The Word FEATURED COURSES has been verified ");
		
	}
	@Test
	public void verifyTabVisible () throws IOException {
	
		loadingPage loadP = new loadingPage(driver);
	String Texts = loadP.verifyVisible().getText();
	boolean View = loadP.verifyVisible().isDisplayed();
	Assert.assertTrue(View);
	System.out.println("The table content are visible");
	System.out.println("This is the texts visible in the table elemetn =" + Texts);
	log.info("Visibility of Feature tab Element test has passed");
	
	}

	 @AfterTest
	 public void closeDriver() {
		 driver.close();
	 }
}


