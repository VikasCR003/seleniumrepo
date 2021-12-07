package Package100Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Class32TotalingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> ALLNum = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		//parcing string to interger ,to sum up
int sum=0;
		for(int i=0;i<ALLNum.size(); i++) {
		String ALLTxt = ALLNum.get(i).getText();
		//parsing to interger
		
		int ALLInt = Integer.parseInt(ALLTxt);
		
			sum =sum+ALLInt;
			System.out.println("This is the total number "+sum);
			
		}
		
		String ValTxt = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		// Again parsing to convert the visible to total to integer
		System.out.println(ValTxt);
		String[] Splitted = ValTxt.split(":");
		System.out.println(Splitted[0]);
		System.out.println(Splitted[1]);
		String S0 = Splitted[0];
		String S1 = Splitted[1];
		String TS1 = Splitted[1].trim();
		int ComTxt = Integer.parseInt(TS1);
		Assert.assertEquals(sum, ComTxt);
		driver.close();
	}

}
