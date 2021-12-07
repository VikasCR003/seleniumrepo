package Package100Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4validateURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this is to validate that if you have landed on the correct URL or not coz sometime s, hackers can re-diredctyou to different
		// page when your script is executed successfulyl as google.com
		// so to assure this will prin the URL of page where you ahjev landed
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    String title=driver.getTitle();
	    System.out.println(title);
	    String ValidatURL=driver.getCurrentUrl();
	    System.out.println(ValidatURL);
	    driver.close();
	}


}
