package LogicalProgram;


public class StringCount {

	    public static void main(String[] args) 
	    {    
	    	//count characters in a string and ,count e how any times comes in a string
	        String s = "Wel come home";    
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < s.length(); i++) 
	        {    
	            if(s.charAt(i)== 'o')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);    
	    }    
	}     


