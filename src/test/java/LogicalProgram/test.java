package LogicalProgram;

//java interface   method always public and abstract 
//and variable are always public static and final
 interface Inter_facessss 
{
	 int a=10;
	void show();
}
class test implements Inter_facessss
{
    public void show()
	{
		System.out.println("i am in test class");
	}
    
    public static void main(String[] args) 
    {
    	test t = new test();
    	t.show();
		
	}
}
