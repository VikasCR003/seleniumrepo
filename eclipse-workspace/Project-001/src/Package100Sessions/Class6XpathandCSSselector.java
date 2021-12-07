package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6XpathandCSSselector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://login.salesforce.com/");
	    String title=driver.getTitle();
	    System.out.print(title);
	 driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("vikascr41@gmiail.com");
	 driver.findElement(By.cssSelector("#password")).sendKeys("Dotadota@2");
	 driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	   driver.close();
	 // Notes:
	 /* 1. Double quoptes inside a double quotes are not accepted 
	    2. Xpath /Css can be defined in number of different ways
	    3. right click and copy on the blue highlighed code of generated xpath
	    4. when xpath starts with html- not reliable-switch browser to get another one or geenrate customone
	    5. There is no direct way to get CSS in chrome, you will find it in tool bar
	    6. $x("xpath") ->  ot validate you have unique xpath - >  hit this on console window
	    7. $("CSS selector") -> to validate you have unique CSS selector - > hit this on console window */
	 
  }
}