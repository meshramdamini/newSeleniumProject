package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
      System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(8);
		
		String Filename ="Google";
		
		//File dest = new File("C:\\Users\\SUMO\\Desktop\\daminimeshram\\9JULY Selinium"+Filename+""+Random+".png");
		
		//File Dest1 = new File("F:\\ECLIPSE_PROJECTS\\9 JULY Selinium\\Screenshot\\"+Filename+""+Random+".png");
		//File Dest2 = new File(("user.dir")+"//Screenshot//"+Filename+""+Random+".png");
		File Dest2 = new File("F://ECLIPSE_PROJECTS//9 JULY Selinium//Screenshot//"+Filename+""+Random+".png");
		
		FileHandler.copy(source,Dest2);
		driver.quit();	
		
		
		

	}

}
