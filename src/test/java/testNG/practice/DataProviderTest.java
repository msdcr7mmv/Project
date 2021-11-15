package testNG.practice;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider
	public Object[][] bankdb1()
	{
		Object[][] obj=new Object[3][2];

		obj[0][0]="Dove";
		obj[0][1]=12345;

		obj[1][0]="Lucky";
		obj[1][1]=78945;

		obj[2][0]="Candy";
		obj[2][1]=44227;
		return obj;


	}

	@Test(dataProvider="bankdb1")
	public void details(String name, int price)
	{
		Reporter.log("Name of Bird: "+name+" .It's price is : "+price,true);
	}

}
