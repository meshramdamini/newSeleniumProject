package LogicalProgram;


public class RevString {

	public static void main(String[] args) 
	{
		
		//reverse string
		
		String s = "Damini";
		
		String rev= "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}


}
