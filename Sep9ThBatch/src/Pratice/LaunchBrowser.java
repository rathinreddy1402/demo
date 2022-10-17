package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws Throwable {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();//override
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/*	//get(Url)
		driver.get("https://demo.actitime.com/login.do");
		//maximize screen
	driver.manage().window().maximize();
	 //xpath by attribute
	/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	//xpath by visibleText
	String text = driver.findElement(By.xpath("//label[text()='Keep me logged in']")).getText();
	System.out.println(text);*/
	Thread.sleep(2000);
	//xpath by contains Attribute
	WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
	username.sendKeys("admin");
	Thread.sleep(2000);
	
	/*driver.findElement(By.name("pwd")).sendKeys("manager");
	//xpath by contains visible text
	//String text = driver.findElement(By.xpath("//label[contains(text(),'Keep me logged')]")).getText();
	//System.out.println(text);
	
	//xpath by multiple Attribute
	String data = driver.findElement(By.xpath("//label[@id='keepLoggedInLabel' and text()='Keep me logged in']")).getText();
	System.out.println(data);
	
	//xpath by index value
	driver.findElement(By.xpath("(//a[contains(text(),'Time-Track')])[4]")).click();*/
}
}
