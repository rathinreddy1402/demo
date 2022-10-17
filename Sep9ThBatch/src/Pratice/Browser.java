package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();

		//driver.get("https://demo.actitime.com/login.do");
		//driver.manage().window().maximize();

//driver.findElement(By.id("username")).sendKeys("admin");
//driver.findElement(By.name("pwd")).sendKeys("manager");
//driver.findElement(By.id("loginButton")).click();
//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
//driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
//driver.findElement(By.name("pwd")).sendKeys("manager");
//driver.findElement(By.xpath("//label[text()='Keep me logged in']")).click();
//driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
//driver.findElement(By.name("pwd")).sendKeys("manager");
//driver.findElement(By.xpath("//label[contains(text(),'Keep me logged in')]")).click();
	
	driver.get("https://www.amazon.com/");
	 //driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.linkText("Shop top categories")).click();
	String Url = driver.getCurrentUrl();
	System.out.println(Url);
	
	
	
	
	}

}
