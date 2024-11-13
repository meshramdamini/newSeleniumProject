package LogicalProgram;


public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        

        try {
            // Code that may throw exceptions
        	throw new ArithmeticException("This is a custom exception message.");
//        	int[] arr = new int[5];
//        	arr[6]=200;
//        	
//        	 int result = 10 / 0; // ArithmeticException
//            FileInputStream file = new FileInputStream("F:abc");
//           
            
        }
        catch (ArithmeticException e) {
            // Handle arithmetic exception
            System.out.println("ArithmeticException caught: " + e.getMessage());}
//        } catch (FileNotFoundException e) {
//            // Handle file not found exception
//            System.out.println("FileNotFoundException caught: " + e.getMessage());
//        } 
            catch (Exception e) {
            // Handle other exceptions (generic)
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Closing file");
        }
    }
}
