package com.vtiger.testscripts;

import org.testng.annotations.Test;

import com.vtiger.genericLib.PropertyFileUtility;

public class Testcase {
	@Test
	public void testcase() throws Throwable
	{
		PropertyFileUtility pUtil = new PropertyFileUtility();
		System.out.println(pUtil.propertyFileUtility("username"));
	}

}
