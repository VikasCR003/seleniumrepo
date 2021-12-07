package Package200Sessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Class6BrokenLinksMultiSoftAssert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> AllLin = driver.findElements(By.xpath("//div[@id='gf-BIG'] //a"));
		// creating an object for soft assertion class
		SoftAssert as = new SoftAssert();
		for (WebElement Links : AllLin) {
			// gettinh all the urls
			String ALLATT = Links.getAttribute("href");
			System.out.println(ALLATT);
			URL ul = new URL(ALLATT);
			// type casting
			HttpURLConnection http = (HttpURLConnection) ul.openConnection();
			http.setRequestMethod("HEAD");
			http.connect();
			int Res = http.getResponseCode();
			System.out.println(Res);

			// instead of using if condition and this will not move forward to remaining
			// link, so will be using soft ASSERTION
			/*
			 * if (Res > 400) { Assert.assertTrue(false); }
			 */
			as.assertTrue(Res>400,"This are the broken links ");
		
		}
		as.assertAll();
	}

}
