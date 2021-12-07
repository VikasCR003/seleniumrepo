package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class10ParenttochildTrvarce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@jsname='RNNXgb']/div/div[2]/input")).sendKeys("vikascr61@gmail.com");  //syntax -> from parent objecct carefully traverse to child object wherer you need to land 
		driver.close();
		/* this type of getting the XPATH is used when we are not sure the attribute of a selected field is dynamic and keeps changing -during this case we slowly  reach the child object via parent child concept */
	}

}
