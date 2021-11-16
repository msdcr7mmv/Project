package DDT.practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadTheDataFromPropertiesFileTest {
	
	@Test
	public void readDataFromPropertiesFileTest() throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data/commonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		String UN = p.getProperty("username");
		String PWD = p.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
		
	}

}
