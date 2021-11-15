package testNG.practice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

@Listeners(com.vtiger.genericLib.ListenerImp.class)
public class SampleScreenShotTest extends BaseClass {
	
	@Test
	public void creatingError()
	{
		System.out.println(10/0);
	}
	
	//@Test
	public void modifyOrganisation()
	{
		System.out.println("Modify the Organisation");
	}
	

}
