package Popup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllertGetText {

	public static void main(String[] args) throws InterruptedException  
	{
		//To open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		
		//To wait for 2sec
		Thread.sleep(2000);
		//To enter url
		//driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//To wait for 2sec
		Thread.sleep(2000);
		//To click on click me
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click(); 
		//To switch selenium focus from main page to alert popup
		String text = driver.switchTo().alert().getText();
		//To wait for 2sec
		Thread.sleep(2000);
		
		System.out.println(text);
		
		
		
	}

}
