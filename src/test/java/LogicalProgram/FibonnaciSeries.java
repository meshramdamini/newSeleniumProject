package LogicalProgram;

public class FibonnaciSeries {

	public static void main(String[] args) 
	{ //0,1,1,2
		int a=0;  
		int b=1;
		int c;
		
		for(int i=1; i<=10; i++)
		{
			c=a+b; //0+1=1
			System.out.println(c);
			a=b; //a=1
			b=c; //b=1
		}
		
		
	}

}
