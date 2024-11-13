package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewTab")).click();
		
	Set<String> Ids	=driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<String>(Ids);
	
	driver.switchTo().window(al.get(1));
	
	driver.findElement(By.xpath("//span[ text()=\"Training\"]")).click();

	}

}
