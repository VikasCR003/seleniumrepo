package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseFile {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver initiateDriver() throws IOException {

		prop = new Properties();
		FileInputStream Fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\EtoE\\src\\main\\java\\resources\\Globalvariables.properties");
		prop.load(Fis);
		String Browsername = prop.getProperty("browser");
		
		if (Browsername.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
			// WebDriver driver = new ChromeDriver(); // instead of writing it as webdriver
			// driver, let us define it in publically so that anyone method and even any
			// class of different package - can access this word driver
			driver = new ChromeDriver();
			System.out.println("Chrome driver is invoked");
		} 
		else if (Browsername.equals("Firefox")) 
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\geckodriver.exe");
			// WebDriver driver = new FirefoxDriver();
			driver = new FirefoxDriver();
		} 
		else {
			System.out.println("NO browser is invoked");
		}
		
		return driver;  
		// now what ever the final output we got we are taking it in an return thing and store inside the method itself, that means
		//- your initiateDriver() itself is your driver variable - , so now we can use ,initiateDriver().get ("google.com"). 
		//instead we store it in some variable,and use that variable , that is how the return thing works
	}
	
	public String screenShot(String failingMethodName, WebDriver driver) throws IOException {
		TakesScreenshot TS = (TakesScreenshot)(driver); // this driver will not be havingk any life so we need to - provide lif e- refer importance of driver
		File Screen = TS.getScreenshotAs(OutputType.FILE);
		String fileDestination = System.getProperty("user.dir")+"\\reports\\"+failingMethodName+".png";
		FileUtils.copyFile(Screen,new File(fileDestination));
		return fileDestination;
	}

}
