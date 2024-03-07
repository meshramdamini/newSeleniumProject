package LogicalProgram;

public class methodOverloading {
	
	//can we achieve  method overloading by changing return type
	
	void show(int a)
	{
		System.out.println("1");
	}
//	String show(int a)

	{
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		 
		methodOverloading MO = new methodOverloading();
		MO.show(10);
	}

}
