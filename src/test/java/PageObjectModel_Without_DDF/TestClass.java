package PageObjectModel_Without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Orange_HRM_Page1 OHP = new Orange_HRM_Page1(driver);
		OHP.Username();
		Thread.sleep(2000);
		OHP.Password();
		Thread.sleep(2000);
		OHP.LoginButton();
	}

}
