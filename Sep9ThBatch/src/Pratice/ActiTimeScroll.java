package Pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeScroll {
	public static void main(String[] args) throws AWTException, Throwable {
			String Key="webdriver.chrome.driver";
			String Value="./chromedriver.exe";
			System.setProperty(Key, Value);
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			
			 Thread.sleep(1000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			 
			 
			 
			
			
			
	}

}
