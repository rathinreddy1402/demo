package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Throwable {

		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(1000);
//select by index
WebElement daylist = driver.findElement(By.id("day"));
Select s =new Select(daylist);
s.selectByIndex(19);//index starts from 0

WebElement monthlist = driver.findElement(By.id("month"));
Select sel=new Select(monthlist);
sel.selectByValue("10");


WebElement yearlist = driver.findElement(By.id("year"));
Select sel1=new Select(yearlist);
sel1.selectByVisibleText("1978");


//select by value
/*WebElement monthlist = driver.findElement(By.id("month"));
Select s1=new Select(monthlist);
s1.selectByValue("11");

//select by visible Text
WebElement yearlist = driver.findElement(By.id("year"));
Select s2=new Select(yearlist);
s2.selectByVisibleText("2020");*/






	}

}
