package UdemyInheritance;

import org.testng.annotations.BeforeMethod;

public class P1 
{
	public void display()
	{
		System.out.println("display method ");
	}

	@BeforeMethod
	public void BM()
	{
		System.out.println("run me first");
	}
	@BeforeMethod
	public void BM1()
	{
		System.out.println("run me last");
	}
	
}
