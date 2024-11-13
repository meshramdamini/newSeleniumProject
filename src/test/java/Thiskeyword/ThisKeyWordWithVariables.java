package Thiskeyword;

public class ThisKeyWordWithVariables 
{
	int X;
	int Y;
	
	public ThisKeyWordWithVariables(int X,int Y)
	{
		this.X=X;
		this.Y=Y;
	}
	
	public void sum()
	{
		int sum = X+Y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		ThisKeyWordWithVariables obj = new ThisKeyWordWithVariables(10,20); 
	    obj.sum();
		 
	}

}
