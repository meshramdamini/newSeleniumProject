package TestNgFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_testcase {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
	
         driver.get("https://www.facebook.com/");
		
		

	}

}
