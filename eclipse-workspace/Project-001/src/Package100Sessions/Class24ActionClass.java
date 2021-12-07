package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class24ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
Actions a =new Actions(driver);
driver.get("https://www.amazon.com/");
a.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();  // this to mouse hover to a specific Web element 
a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().sendKeys("hello Amazon").doubleClick().perform(); // To select the entered words 
a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Amazon Website").build().perform(); // Passing the Capital Words to a specific webelement
a.contextClick(driver.findElement(By.xpath("//a[@id='nav-orders'] //span[@class='nav-line-1']"))).perform();	//to right click on the specific webelement
	
	}

}
