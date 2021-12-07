package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7GettheERRORmessage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://login.salesforce.com/");
	    String title=driver.getTitle();
	    System.out.print(title);
	 driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("vikascr41@gmiail.com");
	 driver.findElement(By.cssSelector("#password")).sendKeys("Dotadota@2");
	 driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	
	 /*  WebElement Errormesssage = driver.findElement(By.xpath("//*[@id=\'error\']"));
	  System.out.println(Errormesssage); */                                                  // This will just provide us the xpath **** Return type is webelement
	 
	 String Errormesssage = driver.findElement(By.id("error")).getText();
	Thread.sleep(3000);
	 System.out.println(Errormesssage); 													// This will give you the exact error text message you wanted to see and ****** return typs is string
	 
	 driver.close();
	 

  }
}