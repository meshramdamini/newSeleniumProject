package WebDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class practice {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    
	   // Dimension size = new Dimension(500,500);
	   // driver.manage().window().setSize(size);
	    
	   // System.out.println(driver.manage().window().getSize());
	    
       Point p = new Point(500,500);
       driver.manage().window().setPosition(p);

	}

}
