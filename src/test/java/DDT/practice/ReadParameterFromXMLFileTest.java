package DDT.practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadParameterFromXMLFileTest {
	@Test
	public void readParamFromXMLFileTest(XmlTest xml)
	
	{
		System.out.println("execute Test1");
		
		String URL = xml.getParameter("url");
		System.out.println(URL);
	}

}
