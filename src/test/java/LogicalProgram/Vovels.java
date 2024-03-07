package LogicalProgram;

public class Vovels {

	public static void main(String[] args) 
	{
		
		
		// this is testing 1
		String str = "welcome to my home";
		//String str = "wlcm t my hm";
		//System.out.println();
		char vowel_arr[]= {'a','e','i','o','u'};
		String vowel_arr_1[]= {"a","e","i","o","u"};
		int vowel_count=0;
		
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=0;j<vowel_arr.length;j++)
//			{
//				if(str.charAt(i)==vowel_arr[j])
//				{
//					vowel_count=vowel_count+1;
//				}
//			}
//			
//		}
		for(int i=0;i<vowel_arr_1.length;i++)
		{
			if(str.contains(vowel_arr_1[i]))
			{
				vowel_count=vowel_count+1;
			}
		}
		
		if(vowel_count==0)
		{
			System.out.println("statement not having vowels and leangth is: "+vowel_count);
		}

		else
		{
			System.out.println("statement having vowels and leangth is: "+vowel_count);
		}
		
	//		if(str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u"))
	//		   {
	//			   System.out.println("statement having vowels");
	//		   }
	//		else 
	//		{
	//			System.out.println("statement not having vowels");
	//		}
		
        

	}

}
