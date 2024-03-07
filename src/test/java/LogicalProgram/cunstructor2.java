package LogicalProgram;

public class cunstructor2 {
	
	String name;
	int Id;
	
	public cunstructor2( String NAME,int id) {
      this.name= NAME;
      this.Id=id;

	}
	
	public static void main(String[] args) {
		cunstructor2 c1= new cunstructor2("Damini",101);
		
		
		cunstructor2 c12= new cunstructor2("sumedh",102);
		
		System.out.println(c1.name+ " " +c1.Id); 
		System.out.println(c12.name+ " " +c12.Id);
		
	}

}
