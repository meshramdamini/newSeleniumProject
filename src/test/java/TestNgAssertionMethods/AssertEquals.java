package TestNgAssertionMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals 
{
	//assertEquals() method used to verify expected and actual result, 
	//if  both results are same then output is pass otherwise fail. 


	
		@Test
		public void TC1()
		{
		String exp="hi";
		String act="hi";
		Assert.assertEquals(act, exp);
		}
		@Test
		public void TC2()
		{
		String exp="hi";
		String act="hi";
		Assert.assertEquals(act,exp, "exp & act results are same");
		
		

	    }

}
