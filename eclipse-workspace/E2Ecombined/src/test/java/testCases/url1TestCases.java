package testCases;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import poModles.url1;
import resources.resourceBaseFile;

public class url1TestCases extends resourceBaseFile {

	public static Logger log = LogManager.getLogger(url1TestCases.class.getName());
	public WebDriver driver;
	public String url;

	@BeforeTest
	public void staticDropDownCase0() throws IOException {
		driver = initiatingDriver();
		// driver.manage().deleteAllCookies();
		log.info("Driver has started");
	}

	@Test
	public void staticDropDownCase1() throws IOException {
		url1 url1obj = new url1(driver);
		url = pro.getProperty("url1");
		driver.get(url);
		url1obj.currencyDropDown().click();
		System.out.println("currencyDropDown button has been clicked.");

		log.info("Case1 Completed");
	}

	@Test
	public void staticDropDownCase2() throws IOException {

		url1 url1obj = new url1(driver);
		driver.get(url);
		Select sel = new Select(url1obj.currencyDropDown());
		List<WebElement> options = sel.getOptions();

		for (int i = 0; i < options.size(); i++) {

			String optionNames = options.get(i).getText();
			System.out.println("This are all the options = " + optionNames);
		}

		sel.selectByIndex(0);
		System.out.println(sel.getFirstSelectedOption().getText());
		url1obj.currencyDropDown().click();
		sel.selectByValue("USD");
		System.out.println(sel.getFirstSelectedOption().getText());
		url1obj.currencyDropDown().click();
		sel.selectByVisibleText("INR");
		System.out.println(sel.getFirstSelectedOption().getText());

		System.out.println("The Final Currency is INR");
		log.info("Case2 Completed");
	}

	@Test
	public void staticDropDownCase3() throws InterruptedException {

		driver.get(url);
		url1 url1obj = new url1(driver);
		url1obj.fromDropDown().click();
		Thread.sleep(5000L);
		List<WebElement> fromOptions = driver.findElements(By.xpath("//div[@class='dropdownDiv'] //ul //a"));
		System.out.println(fromOptions.size());
		// Assert.assertEquals(true, false); ********* failing the method
		for (int a = 0; a < fromOptions.size(); a++) {
			String texts = fromOptions.get(a).getText();
			System.out.println("This are the options = " + texts);

			if (texts.contains("Bengaluru")) {
				driver.findElements(By.xpath("//div[@class='dropdownDiv'] //ul //a")).get(a).click();
				System.out.println(url1obj.fromDropDown().getText());
				System.out.println("The from location has been selected");
				break;
			} else {
				System.out.println("The FROM Location is not available");
			}
		}
		log.info("Case3 Completed");
	}

	@Test
	public void staticDropDownCase4() throws InterruptedException {

		driver.get(url);
		url1 url1obj = new url1(driver);
		url1obj.autoSuggestiveDropDown().click();
		url1obj.autoSuggestiveDropDown().sendKeys("ba");
		Thread.sleep(3000L);
		List<WebElement> suggestiveOptions = driver.findElements(By.xpath("//ul[@id='ui-id-1'] //a"));
		System.out.println("This is the size of options = " + suggestiveOptions.size());

		for (int b = 0; b < suggestiveOptions.size(); b++) {
			String suggestiveTexts = suggestiveOptions.get(b).getText();

			System.out.println("This are the options = " + suggestiveTexts);

			if (suggestiveTexts.equalsIgnoreCase("Bahamas")) {

				driver.findElements(By.xpath("//ul[@id='ui-id-1'] //a")).get(b).click();
				System.out.println("The option is selected");
				break;
			} else {
				System.out.println("The selected option is not available");
			}
			log.info("Case4 Completed");
		}

		System.out.println(driver.findElement(By.xpath("//input[@id='autosuggest']")).getText());
	}

	@Test
	public void staticDropDownCase5() {

		driver.get(url);
		url1 url1obj = new url1(driver);
		String serachText = url1obj.searchOption().getText();
		System.out.println(serachText);
		Assert.assertEquals(serachText, "Seachhhhasd");
		log.error("Case5 has failed ");
	}

	@Test
	public void staticDropDownCase6() {

		driver.get(url);
		List<WebElement> checkBoxOptions = driver.findElements(By.xpath("//div[@id='discount-checkbox'] //label"));
		System.out.println("This is the size of the checklist =" + checkBoxOptions.size());

		for (int c = 0; c < checkBoxOptions.size(); c++) {

			String checkBoxTexts = checkBoxOptions.get(c).getText().trim();

			if (checkBoxTexts.contains("Senior")) {
				checkBoxOptions.get(c).click();

				System.out.println("The checkbox is selected");

			} else {

				System.out.println("Invalid checkbox");

			}
		}

		url1 url1obj = new url1(driver);

		System.out.println(url1obj.checkBoxOptions().isSelected());
	}

	@Test
	public void staticDropDownCase7() {

		driver.get(url);
		url1 url1obj = new url1(driver);
		url1obj.calenderSelect().click();

		List<WebElement> months = url1obj.calMonths();

		for (WebElement month : months) {

			String monthText = month.getText();
			System.out.println("This are the month =" + monthText);
			if (monthText.contains("October")) {

				List<WebElement> dates = url1obj.calDates();

				for (WebElement date : dates) {
					String dateText = date.getText();
					String dateAttribute = date.getAttribute("class");
					System.out.println("This are the available dates = " + dateText);

					if (dateText.equalsIgnoreCase("28")) {

						if (dateAttribute.contains("ui-state-disabled")) {

							System.out.println("The date has been disabled please select Different date");
							break;
						} else {

							date.click();
							System.out.println("Date has been selected ");
							break;
						}

					} else {
						System.out.println("Date has been not selected ");
						System.out.println(url1obj.calenderSelect().getText());
					}

				}

				System.out.println("The month is been selected");
				break;

			} else {
				System.out.println("Month is not selected");
			}

		}

	}

	@Test
	public void staticDropDownCase8() throws InterruptedException {

		driver.get(url);
		url1 url1obj = new url1(driver);
		url1obj.passengerButtonClick().click();
		Thread.sleep(3000L);

		List<WebElement> passengerOpt = url1obj.passengerOptions();

		System.out.println("This is the length of passenger options =" + passengerOpt.size());

		for (WebElement option : passengerOpt) {
			String optionText = option.getText();

			System.out.println("This is the option Text =" + optionText);

			if (optionText.contains("CHILD")) {
				int i = 0;
				while (i < 4) {
					driver.findElement(By.xpath("//div[@class='ad-row-right'] //span[@id='hrefIncChd']")).click();
					Thread.sleep(3000L);
					i++;
				}
			} else {
				System.out.println("Please select the correct option");
			}

		}

		System.out.println(url1obj.passengerButtonClick().getText());
	}

	@AfterTest
	public void staticDropDownCase9() {

		driver.close();

	}

}
