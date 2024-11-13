package LogicalProgram.seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absoluteXpath {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// driver= new ChromeDriver(); 
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    //this path is for create a page link
	    
	   driver.findElement(By.xpath("/Html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a")).click();
		
	}

}
