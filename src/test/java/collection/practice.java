package collection;

import java.util.ArrayList;

public class practice {

	public static void main(String[] args) 
	{
		ArrayList<String> Al = new ArrayList<String>();
		Al.add("mango");
		Al.add("orange");
		Al.add("papaya");
		Al.add("kivi");
		Al.add("banana");
		Al.add("apple");
		Al.add("jamun");
		
		System.out.println(Al.size());
		
		for(int i = 0 ; i<Al.size();i++)
		{
			System.out.println(Al.get(i));
		}
		
		
		Al.set(2, "chiku"); 
		
		System.out.println(Al);
		
		
		System.out.println(Al.get(3));
		
		Al.add(0, "pineapple");
		System.out.println(Al);
		
		Al.remove(1);
		System.out.println(Al);
		
	}

}
