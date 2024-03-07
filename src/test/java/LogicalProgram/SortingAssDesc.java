package LogicalProgram;

public class SortingAssDesc {

	public static void main(String[] args) {
		int	a[]= {10,2,3,9,5,6,7,8,1,4};
		for(int i=0;i<a.length;i++)
		{
		  for(int j=i+1;j<a.length;j++)
		   {
			 int first_value=a[i];
			 int second_value=a[j];
			 if(first_value>second_value)
			 {
				 a[i]=second_value;
				 a[j]=first_value;
			 }
			 
		   }
		  System.out.println(a[i]);
		}
		
		}

	}


