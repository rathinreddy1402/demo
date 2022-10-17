package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload {

	@Test
	public void upload() {
		
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.monsterindia.com/");
			driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
			WebElement file = driver.findElement(By.id("file-upload"));
			file.sendKeys("C:\\Users\\Shobha\\Downloads\\extentReportDoc.txt");
			System.out.println("uploaded sucessfully");
	}

}
