package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1MoveToElement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		//Thread.sleep(3000); 
		WebElement move =driver.findElement(By.xpath("//a[@href=\"https://selenium08.blogspot.com/\"]"));
		
        Actions action =new Actions(driver);
		action.moveToElement(move).click().build().perform();
		
		//actions.moveToElement(hoverElement).perform();
		
		
		//driver.findElement(By.xpath("//input[@class= \"_2IX_2- VJZDxU\"]")).sendKeys("9284608602");
		
		//Thread.sleep(3000);  
		//driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		//Thread.sleep(3000);  
		
	
	}

}
