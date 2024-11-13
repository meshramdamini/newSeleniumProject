package groups;

import org.testng.annotations.Test;

public class GroupAttribute 
{
	@Test(groups = "software company")
	public void infosys()
	{
		System.out.println("infosys");
	}

	@Test(groups = "software company")
	public void accnture()
	{
		System.out.println("accnture");
	}
	
	@Test(groups = "Automobile")
	public void creta()
	{
		System.out.println("creta");
	}
	
	@Test(groups = "Automobile")
	public void maruti()
	{
		System.out.println("maruti");
	}
}

