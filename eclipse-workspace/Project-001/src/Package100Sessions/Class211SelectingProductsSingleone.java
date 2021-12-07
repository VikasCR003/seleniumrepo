package Package100Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class211SelectingProductsSingleone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\E2Ecombined\\\\src\\\\main\\\\java\\\\resources\\\\globalVariables.properties");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int i;
		for ( i=0; i<products.size(); i++) {
			System.out.println(products.size());
			String TextName = products.get(i).getText();
			System.out.println(TextName);
			if (TextName.contains("Cucumber")) {
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				break;
			}
		}
	}

}
