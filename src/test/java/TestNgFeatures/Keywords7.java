package TestNgFeatures;

import org.testng.annotations.Test;

public class Keywords7 
{
	//Exceptiontimeout
	@Test(timeOut = 10000)
	public void infiniteloop()
	{
		for(;;)
		{
			System.out.println("Hello");
		}
	}

}
