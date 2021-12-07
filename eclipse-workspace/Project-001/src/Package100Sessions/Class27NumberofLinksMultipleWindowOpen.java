package Package100Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class27NumberofLinksMultipleWindowOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 int Alllinks = driver.findElements(By.tagName("a")).size();  // coz all the links have tag as a, hence  we start to search all the links with tag name 'a'
		 System.out.println("This are totla number of links present in whole webpage:"+Alllinks);
		 SpecificSection(driver);
	}

	public static void SpecificSection (WebDriver driver) {
 List<WebElement> coloumn = driver.findElements(By.xpath("//table[@class='gf-t'] //ul"));
		for (int i=1; i<coloumn.size(); i++) {
			
		  String Click = Keys.chord(Keys.CONTROL,Keys.ENTER);   
			driver.findElements(By.tagName("a")).get(i).sendKeys(Click);  // since this are keyboard entries we can, use sendKeys, as send keys is also method which is keyboard values
			
		
		}
		
	}
}
