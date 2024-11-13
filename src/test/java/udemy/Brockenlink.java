package udemy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brockenlink 
{

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	String url = driver.findElement(By.cssSelector("a[href*='SoapUI']")).getAttribute("href");
		
		HttpURLConnection conn =  (HttpURLConnection)new URL(url).openConnection();
		
		conn.setRequestMethod("HEAD");
		conn.connect();
	  int responsecode = conn.getResponseCode();
	 System.out.println(responsecode);
		
	 
	}

}
