package LogicalProgram;

public class LargestNumber {

	public static void main(String[] args) 
	{
		// find the largrst number without using loop
		int a=10,b=20,c=30;
		
		if(a>b && a>c)
		{
			System.out.println(a +": a is largest number");
		}
		else if(b>a && b>c) 
		{
			System.out.println(b +": b is largest number");
		}
		else 
		{
			System.out.println(c+": c is largest number");
		}
	}
 
}
