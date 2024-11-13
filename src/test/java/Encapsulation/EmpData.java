package Encapsulation;

public class EmpData {
	
	private String Name;
	private int Age;
	private int Rollno;
	private int Sal;

	public static void main(String[] args) 
	{
		EmpData Emp = new EmpData();
		
		Emp.setName("Rahul");
		Emp.setAge(25);
		Emp.setRollNo(2);
		Emp.setSal(20000);
		
		System.out.println("Emp Name:"+Emp.getName());
		System.out.println("Emp age:"+Emp.getAge());
		System.out.println("Emp rollno:"+Emp.getRollNo());
		System.out.println("Emp Sal:"+Emp.getSal());
		
		}
	public String getName() 
	{
		return Name;
		
	}
	public void setName(String name)
	{
		Name=name;
	}
	public int getAge()
	{
		return Age;
	}
	public void setAge(int age)
	{
		Age = age;
	}
	public int getRollNo()
	{
		return Rollno;
	}
	public void setRollNo(int rollno)
	{
		Rollno = rollno;
	}
	public int getSal()
	{
		return Sal;
	}
	public void setSal(int sal)
	{
		Sal=sal;
	}

}
