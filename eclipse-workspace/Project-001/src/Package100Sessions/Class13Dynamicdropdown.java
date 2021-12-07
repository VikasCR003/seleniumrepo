package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class13Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//div[@class='row1'] //input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.id("BLR")).click();
		Thread.sleep(5000L);
		System.out.println("Vikas is traveling FROM "+driver.findElement(By.id("BLR")).getText());
		Thread.sleep(5000L);
		driver.findElement(By.xpath("(//a[@value='VTZ'])[2]")).click();
		System.out.println("Vikas is traveling TO "+driver.findElement(By.id("VTZ")).getText());
		driver.close();
	}

}