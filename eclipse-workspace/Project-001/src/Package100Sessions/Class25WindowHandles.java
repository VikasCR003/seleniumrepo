package Package100Sessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class25WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//a[@class='cart-header-navlink blinkingText']")).click();  // click all the website which want and then use .getwindowshandels to store the indexs of each website
		Set<String> Windows = driver.getWindowHandles();  //using windowhandles method to store all the opened websites in string format , as indexes 
		
		 Iterator<String> It = Windows.iterator();  //using iterator method to store the each website in indexes
		 String Parent = It.next();  // to get store the website
		 String child = It.next();  // to store the next website
		 driver.switchTo().window(child); //use swtich method to switch to specific website where you wnant to go 
		 String Text = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		 System.out.println(Text);
		 String[] Splitted = Text.split("at");
		 System.out.println( Splitted [0]);
		 System.out.println( Splitted [1]);
		 String Trimmed = Splitted [1].trim();
		 String[] Splitted1 = Trimmed.split(" ");
		 
		 System.out.println(Splitted1[0]);
		 System.out.println(Splitted1[1]);
		 String Passing = Splitted1[0];
		 driver.switchTo().window(Parent);
		 
		 driver.findElement(By.xpath("//input[@class='search-keyword']")).click();
		 driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys(Passing);
		 driver.quit();
		 
	}

}
