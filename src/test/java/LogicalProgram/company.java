package LogicalProgram;

 class EncapsulationEmp 
{
	private int EmpId; // data
	
	public void setempid(int empid)  // code
	{
		EmpId=empid;
	}
	
	public int getempid() 
	{
		return EmpId;
		
	}
	

}
class company
{
	public static void main(String[] args) 
	{
		
		EncapsulationEmp Em1=new EncapsulationEmp();
		Em1.setempid(101);
		System.out.println(Em1.getempid());
		
	}
}