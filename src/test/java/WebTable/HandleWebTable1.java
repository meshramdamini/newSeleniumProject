package WebTable;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable1 {

	public static void main(String[] args)
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		
		WebElement Example=driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		
		Js.executeScript("arguments[0].scrollIntoView();",Example);
		
		//how many row in table
		
		int Row= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        System.out.println("Total number of rows in table:"+Row);
        
        // second way
        //List<WebElement> Row1= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
       // System.out.println("Total number of rows in table:"+Row1.size());
        
        //how many col in a table
        
        int Col =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
        System.out.println("Total number of rows in table:"+Col);
        
       // List<WebElement> Col1= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
        //System.out.println("Total number of rows in table:"+Col1.size());
        
        //Retrieve the specific row/col data
        
        String Value = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td[3]")).getText();
        System.out.println(Value);
        
        String Value1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[6]/td[2]")).getText();
        System.out.println(Value1);
        
        //Retrieve all the data from the table
        
        for(int i=2;i<=Row;i++)
        {
        	for(int j=1;j<=Col;j++)
        	{
        		String data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
        	
        	System.out.println(data+"|");
        	}
        
        System.out.println();
        
	  }
     driver.quit();
	}

}
