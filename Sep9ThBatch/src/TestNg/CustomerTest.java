package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class CustomerTest {

	public void createCustomer()
	{

		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		
		System.out.println("ChromeBrowser Launched Sucessfully");
		driver.get("https://www.flipkart.com/");
	}
	

	/*public void modifyCustomer()
	{
	String Key="webdriver.gecko.driver";
	String Value="./geckodriver.exe";
	System.setProperty(Key, Value);
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("FireFoxBrowser Launched Sucessfully");
	driver.get("https://www.myntra.com/");
	
}

public void deleteCustomer()
{
	String Key="webdriver.edge.driver";
	String Value="./msedgedriver.exe";
	System.setProperty(Key, Value);
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.amazon.in/");
}*/
}