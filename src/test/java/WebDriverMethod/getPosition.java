package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPosition {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","F:\\\\SOFTWARE_SETUP\\\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.manage().window().getPosition());
		

	}

}
