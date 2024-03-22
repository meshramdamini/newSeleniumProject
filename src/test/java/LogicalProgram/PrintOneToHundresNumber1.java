package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintOneToHundresNumber1 {

	public static void main(String[] args) 
	{
		//print one to hundred number without using for loop
		ArrayList<String> number = new ArrayList<String>(Arrays.asList("One","two" ,"three","Four","Five", "Six", "Seven", "Eight", "Nine","Ten"));
		
		//Using for-each loop to print each element of the ArrayList
		number.forEach(System.out::println);
	}

}
