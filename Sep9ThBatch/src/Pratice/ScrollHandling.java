package Pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollHandling {

@Test
		public void scroll() throws Throwable
		{

		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
 driver.findElement(By.xpath("//button[text()='✕']")).click();
 driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);

 
 Robot r =new Robot();
 r.keyPress(KeyEvent.VK_PAGE_DOWN);
 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
 
 Thread.sleep(1000);
 r.keyPress(KeyEvent.VK_PAGE_DOWN);
 r.keyRelease(KeyEvent.VK_PAGE_DOWN);

// Thread.sleep(1000);
//  r.keyPress(KeyEvent.VK_PAGE_DOWN);
// r.keyRelease(KeyEvent.VK_PAGE_DOWN);
// 
// Thread.sleep(1000);
// r.keyPress(KeyEvent.VK_PAGE_UP);
// r.keyRelease(KeyEvent.VK_PAGE_UP);
// 
 
 
 
 
 
	}

}
