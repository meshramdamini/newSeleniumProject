package LogicalProgram;

public class p {

	public static void main(String[] args) 
	{
		// reverse String palindrome
		
		String str = "Damini";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not palindrome");
		}
	
	}
	
}
	
	
	
	
	
	
	
	
	
