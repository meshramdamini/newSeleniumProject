package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) 
	{
		Set<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("mango");
		
		System.out.println(fruits.size());
		
		for (String fruit : fruits) 
		{
            System.out.println(fruit);
        }
		System.out.println("size of set:" +fruits.size());
		
	}

}
