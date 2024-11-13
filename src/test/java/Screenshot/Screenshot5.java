package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot5 
{
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//TakeScreenshot("Facebooknew");
		//TakeScreenshot("FacebookTest");
		TakeScreenshot("FacebookGood");
		
	
		
		driver.quit();
		
		}
	public static void TakeScreenshot(String Filename) throws IOException
	{
	
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(5);
		
		File dest = new File("./Screenshot/"+Filename+""+Random+".png");
		FileHandler.copy(Source, dest);
		
		
	}

}
