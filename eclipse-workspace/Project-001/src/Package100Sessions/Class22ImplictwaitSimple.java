package Package100Sessions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class22ImplictwaitSimple {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] Productarray = {"Brocolli","Cucumber","Beetroot","Capsicum"};
		int j = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    // Introducing the implicate wait //globally
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for (int i=0; i<products.size(); i++) {
			String TextName = products.get(i).getText();
			System.out.println(TextName);
			String[] Splitted = TextName.split("-");
			String Trimmed = Splitted[0].trim();
			System.out.println(Trimmed);
			
			List al = Arrays.asList(Productarray);
			System.out.println(al);
			
			if(al.contains(Trimmed))
			{
				 j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				 
					System.out.println(j);
				if (j==Productarray.length) {
					break;
				}
			}
			
		}
	}
	}


