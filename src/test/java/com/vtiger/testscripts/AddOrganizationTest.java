package com.vtiger.testscripts;



import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.PropertyFileUtility;
import com.vtiger.genericLib.WebDriverUtility;

public class AddOrganizationTest extends BaseClass {
	
	@Test
	public void addOrganizationTest() throws Throwable
	{
		@SuppressWarnings("unused")
		WebDriverUtility wUtil = new WebDriverUtility();
		PropertyFileUtility pUtil = new PropertyFileUtility();
		@SuppressWarnings("unused")
		String URL = pUtil.propertyFileUtility("url");
		@SuppressWarnings("unused")
		String UN = pUtil.propertyFileUtility("username");
		
		
	}

}
