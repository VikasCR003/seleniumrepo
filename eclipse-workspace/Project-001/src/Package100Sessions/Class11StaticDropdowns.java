package Package100Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Class11StaticDropdowns {

public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();  
			driver.manage().window().maximize();													// This is to maximize the screen
			driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");													
			WebElement StaticElement =driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));		// getting that select type webelement of the field
			Select Staticdropdown = new Select (StaticElement);										// creating an object for the select () method and passing the arrugment 
			List<WebElement> Getoptions=Staticdropdown.getOptions();								// This method is to view the available option on the field
			System.out.println(Getoptions);
			Staticdropdown.selectByIndex(1);														// Selecting the first index of an static filed
			Staticdropdown.selectByValue("USD");													// selecting by locator value
			Staticdropdown.selectByVisibleText("AED");												// selecting by what ever option is visible from the drop down ()
			Staticdropdown.getFirstSelectedOption().getText();
			System.out.println(Staticdropdown.getFirstSelectedOption().getText());				    // validating the selected option in website
			driver.close();
			
			/* Note: Here the current selected field has to clicked first to view the options in it but using the select method we dont wnat to that because the select method has all the inbuilt methods */
}
}
