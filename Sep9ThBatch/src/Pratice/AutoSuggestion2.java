package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestion2 {

	@Test
	public void autoSuggestion() throws Throwable 
	{
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Bluetooth");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("li"));
		for(WebElement wb:list)
		{
			System.out.println(wb.getText());
		if(wb.getText().contains("bluetooth speakers"))
			{
		
				wb.click();
				break;
			}
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
