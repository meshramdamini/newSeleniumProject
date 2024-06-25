package LogicalProgram;

import java.util.Arrays;
import java.util.List;


public class squareOddNumber 
{
	public static void main(String[] args)
	{
		List<Integer> numList = Arrays.asList(1,4,3,9,5,6,7,8,5,10);
		for(int i=0 ;i<numList.size();i++)
		{
			int num=numList.get(i);
			if(num %2!=0)
			{
				System.out.println("number is odd :" +num);
				System.out.println("square of the num :" +num*num);
			}
		}
	}
}
