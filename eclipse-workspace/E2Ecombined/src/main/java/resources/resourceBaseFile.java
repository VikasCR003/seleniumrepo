package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class resourceBaseFile {

	public static WebDriver driver;
	public static Properties pro;

	public static WebDriver initiatingDriver() throws IOException {

		pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\E2Ecombined\\src\\main\\java\\resources\\globalVariables.properties");
		pro.load(fis);
		String browserValue = pro.getProperty("browser");

		if (browserValue.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome driver initiated");
		} else if (browserValue.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\HP\\Downloads\\Selenium\\geckodriver-v0.29.1-win64");
			driver = new FirefoxDriver();
			System.out.println("Firefox driver initiated");
		} else {
			System.out.println("Please specify the browser in properties file");
		}
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	public String screenShot(String failMethodName, WebDriver driver) throws IOException {

		TakesScreenshot tc = (TakesScreenshot) driver;
		File screen = tc.getScreenshotAs(OutputType.FILE);
		String destinationPath = ("C:\\Users\\HP\\eclipse-workspace\\E2Ecombined\\Reports\\" + failMethodName + ".png");
		FileHandler.copy(screen, new File(destinationPath));
		return destinationPath;
	}
	
	public String successScreeShot(WebDriver driver, String successMethodName) throws IOException {
		
		TakesScreenshot stc = (TakesScreenshot) driver;
		File successScreen = stc.getScreenshotAs(OutputType.FILE);
		String successScreenPath = System.getProperty("C:\\Users\\HP\\eclipse-workspace\\E2Ecombined\\SuccessScreens"+successMethodName+".png");
		FileHandler.copy(successScreen, new File(successScreenPath));
		return successScreenPath;
		
		
	}
	


}
