package Package100Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class2Webdriverfirefoxsetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		/*String title=driver.getTitle();
		System.out.println(title);*/
		
		System.out.println(driver.getTitle());
		   driver.close();
	}

}
