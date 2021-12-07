package Package100Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class26FarmesDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		System.out.println( driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
Actions a =new Actions(driver);
WebElement Drag = driver.findElement(By.xpath("//div[@id='draggable']"));
 WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(Drag, Drop).build().perform();
		driver.close();
	
	}

}
