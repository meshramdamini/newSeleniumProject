package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\SOFTWARE_SETUP\\\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");//automation testing website
		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getSize());
		

	}

}
