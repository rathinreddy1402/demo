package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	//	WebElement search = driver.findElement(By.name("q"));
	//search.sendKeys("selenium");
	//search.submit();
		
	WebElement link = driver.findElement(By.xpath("//div[text()='Electronics']"));
	String val = link.getText();
	System.out.println(val);
	}

}
