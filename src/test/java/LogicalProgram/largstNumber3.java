package LogicalProgram;

public class largstNumber3 {

	public static void main(String[] args) 
	{
		int a=50,b=30,c=20,d=40,e=10;
		
		if(a>b && a>c && a>d && a>e)
		{
			System.out.println(a+ ": a is largest number");
		}
		else if (b>a && b>c && b>d && b>e)
		{
			System.out.println(b+ ": b is largest number");
		}
		else if (c>a && c>b && c>d && c>e)
		{
			System.out.println(c+ ": c is largest number");
		}
		
		else if (d>a && d>b && d>c && d>e) 
		{
			System.out.println(d+ ": d is largest number");
		}
		else 
		{
			System.out.println(e+ ": e is largest number");			
		}
		
	}

}
