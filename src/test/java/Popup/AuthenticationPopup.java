package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String Text= driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! You must have the proper credentials.' )]")).getText();
		
        System.out.println(Text);
	}

}
