package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle2 {

	public static void main(String[] args) 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       
       driver.get("https://www.facebook.com/");
       
       String title=driver.getTitle();
       System.out.println(title);
		
		
		
	}

}
