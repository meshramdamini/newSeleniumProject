package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> Al = new ArrayList<String>();
		
		Al.add("Damini");
		Al.add("sumedh");
		Al.add("minal");
		Al.add("geeta");
		Al.add("priya");
		
		ArrayList<String> Al2 = new ArrayList<String>();
		System.out.println("before adding :" +Al2);
		
		Al2.addAll(Al);
		
		System.out.println("After adding :"+Al2);
		
		//Al2.removeAll(Al);
		//System.out.println(Al2);
		
		//for loop
//		for(int i=0 ;i<Al2.size(); i++)
//		{
//			System.out.println(Al2.get(i));
//		}
		
		//for each
//		for (String i : Al2) 
//		{
//			System.out.println(i);
//		}
		
		//Iitorator
		
//		Iterator it = Al2.iterator();
//		
//		while(it.hasNext())
//		{	
//		    System.out.println(it.next());
//			
//		}
		
		//Collections.sort(Al2);
		//System.out.println(Al2); //correct order albha betically
		
		Collections.sort(Al2,Collections.reverseOrder());
		System.out.println(Al2);
		
		Collections.shuffle(Al2);
		System.out.println(Al2);
		
		//how to convert array to array list
		
		String cars[]= {"BMW", "audi", "creta"};
		
		ArrayList Al3 = new ArrayList(Arrays.asList(cars));
		System.out.println(Al3);
	}
	

}
