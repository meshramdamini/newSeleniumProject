package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintOneToHundredWithoutUsingLoop {
 
	//we can print by using recursive function
	public static void main(String[] args) 
	{
		ArrayList<String> numberlst = new ArrayList<String>(Arrays.asList("One","two" ,"three","Four","Five", "Six", "Seven", "Eight", "Nine","Ten"));
		
		printNum(0,numberlst);
		

	}
	
	public static void printNum(int num ,ArrayList<String> numberlst)
	{
		if (num<10)
		{
		//System.out.println(num);
		System.out.println(numberlst.get(num));
		num++;
		printNum(num,numberlst);
		}
	}

}
