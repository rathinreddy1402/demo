package Pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericRepo.CommomProperty;
import ObjectRepository.LoginPage;

public class Sample {

	public static void main(String[] args) throws Throwable {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();

	CommomProperty pro=new CommomProperty();
	
	String URL = pro.getPropertyKeyValue("url");
	String UN = pro.getPropertyKeyValue("username");
	String PW = pro.getPropertyKeyValue("password");
	
	driver.get(URL);
	LoginPage login=new LoginPage(driver);
	login.loginToApp(UN, PW);
	

	
	}

}
