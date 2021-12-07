package Package100Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3Intenaldrivemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.youtube.com/watch?v=8WVXk0Gz66E");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close(); // this method will close the current webbrowswer i,e. youtbe will be closed
						// this will help you in improvingk the performance of the system
		
		
		driver.get("https://store.steampowered.com/");
		System.out.println(driver.getTitle());
		driver.get("https://store.steampowered.com/genre/Free%20to%20Play/");
		System.out.println(driver.getTitle());

		driver.navigate().back(); // this is used to get back the previous URL
		System.out.println(driver.getTitle());
		
		driver.navigate().forward(); // this will help in from bcak to again forward URL 
		System.out.println(driver.getTitle());
		
	
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource()); // Thi smethid uis to get teh apoge source ofl ten current webpage in case if we are unable to inspect the page-> where the right click is disabled 
	
		
		driver.close(); // this method will close the current webbrowswer i,e. youtbe will be closed
		// this will help you in improvingk the performance of the system
		
		//Note : once the close () method is closed then we need to start back again ot access the next URL
		
		//driver.quit(); // this method will close all the chrome browser opened by selenium
		
				
		
	}

}
