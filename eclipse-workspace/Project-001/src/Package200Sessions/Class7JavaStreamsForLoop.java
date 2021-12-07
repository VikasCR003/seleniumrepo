package Package200Sessions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7JavaStreamsForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Using Array List
		ArrayList<String> names = new ArrayList<String>();
		names.add("Apple");
		names.add("Asia");
		names.add("Mexico");
		names.add("Africa");
		// using Array
		String[] places = { "Belgium", "Antartica", "London", "Lybia" };
		System.out.println("THis is List of array"+ names);
		System.out.println("This is array " + places);
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String index = names.get(i);

			if (index.startsWith("A")) {
				String printname = index.indent(i);
				
				System.out.println(printname);
				count++;

			}
		}
System.out.println("This is the total number of names start with letter A = " + count);
	}

}
