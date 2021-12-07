package Package100Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class29Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='datepicker-days'] //td[@class='day']"));
		specificMonth(driver); // first month will be selected
		specificDate (driver, days); // Then yourday will be selected
		
		
		// Selecting specific date by collecting all the dates in one variable- via generic class and iterating it through each index and comparing with if condition
		
		
	}


	public static void specificDate (WebDriver driver,List<WebElement> days) {
		for (int i=0; i<days.size(); i++) {
			String Text = days.get(i).getText();
			System.out.println(Text);
			if(Text.equalsIgnoreCase("12")) {
				driver.findElements(By.xpath("//div[@class='datepicker-days'] //td[@class='day']")).get(i).click();
			}
	}
}
	public static void specificMonth(WebDriver driver) {
		//Getting sepecific month
		String Months = driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText();
		
		// Doing while loop and use negation and then click on the >> forwarded arrow to move to next moth unitll your while loop fails
		while(!Months.contains("May")) {
		 driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='next']")).click();
		}
	}
	
}