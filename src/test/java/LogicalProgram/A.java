package LogicalProgram;
//super keyword
class B 
{
	int i=10;
}

public class A extends B
{
	int i=30;

	void show(int i)
	{

		System.out.println(super.i);
	}


	public static void main(String[] args) 
	{
		//System.out.println(1);
		A a= new A();
		//System.out.println(2);
		a.show(20);

	}


}
