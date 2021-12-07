package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

final class Class9CustomeCSSpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://login.salesforce.com/?locale=eu");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("vikascr51@gmail.com");		// syntax -> tagname[attribute='values']
		driver.findElement(By.cssSelector("input#password")).sendKeys("Password@12345665");				// syntax  -> tagname#vlaue
		driver.findElement(By.cssSelector("#Login")).click();											// syntax -> #value
		Thread.sleep(4000);
		//driver.close();
	}

}
