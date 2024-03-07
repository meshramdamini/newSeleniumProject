package LogicalProgram;

public class ReverseArray1 {

	public static void main(String[] args) {
		
     int a[]= {10,20,30,40,50,60,70,80,90};
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		
		System.out.println();
		
		for(int k= a.length-1;k>=0;k--)
		{
			System.out.println(a[k]+" ");
		}



	}

}
