package TestNgAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	SoftAssert soft = new SoftAssert();
	@Test(priority = 1)
	public void DemoTest()
	{
		System.out.println("Execution Started for DemoTest");
		soft.assertEquals("Welcome","Welcome");
		
	    soft.assertEquals("Selenium","Selenium");
	    System.out.println("Successfully passed DemoTest");
	    soft.assertAll();
	    //it collect the result of all the assertion and in case of any failure mark the test as faild
	    
	    
	}
	@Test(priority = 2)
	public void demotest2()
	{
		System.out.println("Execution Started for DemoTest2");
		soft.assertEquals("Welcome","Welcome");
		soft.assertTrue(true);
		soft.assertEquals(true, true);
		System.out.println("Successfully passed demotest2");
		soft.assertAll();
	}
	

}
