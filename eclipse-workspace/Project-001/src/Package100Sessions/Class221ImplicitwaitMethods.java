package Package100Sessions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class221ImplicitwaitMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // addinf implicity timeout required for
																		// Enterpromo method
		initiatedriver(driver); // calling the method static way, else create an object of main method then call
		String[] Newproducts = { "Brocolli", "Cauliflower", "Tomato", "Beans" }; // declaring the array to use in
																					// arraymethod
		arraymethod(driver, Newproducts);
		clickingcart(driver);
		Enterpromo(driver);

		// Calling the array method using static way
	}

	public static void initiatedriver(WebDriver driver) { // passing the knowledge of driver to thios method ,to use
															// driver.methods
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> Products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < Products.size(); i++) {
			String TextName = Products.get(i).getText();
			String[] Splitted = TextName.split("-");
			String Trimmed = Splitted[0].trim();
			if (Trimmed.contains("Cucumber")) {
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				break;
			}

		}

	}

	// using array method to call multiple prioducts
	public static void arraymethod(WebDriver driver, String[] Newproducts) throws InterruptedException { // passing
																											// knowledge
																											// from main

		int j = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> Productss = driver.findElements(By.xpath("//h4[@class='product-name']"));
		Thread.sleep(5000);
		for (int a = 0; a < Productss.size(); a++) {
			String TextName = Productss.get(a).getText();
			String[] Splitted = TextName.split("-");
			String Trimmed = Splitted[0].trim();
			List al = Arrays.asList(Newproducts);
			if (al.contains(Trimmed)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(a).click();
				if (j == Newproducts.length) {
					break;
				}

			}

		}
		// driver.close();
	}

	public static void clickingcart(WebDriver driver) { // Method to click on cart and procced to next button
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	}

	public static void Enterpromo(WebDriver driver) { // Here is where we would be requiring the implicity wait as ,
														// sending keys and click on apply button will take 4 sec
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy"); // let me put it in
																									// main method -
																									// implicit wait
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.close();
	}

}
