package Popup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//To open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		
		         
		//To wait for 2sec
		Thread.sleep(2000);
		//To open flipkart
		driver.get("https://www.flipkart.com/");
		//To wait for 2sec
		Thread.sleep(2000);
		//To enter UN and PSW in login page
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz123");
		}
		
		

	}


