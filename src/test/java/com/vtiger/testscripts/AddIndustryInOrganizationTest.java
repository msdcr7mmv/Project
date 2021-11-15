package com.vtiger.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.JavaUtility;
import com.vtiger.genericLib.WebDriverUtility;


public class AddIndustryInOrganizationTest extends BaseClass {
	
	@Test
	public void addIndustryinOrganisationTest() throws Throwable
	{
		

//	public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		JSONFileUtility jUtil = new JSONFileUtility();
//		String URL = jUtil.jsonFileUtility("url");
//		String UN = jUtil.jsonFileUtility("username");
//		String PWD = jUtil.jsonFileUtility("password");
//		
//		ExcelUtility eUtil = new ExcelUtility();
		String orgname = eUtil.excelUtility("Sheet1", 1, 2)+JavaUtility.generateRandomNumber();
		String industryType = eUtil.excelUtility("Sheet1", 3, 3);
//		
//		
//		driver.get(URL);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(UN);
//		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(PWD);
//		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Organizations']//ancestor::td[@class=\"tabUnSelected\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys(orgname);
		WebElement industry = driver.findElement(By.xpath("//select[@name=\"industry\"]"));
		Select s = new Select(industry);
		s.selectByValue(industryType);
		WebDriverUtility wUtil = new WebDriverUtility();
		wUtil.SelectByValue(industry, industryType);
		
		driver.findElement(By.xpath("//input[@value=\"  Save  \"]")).click();
//		Thread.sleep(5000);
//		Actions ac = new Actions(driver);
//		WebElement signout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//		
//		ac.moveToElement(signout).perform();
//		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
		

	}

}
