package TestNgFeatures;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgEmailableRepotr 
{
	@Test
	public void OrangeHRMTest()
	{
		System.out.println("@Test--OrangeHRMTest");
		Reporter.log("Running OrangeHRM Test",true);
	}
	@Test
	public void OrangeHRMsearch()
	{
		System.out.println("@Test--OrangeHRMsearch");
		Reporter.log("search Test passed ",true);
	}

}
