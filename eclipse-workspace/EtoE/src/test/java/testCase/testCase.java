package testCase;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import junit.framework.Assert;
import pageObjects.loadingPage;
import pageObjects.loginPage;
import resources.baseFile;


public class testCase extends baseFile {

	public static Logger	log = LogManager.getLogger(baseFile.class.getName());
	
	public WebDriver driver;
	public loginPage loginP;
	public	loadingPage loadP;
	
	@BeforeMethod
	public void driverLife() throws IOException {
		driver = initiateDriver();
		driver.get(prop.getProperty("url"));
		log.info("QA Accademy bowser has opend");
	}
	
	
	@Test(dataProvider="loginDetails")
	 public void  homePage(String userName, String password, String text) throws IOException {

		//case 2
		loadingPage loadP = new loadingPage(driver);
		loadP.loginButton().click();
		System.out.println("Login button clciked successfully");
		log.info("Login Button has been clicked successfully");
		//case 3
		loginPage loginP = new loginPage();
		loginP.usserField(driver).sendKeys("vikascr41@gmail.com");
		loginP.passwordField(driver).sendKeys("ABCDefgh");
		loginP.submitButton(driver).click();
		System.out.println("Successfully entered username and password and selcted submit nbitton");
		log.info("valid user cridentials have been successfully passed ");
		//case 4
		loginP.usserField(driver).sendKeys(userName);
		loginP.passwordField(driver).sendKeys(password);
		loginP.submitButton(driver).click();
		System.out.println(text);
		log.info("Invalid user cridentials have been successfully passed ");
		
	}
	
	 
	 @DataProvider
	 public Object[][] loginDetails() {
		 
	 Object[][] data = new Object [2][3];
	 data[0][0] ="Vikascr51@gmail.com";
	 data[0][1] ="ABC123";
	 data[0][2] ="Valid User details";
	
	 data[1][0] ="Vikascr61@gmail.com";
	 data[1][1] ="ABC567";
	 data[1][2] ="Invalid User details";
	 
	 return data;
	 }
	
	 @AfterMethod
	 public void closeDriver() {
		 driver.close();
	 }
	 
	 }
