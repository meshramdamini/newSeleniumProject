package LogicalProgram;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int emp_ID;
	String emp_Name;
	String emp_Address;
	EmplyoyeeSalary empSalDetail;
	Employee(int empid,String empname,String empaddress,int empaccno,int empsalary) {
		
		this.emp_ID=empid;
		this.emp_Name=empname;
		this.emp_Address=empaddress;
		this.empSalDetail=new EmplyoyeeSalary(empaccno,empsalary);
	}
		
		
		public static void main(String[] args) 
		{
			
		Employee emp1 = new Employee(101,"Damini","Pune",11234,100000);
		Employee emp2 = new Employee(102,"Sumedh","Doke Sarandi",11235,10000);
		Employee emp3 = new Employee(103,"Pooja","Ghuggus",11236,50000);
		Employee emp4 = new Employee(104,"Vishal","Rajur",123456,30000);
		Employee emp5 = new Employee(105,"Diksha","Kolsa Rajur",3232434,40000);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
	   
		for (Employee emp : empList) { 
			System.out.println("Employee Details: ");
            System.out.println("Employee ID: "+emp.emp_ID);
            System.out.println("Employee Name: "+emp.emp_Name);
            System.out.println("Employee Address: "+emp.emp_Address);
            System.out.println("Employee AccountNo: "+emp.empSalDetail.EmpAccNo);
            System.out.println("Employee Salary: "+emp.empSalDetail.EmpSalary);
            
            System.out.println("*****************************************************************");
            
        }
		
	
	}
	

}
