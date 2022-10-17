package Pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Generic_Utility.Property_File;


public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();

		Property_File plib=new Property_File();
		String URL = plib.getPropertyKeyValue("url");
		String USERNAME = plib.getPropertyKeyValue("username");
		String PASSWORD = plib.getPropertyKeyValue("password");
		
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();
//		WebElement click = driver.findElement(By.xpath("(//div[@class='popup_menu_icon']/div[@class='menu_icon'])[2])"));
//		Actions act=new Actions(driver);
//		act.contextClick(click);
		
	}

}
