package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");		
		Thread.sleep(2000);
		
	  // String a=driver.findElement(By.linkText("Forgotten password?")).getAttribute("href");//for getting the link use get attribute()
	   //System.out.println(a);
		
	   driver.findElement(By.linkText("Forgotten password?")).click();
     
	
	}

}
