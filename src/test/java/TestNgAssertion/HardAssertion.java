package TestNgAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertion 
{
	@Test(priority = 1)
	public void DemoTest()
	{
		Assert.assertTrue(true);
		System.out.println("Hello good morning");
		
		Assert.assertEquals("Welcome","welcome");
		System.out.println("Hello");
		
		Assert.assertEquals("damini","damini");
		System.out.println("succsesfully passed");
	}
	@Test(priority = 2)
	public void demoTest1()
	{
		System.out.println();
		Assert.assertTrue(true);
		System.out.println("Good mornig");
		
		Assert.assertNotEquals("Selenium","selenium");
	    System.out.println("Successfully passed");
	}

}
