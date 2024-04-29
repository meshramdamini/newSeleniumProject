package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		loginPage Lg= new loginPage(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		
		Lg.enterUsername("standard_user");
		Lg.enterPassword("secret_sauce");
		Lg.login();
	}

}
