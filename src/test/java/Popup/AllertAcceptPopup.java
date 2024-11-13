package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllertAcceptPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//To open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
		//To switch selenium focus from main page to alert popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		//To perform action on alert popup ok button
		alt.accept(); 
		//alt.dismiss();
		
		
		}
		
		

	}


