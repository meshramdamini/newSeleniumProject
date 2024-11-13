package JavaScriotExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)","" );
		Thread.sleep(3000); 
		
		js.executeScript("window.scrollBy(0,-4000)","" );
		//scrolldown/up/by pixel
		
		//JavascriptExecutor Js = (JavascriptExecutor)driver;
		//Js.executeScript("window.scrollBy(0,4000)","");
		//Thread.sleep(3000); 
		
		//Js.executeScript("window.scrollBy(0,-4000)","");
		
		
		//ScrollDownUp Till Bottom/up
		
		//Js.executeScript("window.scrollBy(0,document.body.scrollHight)","");
		//Thread.sleep(3000);
		//Js.executeScript("document.documentElement.scrollTop=0","");
		
		
		

	}

}
