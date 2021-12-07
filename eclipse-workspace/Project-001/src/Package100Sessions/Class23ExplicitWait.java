package Package100Sessions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class23ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] Productarray = {"Brocolli","Cucumber","Beetroot","Capsicum"};
		int j = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	// Commenting out the Implicit wait 	
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    // Introducing the implicate wait //globally  //Instead of Implicit wait using explicit wait
	
		WebDriverWait Exwait=new WebDriverWait(driver, 5);  // since this method is already inbuilt we need to ,nor create new onle more method and call it in main
	
		
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
		clickingcart(driver);
		Enterpromo(driver, Exwait);
		
	}
	public static void clickingcart(WebDriver driver) { // Method to click on cart and procced to next button
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	}
	
	public static void Enterpromo(WebDriver driver,WebDriverWait Exwait) { // Here is where we would be requiring the implicity wait as ,
														// sending keys and click on apply button will take 4 sec and also passing the knowledge's accordingly
		Exwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy"); 
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		Exwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='promoInfo']")));  // Introducing Explicit wait for specifi location which will cause the wait 
		driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.close();
	}
}
