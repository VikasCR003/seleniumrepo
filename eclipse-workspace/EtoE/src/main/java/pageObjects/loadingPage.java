package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loadingPage {

	WebDriver driver;
	
	 By loginButton = By.xpath("//div[@class=\"container-fluid\"] //a[@href=\"https://rahulshettyacademy.com/sign_in/\"]"); // defining and storing the required webelement in an specific variable
	
	 By featureField= By.xpath("//div[@class=\"container\"] //div[@class=\"text-center\"]");
	 
	 By tableElement = By.xpath("//ul[@class=\"nav navbar-nav navbar-right\"] //li");
	 
	 public loadingPage(WebDriver driver) {
		
		 this.driver=driver;
	}



	public WebElement loginButton() {
		 
		 return driver.findElement(loginButton);
		  
	 }
	
	public WebElement fetureTab() {
		return driver.findElement(featureField);
	}

	public WebElement verifyVisible () {
	return 	  driver.findElement(tableElement);
	}


}
