package LogicalProgram;

public class SwappingTwoNumber1 {

	public static void main(String[] args) 
	{
		//Swapping of two number without using third variable
		
		int a=10, b=20;
		
	a=a+b; //30
	b=a-b; //30-20 =10
	a=a-b; //30-10 =20
	
	System.out.println("a :"+a);
	System.out.println("b :"+b);  
	
	}

}
