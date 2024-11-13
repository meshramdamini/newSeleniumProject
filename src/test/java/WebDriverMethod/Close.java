package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException 
	{
		//step1
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		
		//driver.get("https://www.google.com/");
		//driver.quit();//close multiple tab
		driver.close();// close single tab

	}

}
