package TestNgAssertionMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue 
{
	//assertTrue() method use to verify condition are true or false,
	//if condition is true output is pass otherwise fail.
	
	@Test
	public void TC1()
	{
	boolean result = true;
	Assert.assertTrue(result);
	}
	
	@Test
	public void TC2()
	{
	boolean result = true; //false the fail
	Assert.assertTrue(result);
	}

}
