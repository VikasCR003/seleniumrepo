package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1Webdriversetup {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://login.salesforce.com/?locale=in");
	    String title=driver.getTitle();
	    System.out.print(title);
	    driver.close();
  }
}