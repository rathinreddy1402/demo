package Pratice;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws Throwable {
	
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
	
	
	FileInputStream fis =new FileInputStream("./commom_proprty.properties.txt");
	Properties pro=new Properties();
	pro.load(fis);
	
	String URL = pro.getProperty("url");
	String UN = pro.getProperty("username");
	String PW = pro.getProperty("password");
	
	driver.get(URL);
	driver.findElement(By.id("username")).sendKeys(UN);
	driver.findElement(By.name("pwd")).sendKeys(PW);
	driver.findElement(By.id("loginButton")).click();
			 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		 driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		
		 //fetching data from excel
		 FileInputStream fis1=new FileInputStream("./TestData.xlsx");
          Workbook book= WorkbookFactory.create(fis1);
          Sheet sh=book.getSheet("ActiTime");
          Row row=sh.getRow(0);
          Cell cel=row.getCell(0);
          String data = cel.getStringCellValue();
		 
	 driver.findElement(By.name("name")).sendKeys(data);
	 driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		 
		 Alert alt = driver.switchTo().alert();
	 
	 String text = alt.getText();
	 System.out.println(text);
	 
	//alt.accept();
	 alt.dismiss();

	}

}
