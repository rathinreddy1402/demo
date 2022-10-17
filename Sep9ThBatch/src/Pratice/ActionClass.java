package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
	String Key="webdriver.chrome.driver";
	String Value="./chromedriver.exe";
	System.setProperty(Key, Value);
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
/*	driver.get("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 WebElement data = driver.findElement(By.xpath("//div[text()='Electronics']"));
	
	 Actions act=new Actions(driver);
	 act.moveToElement(data).perform();
	 act.contextClick(data).perform();*/
	
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	
	//Action class
	Actions act=new Actions(driver);
	//act.dragAndDrop(drag, drop).perform();
	
	act.clickAndHold(drag).perform();
	act.release(drop).perform();
	
	
	
	
}}