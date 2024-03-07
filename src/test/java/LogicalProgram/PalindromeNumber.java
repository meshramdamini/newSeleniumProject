package LogicalProgram;

public class PalindromeNumber 
{

	//PalindromeNumber number means reverse number of that number 
	public static void main(String[] args) 
	{
		int no =121;
		int temp=no;
		int rev=0,rem;
		
		while(temp!=0)
		{
			rem=temp%10; //121%10=1 , 12%10=2 ,  1%10= 1
			rev=rev*10+rem; //0+1=1 , 10+2=12 ,  12*10+1= 121
			temp=temp/10; //121/10=12 ,12/10=1 , 1/10 =0
		}
		if(no==rev) 
		{
			System.out.println(no+ ": number is palindrome ");
		}
		else 
		{
			System.out.println(no+ ": number is not palindrome ");
			
		}



	}

}
