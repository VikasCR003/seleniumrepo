package Package100Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Class31WindowScroller {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// type casting teh driver to java scripts

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000;");

		List<WebElement> AllNum = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		int Sum = 0;
		for (int i = 0; i < AllNum.size(); i++) {
			String ALLTxt = AllNum.get(i).getText();
			// Parsing a string to integer

			int CoNInt = Integer.parseInt(ALLTxt);
			System.out.println(CoNInt);

			Sum = Sum + CoNInt;

		}

		System.out.println("This is the total" + Sum);

		// including assertion as a part to validare the already total count avilable in
		// web page

		String ValTxt = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		// Again parsing to convert the visible to total to integer
		System.out.println(ValTxt);
		String[] Splitted = ValTxt.split(":");
		System.out.println(Splitted[0]);
		System.out.println(Splitted[1]);
		String S0 = Splitted[0];
		String S1 = Splitted[1];
		String TS1 = Splitted[1].trim();
		int ComTxt = Integer.parseInt(TS1);
		Assert.assertEquals(Sum, ComTxt);
		driver.close();
	}

}
