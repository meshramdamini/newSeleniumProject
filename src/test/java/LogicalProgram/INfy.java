package LogicalProgram;

public class INfy {

	public static void main(String[] args) 
	{
		//String count
		
		String s= "Welcome";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='c') 
			{
				count++; 
			}
		}
		System.out.println(count);
		
		
	}
}
