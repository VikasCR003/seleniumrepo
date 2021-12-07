package poModles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class url1 {

	WebDriver driver;

	By currencyButton = By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']");

	By fromButton = By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']");

	By toButton = By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']");

	By autoSuggestiveButton = By.xpath("//input[@id='autosuggest']");

	By searchButton = By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']");

	By seniorCitizen = By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']");

	By calenderButton = By.xpath("//input[@id='ctl00_mainContent_view_date1']");

	By calenderMonths = By.xpath("//div[@class='ui-datepicker-title']");

	By calenderDates = By.xpath("//table[@class='ui-datepicker-calendar'] //td");

	By PassengerButton = By.xpath("//div[@class='paxinfo']");
	
	By PassengerDropDown = By.xpath("//div[@class='ad-row-left'] //label");
	
	

	public url1(WebDriver driver) {
		//PageFactory.initElements(this, driver);
		this.driver = driver;
	}

	public WebElement currencyDropDown() {

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver.findElement(currencyButton);
		
	}

	public WebElement fromDropDown() {

		return driver.findElement(fromButton);
	}

	public WebElement toDropDown() {

		return driver.findElement(toButton);

	}

	public WebElement autoSuggestiveDropDown() {

		return driver.findElement(autoSuggestiveButton);

	}

	public WebElement searchOption() {

		return driver.findElement(searchButton);

	}

	public WebElement checkBoxOptions() {

		return driver.findElement(seniorCitizen);

	}

	public WebElement calenderSelect() {

		return driver.findElement(calenderButton);
	}

	public List<WebElement> calMonths() {

		return driver.findElements(calenderMonths);

	}

	public List<WebElement> calDates() {

		return driver.findElements(calenderDates);
	}

	
	public WebElement passengerButtonClick() {
		return driver.findElement(PassengerButton);
	}
	
	
	public List<WebElement> passengerOptions() {
		return driver.findElements(PassengerDropDown);
	}
}
