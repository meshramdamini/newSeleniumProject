package LogicalProgram;

public class Practice 
{
	public static void main(String[] args) 
	{  
		
		//reverse String
		 //0,1,2,3,4,5
		String s = "Damini";
		
		String rev = " ";
		
		//s.lenght=5
		for (int i= s.length()-1; i>=0 ;i--)
		{
			rev= rev+ s.charAt(i);
		}
		
		System.out.println(rev);
		
	}
	}



