package LogicalProgram;

import java.util.Arrays;

public class IsAnagram 
{

	public static void main(String[] args) 
	{
		//find the words are anagrame or not 
		String s = "eat"; // First string
        String s1 = "tea"; // Second string
        // Convert strings to character arrays and sort them
       
        char[] arr1 = s.toCharArray();
        char[] arr2 = s1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Compare sorted arrays are equal or not
        boolean isAnagram = Arrays.equals(arr1, arr2);
        // Print the result
        if (isAnagram) {
            System.out.println(s + " and " + s1 + " are anagrams.");
        } else {
            System.out.println(s + " and " + s1 + " are not anagrams.");
        }




	}

}
