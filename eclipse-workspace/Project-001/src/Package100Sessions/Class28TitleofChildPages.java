package Package100Sessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class28TitleofChildPages {


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
//	List<WebElement> coloumn = driver.findElements(By.xpath("//table[@class='gf-t'] //ul")); // dont use this method of storing all the 4 webelement in variable and iterating coz , we just need user to land on the section where all your link are available
	 WebElement coloumn = driver.findElement(By.xpath("//table[@class='gf-t'] //ul"));
 List<WebElement> SecLinks = coloumn.findElements(By.tagName("a"));
 System.out.println("This is coloumn section links"+SecLinks.size());
			for (int i=1; i<SecLinks.size(); i++) {
				
			  String Click = Keys.chord(Keys.CONTROL,Keys.ENTER);   
				coloumn.findElements(By.tagName("a")).get(i).sendKeys(Click);  // since this are keyboard entries we can, use sendKeys, as send keys is also method which is keyboard values
			
		 
			}
			//use windowhandel method to take control of it // take it out of for loop, coz we are just just using for loop to open all the links
			//case 1 : we can below method 
			Set<String> Windows = driver.getWindowHandles();
			
		 Iterator<String> it = Windows.iterator();
		 String First = it.next();
		 String Title1 = driver.switchTo().window(First).getTitle();
		 System.out.println("This is your first page Title "+Title1);
		 String Second = it.next();
		 String Title2 = driver.switchTo().window(Second).getTitle();
		 System.out.println("This is your Second page Title"+Title2);
		 String Thrid = it.next();
		 String Title3 = driver.switchTo().window(Thrid).getTitle();
		 System.out.println("This is your Thrid page Title"+Title3);
		 String Fourth = it.next();
		 String Title4 = driver.switchTo().window(Fourth).getTitle();
		 System.out.println("This is your fourth page Title "+Title4); 
		 
		Iterator<String> It = Windows.iterator();
		//case 2 : we can you simple this method also
		while(It.hasNext()) {
			driver.switchTo().window(It.next()); //for Every index we need to switch to child webpage
		
			String Titles = driver.getTitle();
			System.out.println(Titles);
			
			
		}
			
			
		}
		
	}

