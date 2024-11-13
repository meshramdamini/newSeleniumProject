package udemy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{

	public static void main(String[] args) throws IOException 
	{

        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.google.com/");
        
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(source,new File("C:\\daminim.jpg"));

	}

}
