package poModles;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.resourceBaseFile;

public class url2 extends resourceBaseFile {

	By windowExplorerButton = By.xpath("//button[@id='openwindow']");
	By fotterColoumnLinks = By.xpath("//table[@class='gf-t'] //a");
	By mouseOwerButton=By.xpath("//button[@id='mousehover']");
	
	

	WebDriver driver;

	public url2(WebDriver driver)  {
	
		this.driver=driver;
	}

	public WebElement sampleWindowExplore() {

		return driver.findElement(windowExplorerButton);

	}

	public List<WebElement> footerlinks() {
	
		
		return driver.findElements(fotterColoumnLinks);

	}
	public WebElement mouseButton() {
		
		return driver.findElement(mouseOwerButton);
	}

}
