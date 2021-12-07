package Package100Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class12Staticdropdown22 {


		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();  
			driver.manage().window().maximize();													// This is to maximize the screen
			driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");	
			driver.findElement(By.id("divpaxinfo")).click(); 										// Clicking on the search bar to actiavte the options
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			Thread.sleep(2000L);																	// very important just to make sure the eclipse won't comeout of the execution and throws an error coz we are dealing inside the minute details
			driver.findElement(By.id("hrefIncAdt")).click();										// This line of code is okay when we need to perform one or two clcik, buit what if there are 40 clicks ?
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 					// validating or Prinitng the current value of the search bar
			int i=0;
			for(i=0;i<=8;i++) {																	//using FOR Loop	//********* To Execut the 8 more clicks ,ie. the out put shd be 9 selected ************
				driver.findElement(By.id("hrefIncAdt")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				i++;
			}
			System.out.println("The final number of adults selected"+driver.findElement(By.id("divpaxinfo")).getText());
			driver.close();
		}
	
}
