package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Class19CheckEnabledOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");				//Entering the web page
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); 	//We have found that the style attribute is the one which is ma=kin it to look like disabled, one of the value is chaging from 0.5 to 1 
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {		//Here i'm, using one of the valuye lfrom stye attribute a but yoiu can use other such as - > display: block; opacity: 1;
			System.out.println("This is Disbled ");
			Assert.assertTrue(true);													// Intensionally passing
		}
		else {
			Assert.assertTrue(false);													//else faillig  the script intentiopnally , else block will be enabled only when your .contain("1") fail 
		}																				// lets get the attributes of this style befor and ater the click jsut FYI
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();							// lets click on that element which will enable/ disable the other field
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());	 // checking internal method -> this is a boolean method and expected is to disabled i.e: False , but it will give you true
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	//gathering teh attributes via getattrtibute() method,here will find more than one value ,which can be used for your if conditions
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {		//Here i'm, using one of the valuye lfrom stye attribute a but yoiu can use other such as - > display: block; opacity: 1;
			System.out.println("This is enabled ");
			Assert.assertTrue(true);													// Intensionally passing
		}
		else {
			Assert.assertTrue(false);													//else faillig  the script intentiopnally , else block will be enabled only when your .contain("1") fail 
		}
		
	}

}
