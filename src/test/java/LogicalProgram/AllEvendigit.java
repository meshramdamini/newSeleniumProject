package LogicalProgram;

public class AllEvendigit {

	public static void main(String[] args) 
	{
		int start = 1;
		int end= 100;
		
		for(int i= start; i<=end; i++)
		{
			boolean alldigiteven=true;
			int num =i;
			
			while(num>0) 
			{
				int digit=num%10;
				
				if(digit%2!=0)
				{
					alldigiteven = false;
					break;
				}
				num= num/10;
			}
			if(alldigiteven)
			{
				System.out.println(" all digits of the number is even for :"+ i);
			}
		}


	}

}
