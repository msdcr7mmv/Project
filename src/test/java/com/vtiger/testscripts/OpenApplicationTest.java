package com.vtiger.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.JavaUtility;

public class OpenApplicationTest extends BaseClass {
	
	@Test
	public void openApplicationTest() throws InterruptedException
	{

//	public static void main(String[] args) throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		PropertyFileUtility pUtil = new PropertyFileUtility();
//		String URL = pUtil.propertyFileUtility("url");
//		String UN = pUtil.propertyFileUtility("username");
//		String PWD = pUtil.propertyFileUtility("password");
//		
//		ExcelUtility eUtil = new ExcelUtility();
////		String orgname = eUtil.excelUtility("Sheet1", 1, 2)+JavaUtility.generateRandomNumber();
////		String industryType = eUtil.excelUtility("Sheet1", 3, 3);
////		String lastname = eUtil.excelUtility("Sheet1", 5, 3);
////		
//		
//		
//		driver.get("http://localhost:8888/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Organizations']//ancestor::td[@class=\"tabUnSelected\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys("TYSS3"+JavaUtility.generateRandomNumber());
		driver.findElement(By.xpath("//input[@value=\"  Save  \"]")).click();
		Thread.sleep(5000);
//		Actions ac = new Actions(driver);
//		WebElement signout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//		
//		ac.moveToElement(signout).perform();
//		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
	}

}
