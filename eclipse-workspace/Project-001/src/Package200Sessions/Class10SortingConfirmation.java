package Package200Sessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Class10SortingConfirmation {

	public static void main(String[] args) {
		// Write a program to confirm that after clickinkg the dropdown the items are
		// sorted or not

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// clicking the 20 value staticdrop down
		WebElement Options = driver.findElement(By.xpath("//div[@Class='col-xs-4'] //select"));
		Select s = new Select(Options);
		List<WebElement> Alloptions = s.getOptions();
		System.out.println(Alloptions);
		s.selectByIndex(2);

		// Clicking on the dropdown button of the web page to get the all the products
		// in sorted order
		driver.findElement(By.xpath("//table[@class='table table-bordered'] //th[1]")).click();

		List<WebElement> clicksorted = driver.findElements(By.xpath("//table[@class='table table-bordered'] //tr //td[1]"));
		// getting text of all the sorted elements after a click
		//case 1: Printign via for loop
		for (WebElement click : clicksorted) {
			String Clicktext = click.getText();
			System.out.println(Clicktext);
		}

		//case 2: printing via stream // this will give some other output
		clicksorted.stream().forEach(a->System.out.println(a));
		
		//case3 : using map as for loop to print all the products
		List<String> mapsorted = clicksorted.stream().map(b->b.getText()).collect(Collectors.toList());
		System.out.println("This is map sorted "+ mapsorted);
		
		//now let us compare the product sort due to click is same as your sorting logic
		
		List<String> sortedsort = mapsorted.stream().sorted().collect(Collectors.toList());
		
		System.out.println("This is sort logic sort"+ sortedsort);
		 //placing assert condition to verify
		Assert.assertTrue(mapsorted.equals(sortedsort));
		
		
		driver.close();
	}

}
