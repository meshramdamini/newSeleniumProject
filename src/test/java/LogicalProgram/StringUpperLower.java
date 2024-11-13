package LogicalProgram;



public class StringUpperLower {

	public static void main(String[] args) 
	{
		String s = "WelCome TO The wORLD OF Java";
		
		int upper=0;
		int lower=0;
		
		for(int i=0; i<s.length();i++)
		{
			//s
			char ch = s.charAt(i);
			//System.out.println(ch);
			
			// Check if the character is uppercase 
            if (Character.isUpperCase(ch)) 
            {
            	upper++;
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) 
            {
            	lower++;
            } 
		}
       
		System.out.println("number of upper case:"+upper);
		System.out.println("number of lower case:"+lower);


	}

}
