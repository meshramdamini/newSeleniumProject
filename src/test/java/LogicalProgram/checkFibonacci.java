package LogicalProgram;

public class checkFibonacci {

	public static void main(String[] args) 
	{
		int[] series = {0, 1, 1, 2, 3, 5, 7, 12}; // not fibonacci series
        //int[] series = {0, 1, 1, 2, 3, 5, 8, 13}; // fibonacci series

        //int n = series.length;
        boolean isFibonacci = true;
        int breakIndex = -1;

        // Check if the series is a Fibonacci sequence
        for (int i = 2; i < series.length; i++) 
        {
            if (series[i] != series[i - 1] + series[i - 2]) 
            {
                isFibonacci = false;
                breakIndex = i;
                break;
            }
        }

        // Print the result
        if (isFibonacci) {
            System.out.println("The series is a Fibonacci sequence.");
        } else {
            System.out.println("The series is not a Fibonacci sequence. Breaks at index: " + breakIndex);
        }


	}

}
