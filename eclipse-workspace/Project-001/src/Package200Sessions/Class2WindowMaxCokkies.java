package Package200Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2WindowMaxCokkies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("web.driver.chrome", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximise teh window via manage() method
		driver.manage().window().maximize();
		// Deleting all cokkies
		driver.manage().deleteAllCookies();
		// hitting a website to get the session id
		driver.get("https://www.youtube.com/");
		// Deleting specific cokkie
		driver.manage().deleteCookieNamed("");
	}

}
