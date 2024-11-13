package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShort1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		// convert web driver object to take screenshort $ call getScreenshortAs method to create image file
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
        // Move image file to new destination
		
		File Dest = new File("F:\\desktopdata\\daminimeshram\\facebook.png");
		
		FileHandler.copy(Source, Dest);
		driver.quit(); 
		
		
	}

}
