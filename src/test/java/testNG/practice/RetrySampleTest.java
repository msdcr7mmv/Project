package testNG.practice;

import org.testng.annotations.Test;

public class RetrySampleTest {
	
	@Test(retryAnalyzer = com.vtiger.genericLib.RetryAnalyser.class)
	public void retryTest()
	{
		System.out.println(10/0);
	}

}
