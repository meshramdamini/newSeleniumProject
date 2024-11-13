package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//To enter url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(3000);
		//To switch main page to iframe by using frame name
		//driver.switchTo().frame("iframeResult");
		//To switch main page to iframe by using frame id
		driver.switchTo().frame("iframeResult");
		//frame name-String
		//frame id-String
		//frame index-int
		//frame webelement
		//To click on that button click me to display Date and Time
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		
	}
		
		

	}


