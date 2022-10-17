package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		String month="November 2022";
		String date="25";
		
		//driver.findElement(By.xpath("//span[text()='From']")).sendKeys("Bangalore");
		
		//Dynamic Xpath
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::"
				+ "div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
		//driver.findElement(By.xpath("//span[text()='Done']")).click();
		//driver.findElement(By.xpath("//div[text()='October 2022']/ancestor::"
				//+ "div[@class='DayPicker-Month']/descendant::p[text()='30']")).click();
		
	}
	}


