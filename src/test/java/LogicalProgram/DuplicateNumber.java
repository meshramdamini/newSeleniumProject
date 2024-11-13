package LogicalProgram;

public class DuplicateNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,2,3,3,10,14,4};
		
		System.out.println(arr.length);
		System.out.println("Duplicate elements in given array");
		
		for(int i=0;i<arr.length;i++)//0<10=true uptp 9<10
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j])//arr[i]=arr[j] ,1==2,      0,1 index values
				{
					System.out.println(arr[j]+"");
					
				}
			}
		}

	}

}
