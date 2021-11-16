package com.vtiger.testscripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.JavaUtility;
import com.vtiger.genericLib.WebDriverUtility;

public class GroupingTheMultiplePrgmsTest extends BaseClass {
	
	@Test(groups="smokeTest")
	public void addContactOfOrganizationTest() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		WebElement ad = driver.findElement(By.xpath("//select[@name=\"salutationtype\"]"));
		Select s = new Select(ad);
		s.selectByValue("Mr.");
		//driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Raj");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//img[@title=\"Select\"])[1]")).click();
		System.out.println("Good");
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

	}
	
	
	@Test(groups="regTest")
	public void addIndustryinOrganisationTest() throws Throwable
	{
		String orgname = eUtil.excelUtility("Sheet1", 1, 2)+JavaUtility.generateRandomNumber();
		String industryType = eUtil.excelUtility("Sheet1", 3, 3);
		
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
		
	}

}

