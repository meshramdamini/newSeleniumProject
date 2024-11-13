package LogicalProgram;

import java.util.Scanner;

public class AcceptUserInput {

	public static void main(String[] args)
	{
		// WAP which will accept input from user(addition, subtraction,multiplication,division).
		System.out.println("Enter first number");
		
		Scanner Sc = new Scanner(System.in);
		
		int No1 = Sc.nextInt();
		
		System.out.println("Enter second number");
		int No2 = Sc.nextInt();
		Sc.close();
		
		System.out.println("multiplication of two number is =="+(No1*No2));
	
		

	}

}
