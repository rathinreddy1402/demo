package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Property_File {

	public String getPropertyKeyValue(String key) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./commom_proprty.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
	     String value = pro.getProperty(key);
		return value;
	}
}
