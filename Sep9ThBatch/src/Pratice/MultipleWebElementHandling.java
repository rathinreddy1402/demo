package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElementHandling {

	public static void main(String[] args) {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
 driver.findElement(By.xpath("//button[text()='✕']")).click();
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	
	int count=0;
	//forEach Loop
	for(WebElement wb:allLinks)
	{
		System.out.println(wb.getText());
		count++;//1 2 3 4
	}
	System.out.println("Total number of links:"+count);
	
	}

}
