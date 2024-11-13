package Thiskeyword;


public class UseOfThisKeyword 
{ 
	//use if this keyword with constructor
	 String name = "damini";
	public UseOfThisKeyword()
	{   
		this("Java");
		System.out.println("this is damini");
	}
    
	public UseOfThisKeyword(String name)
	{
	     this(10);
		System.out.println("this is damini-name is:"+name);
	}
	public UseOfThisKeyword(String count,String abc)
	{     
		
	    System.out.println("this is damini-count is:"+count+abc);
		
	}
	public UseOfThisKeyword(int count)
	{     
		this("jan","nam");
	    System.out.println("this is damini-count is:"+count);
		
	}
	public void display()
	{
		System.out.println("i am in a display method");
	}
	public static void main(String[] args) 
	{
		
		UseOfThisKeyword obj = new UseOfThisKeyword();
		obj.display();
		
 
		

	}

}
