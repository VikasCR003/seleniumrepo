package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Class18Selectthecurrentdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");							
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();						// gEtting the element via xpath and accesign the calender dates
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();							// Selecting teh current date via class developed by developer as-  highlighter 
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).getSize());	//printing the size of the calendar field
		driver.close();
	
	}

}
