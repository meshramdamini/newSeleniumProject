package listbox;

import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) 
	{
		List<Integer> list1 = Arrays.asList(10,20,30,40);
		List<Integer> list2=Arrays.asList(10,20,30,40);
		list2.sort(null);
		//System.out.println(list2);
		boolean flag=false;
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i)!=list2.get(i))
			{
				flag=true;
			}
		}
		
		if(flag==true)
		{
			System.out.println("List elements are not sorted");
		}
		else 
		{
			System.out.println("List elements are  sorted");
		}

	}

}
