package collection;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("Damini");
		al.add('S');
		al.add(true);
		al.add(12.2);
		al.add(66);
		
		//System.out.println(al);
		al.add(0, "java");
		System.out.println(al);
		
		
		System.out.println(al.size());
		System.out.println(al.get(3));
		
		al.remove(0);
		
		System.out.println(al);
		
		al.set(0,"Java");  //for replace 0th index 
		
		System.out.println(al);
		
		System.out.println(al.contains("Java"));
		
		System.out.println(al.isEmpty());
        
		al.clear();
		System.out.println(al); 

	}

}
