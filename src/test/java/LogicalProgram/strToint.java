package LogicalProgram;



public class strToint {

	public static void main(String[] args)  
	{
        //addition of each number
	    String str = "1234";
	    
	    int sum=0;
	    
	   char []charArray=str.toCharArray();
	    	for(int i=0 ;i<str.length();i++)
	    	{
	    		char ch =charArray[i];
	    		String str1=Character.toString(ch);
	    		int num = Integer.parseInt(str1);
	    		sum=sum+num;
	    	}
		System.out.println("additiom of number :" +sum);
		
		
		}
	}
		
		
	

