package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class12Statcidropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();													// This is to maximize the screen
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");	
		driver.findElement(By.id("divpaxinfo")).click(); 										// Clicking on the search bar to actiavte the options
		System.out.println(driver.findElement(By.id("hrefIncAdt")).getText()); 					// validating or Prinitng the current value of the search bar
		Thread.sleep(2000L);																	// very important just to make sure the eclipse won't comeout of the execution and throws an error coz we are dealing inside the minute details
		driver.findElement(By.id("hrefIncAdt")).click();										// Incrementing the count by clciking
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());					// validating or Prinitng the current value of the search bar after clicking 
		driver.findElement(By.id("hrefIncAdt")).click();										// now if we need to increment the values  we need to keep clicking by pasting the same line of code
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());	
		driver.findElement(By.id("hrefIncAdt")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
	}

}
