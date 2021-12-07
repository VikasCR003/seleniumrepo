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

public class Class5BrokenMUltipleLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> AllLin = driver.findElements(By.xpath("//div[@id='gf-BIG'] //a"));

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

			if (Res > 400) {
				Assert.assertTrue(false);
			}
		}

	}

}
