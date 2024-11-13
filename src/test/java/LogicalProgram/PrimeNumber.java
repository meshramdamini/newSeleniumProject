package LogicalProgram;

import java.util.Scanner;

public class PrimeNumber 
{
	
	  public static void main(String[] args)
	  {
	   Scanner s = new Scanner(System.in); // system.in for we need to take value from cmd
	   System.out.println("Enter the number :");
	    int no= s.nextInt(); 
	    int temp=0;

	   for(int i=2; i<=no-1; i++)
	   {
	      if(no%i==0)
	      {
	        temp= temp+1;
	      }
	   }
	  if(temp==0)
	 {
	   System.out.println("number is prime");
	 }
	else
	{
	  System.out.println("number is not prime");

	}

	}
	}



