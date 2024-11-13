package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(3000);
		
		//Actions action = new Actions(driver);
		
		WebElement source =driver.findElement(By.id("box6")); //div[@id="box6"]
		
		WebElement dest =driver.findElement(By.id("box106"));
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, dest).build().perform(); 
		
		
    }

}
