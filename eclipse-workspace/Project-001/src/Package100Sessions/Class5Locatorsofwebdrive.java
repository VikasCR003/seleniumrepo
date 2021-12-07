package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5Locatorsofwebdrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.facebook.com/");
	//	driver.findElement(By.className("inputtext  55r1  6luy")).click();  // class name with spaces will give you an error as compund classes are not allowed
		
	//	driver.findElement(By.id("email")).sendKeys("vikas.cr41@gmial.com"); //OR
		
		driver.findElement(By.name("email")).sendKeys("vikas.cr41@gmial.com");
		driver.findElement(By.id("pass")).sendKeys("Dotadota@3");
		driver.findElement(By.id("passContainer")).click();                // this to view the entered password
		driver.findElement(By.name("login")).click();	
		driver.close();
	//	driver.quit();
		
		
	//	Notes : 
	//  1. every object may not have ID , Class name or name - Xpath or CSS preferred
	//	2. Alpha numeric id may vary on veery refresh-chcek
	//	3. Clases should not have spaces - Compound class name canno be accepted
	//	4. Multiple values - Selecnium identifies the first one - it scans from top left --it won't through an compile
		
	
	}

}
