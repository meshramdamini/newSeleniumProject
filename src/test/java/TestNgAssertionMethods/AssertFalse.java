package TestNgAssertionMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse 
{
	//assertTrue() method use to verify condition are true or false,
	//if condition is false output is pass otherwise fail.
	@Test
	public void TC1()
	{
	boolean result = false;
	Assert.assertFalse(result);;
	}
	
	@Test
	public void TC2()
	{
	boolean result = false; //true then fail
	Assert.assertFalse(result);
	}

}
