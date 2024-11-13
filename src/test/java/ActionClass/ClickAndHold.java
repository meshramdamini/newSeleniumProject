package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html"); 

		// Locate the element C by By.xpath. 
		     WebElement titleC = driver.findElement(By.xpath("//li[@name=\"C\"]")); 

		// Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
		     Actions actions = new Actions(driver); 

		// Move the cursor to the position of element C. 
		     actions.clickAndHold(titleC).perform();  // Call clickAndHold() method to perform click and hold operation. 
		     //actions.clickAndHold(titleC).perform();
		  } 
		

	}


