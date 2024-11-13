package TestNgFeatures;

import org.testng.annotations.Test;

public class Keywords8 
{
	//Q - if you want to handle exception without try catch  block so how will u hadle it 
	//ans- BY Using excepectedException
	//ExcepectedException= Exceptiontype.class)
	@Test(expectedExceptions = ArithmeticException.class)
	public void Test1()
	{
		System.out.println("Handle arithmeticexception");
		int i =10/0;
	}

}
