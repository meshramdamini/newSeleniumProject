package ActionClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class udemyPractice {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		    
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
             
		    driver.get("https://www.amazon.in/");

		    Actions actions = new Actions(driver);
		    //move to specific element
		    actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		    

//		    Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
//
//		    Iterator<String>it = windows.iterator();
//
//		    String parentId = it.next();
//
//		    String childId = it.next();
//
//		    driver.switchTo().window(childId);
//
//		    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//
//		    driver.findElement(By.cssSelector(".im-para.red")).getText();
//
//		    String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//
//		    driver.switchTo().window(parentId);
//
//		    driver.findElement(By.id("username")).sendKeys(emailId);
//




		    }



		    
		
	}


