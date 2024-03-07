package LogicalProgram;

 abstract class vehical1 
{

	abstract void start();
}
 class car1 extends vehical1
 {
	 void start()
	 {
		 System.out.println("car start with cick");
	 }
 }
 
 class Scooter1 extends vehical1
 {
	 void start()
	 {
		 System.out.println("scooter start with cick");
	 }
	 
	 public static void main(String[] args) {
		
		 car1 c = new car1();
		 c.start();
		 
		 Scooter1 s = new Scooter1();
		 s.start();
		 
	}
 }
