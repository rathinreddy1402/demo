package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws Throwable {

		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
     
     //keys class
  /*   WebElement daylist = driver.findElement(By.id("day"));
      daylist.click();
     Thread.sleep(1000);
     daylist.sendKeys(Keys.ARROW_UP);
     daylist.sendKeys(Keys.ARROW_DOWN)
     daylist.sendKeys(Keys.ARROW_DOWN);*/
     
     //Select class
     WebElement daylist = driver.findElement(By.id("day"));
     Select day=new Select(daylist);
     day.selectByIndex(19); //0
     
     WebElement monthlist = driver.findElement(By.id("month"));
     Select month=new Select(monthlist);
     month.selectByValue("5");
     
     WebElement yearlist = driver.findElement(By.id("year"));
     Select year=new Select(yearlist);
     year.selectByVisibleText("2006");
	}

}
