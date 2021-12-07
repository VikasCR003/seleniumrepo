package Package200Sessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class12PaginationDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//table[@class='table table-bordered'] //tr //th[1]")).click();

		// now here we don't have the rice parameter in coloumn A, so we need to select
		// to the next page where we can see rice, we can do this by using for loop or
		// uise do while loop

		// here what ever the final value we get will be greater than 1 , then only our
		// stream pipe will work , elese we should click on next butoon - this is called
		// paninagtion

		// using Do while loop -> do this while you have condition like this,- this is
		// okay when you have 1 product value to get , if you have multiple then conver
		// it to AL , via stream and use the same

		List<String> Finalvalue; // gloabally defining the type as List<Stringk> so the word finalvalue is used
									// in both do and while loop
		do {
			List<WebElement> Originalsort = driver.findElements(By.xpath("//tr//td[1]"));
			Finalvalue = Originalsort.stream().filter(s -> s.getText().contains("Rice")).map(s -> getvalues(s))
					.collect(Collectors.toList());
			// in the very first time it wont give the value,as the 1st page does not
			// contain any rice so the returned value will be null, you will the exact value
			// when the rice parameter is hit
			Finalvalue.forEach(s -> System.out.println(s));

			if (Finalvalue.size() < 1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}

		} while (Finalvalue.size() < 1);
	}

	private static String getvalues(WebElement s) {
		// TODO Auto-generated method stub
		String value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}
}