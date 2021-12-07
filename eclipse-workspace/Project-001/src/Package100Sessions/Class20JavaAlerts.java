package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class20JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); // deleting cookies as sometimes the chrome was not loading
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vikas please confirm the alert");
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		// Thread.sleep(1000); //dont know for some reason this sleep is not working,
		// Error is -> Chrome not reachable
		// System.out.println(driver.findElement(By.xpath("//input[@id='alertbtn']")).isSelected());
		// //just checking if selenium is click or not -, this will not work beacasue is
		// select method is only for radio button
		System.out.println(driver.switchTo().alert().getText()); // Getting the text which is dispalyed on the
																	// notification
		driver.switchTo().alert().accept(); // accepting the OKAY -> possitive alert
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vikas please Dismiss the alert");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click(); // clicking on the other option which will
																			// trigger neagative alert
		System.out.println(driver.switchTo().alert().getText()); // Getting the text which is dispalyed on the
																	// notification
		driver.switchTo().alert().dismiss(); // accepting the CANCEL -> negative alert
		driver.close();
	}

}
