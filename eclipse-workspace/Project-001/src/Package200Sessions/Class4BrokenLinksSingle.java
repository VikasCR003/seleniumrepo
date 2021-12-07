package Package200Sessions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Class4BrokenLinksSingle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String Att = driver.findElement(By.xpath("//div[@id='gf-BIG'] //li[@class='gf-li'] //a[text()='SoapUI']")).getAttribute("href");
		// Craet an object for URL Class
		URL url = new URL(Att);
		// casting the to HTTP and opening connections
		HttpsURLConnection https = (HttpsURLConnection) url.openConnection();
		// Requesting the HEAD metho type to excute in browser
		https.setRequestMethod("HEAD");
		// invoking the URL wihtout opening the link
		int Res = https.getResponseCode();
		System.out.println(Res);
		https.connect();

		if (Res > 400) {
			// implementing hard assertion
			Assert.assertTrue(false);
		}

	}

}
