package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
 driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.name("q")).sendKeys("bluetooth");
    List<WebElement> list = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
    Thread.sleep(1000);
for(WebElement wb:list)
{
	System.out.println(wb.getText());
	if(wb.getText().contains("bluetooth speakers"))
	{
		wb.click();
		break;
	}
}
    System.out.println("Total suggestion is:"+list.size());
    
   
	}


}