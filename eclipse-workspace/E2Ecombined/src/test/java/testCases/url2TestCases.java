package testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import poModles.url2;
import resources.resourceBaseFile;

public class url2TestCases extends resourceBaseFile {

 
	public WebDriver driver;
	public String url;
	
	@BeforeTest
	public void Case1() throws IOException {
		driver = initiatingDriver();
		 url = pro.getProperty("url3");
		// driver.manage().deleteAllCookies();
		
	}


	public void Case2() throws IOException {

		url2 url2Obj = new url2(driver);
		 
		driver.get(url);
		WebElement allLinks = driver.findElement(By.tagName("a"));
		Dimension linksSize = allLinks.getSize();

		System.out.println("This are the links available in this page =" + linksSize);

	}


	public void Case3() throws IOException, InterruptedException {
		
	
		driver.get(url);
		driver.manage().window().maximize();
		url2 url2Obj = new url2(driver);
		
		System.out.println("ypu are here");
		List<WebElement> links = url2Obj.footerlinks();
		System.out.println("you are here");
		System.out.println(links.size());
		/*
		 * for(WebElement link:links) {
		 * 
		 * Set<String> windows = driver.getWindowHandles(); Iterator<String> it =
		 * windows.iterator(); while(it.hasNext()) { String click =
		 * Keys.chord(Keys.CONTROL,Keys.ENTER); link.sendKeys(click); String title =
		 * driver.switchTo().window(it.next()).getTitle(); System.out.println(title); }
		 * 
		 * }
		 */

		for (int i = 1; i < links.size(); i++) {
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			links.get(i).sendKeys(click);
		Thread.sleep(8);	
			
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while (it.hasNext()) {
			
			String titles = driver.switchTo().window(it.next()).getTitle();
			System.out.println(titles);
		}
	}
	
	@Test
	public void Case4() throws InterruptedException {
		
	
	 driver.get(url);
	 driver.manage().window().maximize();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,400)");
	 url2 url2Obj = new url2(driver);
	 Actions a = new Actions (driver);
	 a.moveToElement( url2Obj.mouseButton()).build().perform();
	 System.out.println("This test is pass");
		
	}

public void Case5() {
	driver.close();
}

}
