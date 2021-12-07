package Package200Sessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CLass11GetValuesByMappingCustomeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// clicking the 20 value staticdrop down
		WebElement Options = driver.findElement(By.xpath("//div[@Class='col-xs-4'] //select"));
		Select s = new Select(Options);
		List<WebElement> Alloptions = s.getOptions();
		System.out.println(Alloptions);
		s.selectByIndex(2);
		
		driver.findElement(By.xpath("//table[@class='table table-bordered'] //th[1]")).click();
		//getting all the click sorted names in one variable
		List<WebElement> clicksorted = driver.findElements(By.xpath("//table[@class='table table-bordered'] //tr //td[1]"));
		
		//just checking how, intermedite opeartion called filter method is giving us an outpurt
		 List<String> pricevalue1 = clicksorted.stream().filter(a->a.getText().contains("Beans")).map(a->a.getText()).collect(Collectors.toList());
		 System.out.println(pricevalue1); 
		 
		 //jsut check the same above output when there type is webelement what will be the output
		 List<WebElement> pricevalue2 = clicksorted.stream().filter(a->a.getText().contains("Beans")).collect(Collectors.toList());
		 System.out.println(pricevalue2); 
		 
		 List<String> pricevalue = clicksorted.stream().filter(a->a.getText().contains("Beans")).map(a->getvalues(a)).collect(Collectors.toList());
		 System.out.println(pricevalue);
		 pricevalue.forEach(b->System.out.println(b));
		driver.close();
	
	}
// here previously by default the method type will be object, we need to change to type string as we pass the return value using this melthod getvalues() ,once it has returned to upper strema we nee to print t
	// the value using foreach() so, we need to convert it to string type and use it will be of type strea,  , else you wont find .foreach() 
	private static String getvalues(WebElement a) { 
		// TODO Auto-generated method stub
		// if we use this to get the val;ue of beans we will get the oncorrect value as 64 instead of 34 , why?
		// The xpath which youu have written is of for the specific first element of vlaues coloumn as , you are traversing vi parent to child exact 1st value, the how ?
		// we need to sue following-sibling::td[1] method , to get the value of exact beans why?
		// as you can see that the method getvalues() is already passing teh exasct product name , whose value to be featched out , so need not write parent to cild traverse method , instead we use following::sibling method
		
		/* dont use this
		String value1 = a.findElement(By.xpath("//table[@class='table table-bordered'] //tr//td[1]/following-sibling::td[1]")).getText();
		*/
		String value = a.findElement(By.xpath("following-sibling::td[1]")).getText();  //importance of following::sibling method

		//try returing value1 to see incorrect value 64
		return value;
		
	}

}
