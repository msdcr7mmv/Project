package testNG.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTest1 {
	
	@BeforeSuite
	public void connectToDataBase()
	{
		System.out.println("Connect to DataBase");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Open the Browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login into Apllication");
	}
	
	@Test
	public void createOrganisation()
	{
		System.out.println("Create the Organisation");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("LogOut from the Application");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close the Browser");
	}
	
	@AfterSuite
	public void disConnectToDataBase()
	{
		System.out.println("DisConnect to DataBase");
	}

}
