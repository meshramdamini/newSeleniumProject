package LogicalProgram;

public class PrimeNumber2 {

	public static void main(String[] args) {

		int no = 7;
		int temp = 0;
    //in prime number we check numbers from 2 to number - 1 means  number 9   ->( 2,3,4,5,6,7,8) 9 is divisible by 3 so that is why 9 is not a prime number
	// here we are not taking values 1 and 9 because it is also divisible .
		for (int i = 2; i <= no - 1; i++) 
		{
			if (no % i == 0) 
			{
				temp = temp + 1;
			}
		}
		if (temp == 0) 
		{
			System.out.println("number is prime");
		} else 
		{
			System.out.println("number is not prime");

		}

	}
}
