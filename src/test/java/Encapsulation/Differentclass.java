package Encapsulation;

public class Differentclass {

	public static void main(String[] args) {
		EmpData emp = new EmpData();
		emp.setAge(25);
		emp.setName("sumedh");
		emp.setRollNo(15);
		emp.setSal(2000);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getRollNo());
		System.out.println(emp.getSal());
		

	}

}
