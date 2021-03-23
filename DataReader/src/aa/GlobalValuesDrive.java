package aa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		{
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Automation_Practice\\DataReader\\data.properties");
			prop.load(fis);
			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("URL"));
			//Set another value for key browser
			prop.setProperty("browser", "firefox");
			System.out.println("value of browser now change to ="+prop.getProperty("browser"));
			//To change the browser value into the properties file
			FileOutputStream fos=new FileOutputStream("C:\\Automation_Practice\\DataReader\\data.properties");//creating output file object to store the new data
			
			prop.store(fos, null);//to store the new value of key to the file
			
			
			
		}

	}

}
