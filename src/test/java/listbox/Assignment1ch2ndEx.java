package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1ch2ndEx 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// print all values which are present in day,month and year dropdown and select date of birth
      System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement Day =driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		WebElement month =driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement year =driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		Thread.sleep(3000);
		
		Select DOB = new Select(Day);
		DOB.selectByValue("23");
		Select DOB1 = new Select(month);
		DOB1.selectByValue("July");
		Select DOB2 = new Select(year);
		DOB2.selectByValue("1994");
		
	
		System.out.println("************************************************************************************");
		displayElements(DOB);
		System.out.println("************************************************************************************");
		displayElements(DOB1);
		System.out.println("************************************************************************************");
		displayElements(DOB2);
		System.out.println("************************************************************************************");
		
		/*List<WebElement> allDays = DOB.getOptions();
	    System.out.println("TotalDays:"+allDays.size());
		
		//how to print all values
		    
		    for(int i=0;i<allDays.size();i++)
		    {
		    	String TotalDays = allDays.get(i).getText();
		    	
		    		System.out.println(TotalDays);
		    		
		    }*/
		
		
		
	}
	
	     
	public static void displayElements(Select selectObj)
	{
		//size of each element date,month& year
		List<WebElement> elementLst = selectObj.getOptions();
		 System.out.println("Total Elements Count:"+elementLst.size());
			
			//how to print all values
			    
			    for(int i=0;i<elementLst.size();i++)
			    {
			    	String elementTxt = elementLst.get(i).getText();
			    	
			    		System.out.println(elementTxt);
			    		
			    }
		
	}
	
}
	     
		    



	
	
	
	
		
		
		
		          
			

		
		
		
		
		

	


