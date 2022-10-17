package Pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utility.Excel_File;
import Generic_Utility.Property_File;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		
			String Key="webdriver.chrome.driver";
			String Value="./chromedriver.exe";
			System.setProperty(Key, Value);
			WebDriver driver=new ChromeDriver();
			
			Property_File plib=new Property_File();
		String URL = plib.getPropertyKeyValue("url2");
		driver.get(URL);
		System.out.println(URL);

		Excel_File elib=new Excel_File();
			String data = elib.getExcelData("ActiTime", 0, 0);
			
    WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
			search.sendKeys(data);
			search.click();
			driver.close();
			
			
			
			
			
			
			
	}

}
