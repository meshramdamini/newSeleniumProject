package LogicalProgram;

abstract class scooter {
	
	int tyre ;
	
  abstract void start();
	
}

class car extends scooter{
	
	void start()
	{
		System.out.println("car start with key");
	}
	
}

class Abtvehical extends scooter
{
	void start() {
		System.out.println("scooter start with kick");
	}
	
	public static void main(String[] args) 
	{
		car c = new car();
		c.start();
		Abtvehical A = new Abtvehical();
		A.start();
		
	}
}
