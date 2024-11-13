package UdemyInheritance;
import org.testng.annotations.Test;

public class P2 extends P1
{
	
	
	@Test
	public void TestRun()
	{
		
		PS2 ps= new PS2(3);
		int a= 3;
		
		System.out.println(ps.increament());
		System.out.println(ps.decreament());
		display();
		PS3 pz = new PS3(a);
		System.out.println(pz.multiplyTwo());
	}
	
	

}
