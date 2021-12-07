package Package100Sessions;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Class14AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ban");										//Get the webelent of a field and send the keys
		Thread.sleep(3000);																				//To avoid the synchronization issue
		java.util.List<WebElement> options=driver.findElements(By.xpath("//ul[@id='ui-id-1'] //a"));	// Here using parent to child concept using SPACE , here the child tag is 'a' ot get all the available options
																										// And storing all the options in a options variable of return type webelement *** imp88 bacause we need this a webelement not as string 
		for(WebElement option : options) {																// Using enhanced for loop to iterate each options and match it with a required word 
																													
			if (option.getText().equalsIgnoreCase("Albania"))											// mactching using if loop 
			{
				option.click();
				break;
			}
			
		}
			
	}

}
