package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();


	}

}
