package testNG.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTest {
	
	@BeforeSuite
	public void connectToDataBase()
	{
		System.out.println("Connect to Data Base");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Launch/Open the Browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login into the Application");
	}
	@Test
	public void createOrganization()
	{
		System.out.println("Create the Organization");
	}
	
	@Test
	public void modifyOrganization()
	{
		System.out.println("Modify the Organization");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("LogOut from the Apllication");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close the Browser");
	}
	
	@AfterSuite
	public void disConnectToDataBase()
	{
		System.out.println("DisConnect to the Data Base");
	}
	
	

}
