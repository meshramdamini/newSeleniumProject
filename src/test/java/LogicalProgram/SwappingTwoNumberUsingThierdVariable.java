package LogicalProgram;

public class SwappingTwoNumberUsingThierdVariable {

	public static void main(String[] args) 
	{ 
		int a=10,b=20,c;
		
		//using third variable
		//t=a; //10
		//a=b; //a=20
		//b=t; //b=10
		
		//System.out.println("a:"+a);
		//System.out.println("b:"+b);
		
		c=a; //c=10
		a=b; // a= 20
		b=c; // b=10
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	
	}


