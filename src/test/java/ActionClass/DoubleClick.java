package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);  
		
	WebElement click=	driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
	
	Actions action = new Actions(driver);
	action.doubleClick(click).build().perform();
		
		

	}

}
