package Package100Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class21SelectingProductsDummy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (WebElement Product : products) {   //Enhanced For Loop  - if we use enhanced fro loop then we cannot, hit the specific index value susin get(i) method , hence we use normal for loop
			String Textname = Product.getText();
			String[] Splitted = Textname.split("-");
			String Trimmed = Splitted[0].trim();

			if (Trimmed.equalsIgnoreCase("Cucumber")) {   /*Here the very 1st product will be selecte intead of cucumber, coz we are not focusing on index of specific product or index of specific ADD to Cart attribute */
				driver.findElement(By.xpath("//div[@class='product-action']")).click();
				break;
			}
		}

	}

}
