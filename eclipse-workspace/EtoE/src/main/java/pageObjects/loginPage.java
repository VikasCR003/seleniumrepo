package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.baseFile;

public class loginPage {

	
	WebDriver driver;
	

	By username = By.xpath("//div[@class=\"control-input\"] //input[@id=\"user_email\"]");

	By passwoord = By.xpath("//div[@class=\"control-input\"] //input[@id=\"user_password\"]");

	By submit = By.xpath("//div[@class=\"form-group text-center\"] //input[@value=\"Log In\"]");

	public WebElement usserField(WebDriver driver) {
		return driver.findElement(username);
	}

	public WebElement passwordField(WebDriver driver) {
		return driver.findElement(passwoord);
	}

	public WebElement submitButton( WebDriver driver) {
		 return driver.findElement(submit);
	}
}
