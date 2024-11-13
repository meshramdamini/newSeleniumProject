package LogicalProgram;

public class Prepare {

	public static void main(String[] args) 
	{
		String str = "Sumedh";
		int strLength=str.length();
		int secondLastCharIndex=strLength-2;
		int lastCharIndex=strLength-1;
		String char1=Character.toString(str.charAt(secondLastCharIndex));
		String char2=Character.toString(str.charAt(lastCharIndex));
		System.out.println("Last two characters of the string: "+str);
		System.out.println(char1+char2); 
		
		
		
	}

}
