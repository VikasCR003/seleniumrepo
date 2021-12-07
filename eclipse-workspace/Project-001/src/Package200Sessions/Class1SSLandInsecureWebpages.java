package Package200Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Class1SSLandInsecureWebpages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating object for desiredcapabilities
		DesiredCapabilities ch = new DesiredCapabilities();
		// Desired capabilites for chrome
		ch.chrome();
		// Accept insecure sites
		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// creating object for chrome options
		ChromeOptions c = new ChromeOptions();
		// passing the desired capability knowledge to chrome options
		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		//invoking the browser which has iunsecure OT sll CETIFICATIon error - this time driver will accept
		driver.get("googl.com");
		driver.close();

	}

}
