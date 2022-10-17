package GenericRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CommomProperty {
/**
 * This method is used for Login
 * @param Key
 * @return
 * @throws Throwable
 * @author Shobha
 */
	public String getPropertyKeyValue(String Key) throws Throwable
	{
		FileInputStream fis =new FileInputStream("./commom_proprty.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		
		String value = pro.getProperty(Key);
		return value;
		
	}
}
