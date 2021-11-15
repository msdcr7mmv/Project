package com.vtiger.testscripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;


public class AddContactOfOrganizationTest extends BaseClass {

	@Test
	public void addContactOfOrganizationTest() throws Throwable
	{
	
	//public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		PropertyFileUtility pUtil = new PropertyFileUtility();
//		String URL = pUtil.propertyFileUtility("url");
//		String UN = pUtil.propertyFileUtility("username");
//		String PWD = pUtil.propertyFileUtility("password");
//		
//		ExcelUtility eUtil = new ExcelUtility();
//		String orgname = eUtil.excelUtility("Sheet1", 1, 2)+JavaUtility.generateRandomNumber();
//		String industryType = eUtil.excelUtility("Sheet1", 3, 3);
//		String lastname = eUtil.excelUtility("Sheet1", 5, 3);
//		
		
		
//		driver.get(URL);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(UN);
//		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(PWD);
//		
//		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
//		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		WebElement ad = driver.findElement(By.xpath("//select[@name=\"salutationtype\"]"));
		Select s = new Select(ad);
		s.selectByValue("Mr.");
		//driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Raj");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//img[@title=\"Select\"])[1]")).click();
		Thread.sleep(3000);
		
		
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());
		String parentTitle = driver.getTitle();
		String pw = driver.getWindowHandle();
		for(String wh:allwh)
		{
			String title = driver.switchTo().window(wh).getTitle();
			if(!title.equals(parentTitle))
			{
				driver.switchTo().window(wh);
				Thread.sleep(3000);
				driver.findElement(By.id("2")).click();
			}
			driver.switchTo().window(pw);
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=\"  Save  \"]")).click();
//		Thread.sleep(5000);
//		Actions ac = new Actions(driver);
//		WebElement signout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//		
//		ac.moveToElement(signout).perform();
//		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
//	

	}

}
