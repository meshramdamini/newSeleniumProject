package collection;

import java.util.ArrayList;
import java.util.List;

public class ListColection {

	public static void main(String[] args)
	{
		//Creating a List  
		List<String> list=new ArrayList<String>();   
		//Adding elements in the List  
		list.add("Mango");  
		list.add("Apple");  
		list.add("Banana");  
		list.add("Grapes");  
		list.add("Apple");
		//Iterating the List element using for-each loop  
		//for(String fruit:list)  
		// System.out.println(fruit);  
		for(int i=0 ;i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}

	}  

}


