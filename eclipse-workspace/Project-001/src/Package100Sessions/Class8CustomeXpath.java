package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8CustomeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://login.salesforce.com/?locale=eu");
		System.out.println("Thi is the website URL ->" + driver.getCurrentUrl());					
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikascr41@gmail.com");		//syntax is -> //tagname[@attribute=value]  ***here attribute name is taken as ----type----
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password@1123");				//syntax is -> //*[@attribute=value]  **** this can be used if you dont know the tagname
		driver.findElement(By.xpath("//input[@name='Login']")).click();								//syntax is -> //tagname[@attribute=value]  ***here attribute name is taken as ----name----
		driver.close();
		
	}

}
