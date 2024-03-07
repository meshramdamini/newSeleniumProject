package LogicalProgram;

public class FibonnaciSeries {

	public static void main(String[] args) 
	{ //C= 0,1,1,2,3,5,8,13
		int a=0; int b=1;
		int c;
		System.out.println( " " +a);
		System.out.println( " " +b);
		for(int i=1 ; i<=10;i++)
		{
			c=a+b; 
			System.out.println(" " +c);  
			
			a=b; 
			b=c; 
		}
		
		
	}

}
