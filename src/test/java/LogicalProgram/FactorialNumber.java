package LogicalProgram;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		
		//Ex-5*4*3*2*1=120
		//int number =5
		int fact =1;
		
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;//1=1*1=1 only i value change and assign to fact
			System.out.println(fact);
		}
		System.out.println("factorial of 5 is:"+fact);
		

	}

}
