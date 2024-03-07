package LogicalProgram;

import java.util.Scanner;

public class EvenOddUsingScanner {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no");
		
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("given no is even");
		}
		else 
		{
			System.out.println("given no is odd");
			
		}
		

	}

}
