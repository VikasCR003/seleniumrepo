package Package200Sessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//casting driver to take screenshot object
		TakesScreenshot TS = (TakesScreenshot)(driver);
		//taking screenhot as file type
		File SH = TS.getScreenshotAs(OutputType.FILE);
		//store the screenshot to local machine
		FileUtils.copyFile(SH,new File("C:\\Users\\HP\\File2.png"));
		
	}

}
