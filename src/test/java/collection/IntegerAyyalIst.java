package collection;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerAyyalIst {

	public static void main(String[] args) 
	{
		//print 000111
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
		AL.add(0);
		AL.add(1);
		AL.add(0);
		AL.add(1);
		AL.add(0);
		AL.add(1);
		System.out.println(AL);
		
		//Ascending order
		//Collections.sort(AL);
		//System.out.println(AL); 
		
		//descending order
		//Collections.sort(AL, Collections.reverseOrder());
		//System.out.println(AL);
		
		//using for loop
		
		for(int i=0 ; i<AL.size();i=i+2)
		{
			System.out.println(AL.get(i));
		}
		
		for(int i=1 ; i<AL.size();i=i+2)
		{
			System.out.println(AL.get(i));
		}
		
	}

}
