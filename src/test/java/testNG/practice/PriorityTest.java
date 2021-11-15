package testNG.practice;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=1, invocationCount=3)
	public void create()
	{
		System.out.println("Creation is done");
	}

	@Test(dependsOnMethods="create")
	public void modify()
	{
		System.out.println("Modification is done");
	}

	@Test(dependsOnMethods="modify")
	public void delete()
	{
		System.out.println("Deletion is done");
	}





}

