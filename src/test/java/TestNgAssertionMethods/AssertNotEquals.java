package TestNgAssertionMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals 
{   
	//assertNotEquals() method used to verify expected and actual result, 
	//if both results are not same then output is pass otherwise fail.
	@Test
	public void TC1()
	{
	String exp="hi";
	String act="hello";
	Assert.assertNotEquals(exp, act);
	}
	
	@Test
	public void TC2()
	{
	String exp="hi";
	String act="hello";
	Assert.assertNotEquals(exp, act, "both results are different");

	}
}
