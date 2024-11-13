package LogicalProgram;

public class ThisKeyword 
{
	int i;
	
	void setValue(int i)
	{
		this.i=i;
	}
	
	void show()
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		ThisKeyword  TK   = new ThisKeyword ();
		TK.setValue(20);
	    TK.show(); 
		
	}

}
