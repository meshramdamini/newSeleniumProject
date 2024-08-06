package LogicalProgram;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String str= "Welcomehome";
		//we convert this sting to charArray
		char[] charArray=str.toCharArray();
		String resultStr="";
		
		for(int i=0;i<charArray.length;i++)
		{
			//chararray[i] giving a character at index i and 
			//then to string method take that character 
			//and converted to sting data type
			String ch =Character.toString(charArray[i]);
			
			if(!resultStr.contains(ch))   
			{
				resultStr=resultStr+ch;
			}
		}
		System.out.println("String After removing duplicate:" +resultStr);


	}

}
