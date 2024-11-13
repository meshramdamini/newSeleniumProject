package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException 
	{  System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
    
       WebDriver driver = new ChromeDriver();
    
        driver.manage().window().maximize();
	
	//To wait for 2sec
	Thread.sleep(2000);

		
		//To enter url
		driver.get("https://skpatro.github.io/demo/links/");
		//To wait for 2sec
		Thread.sleep(2000);
		//To click on new tab
		//click on new tab
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(ids );
		//switch selenium focus from main page to child window
		//driver.switchTo().window(al.get(1));
		//click on training from child window
		//driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(3000);
		//switch selenium focus from child window to main page
		driver.switchTo().window(al.get(0));
		//click on new window
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		}
		
}
		
		

	


