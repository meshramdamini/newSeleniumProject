package BrockenLinks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockLink {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");


		//webpage pe jitne me link hai unko hme capture krna hai

		List<WebElement> LinkList = driver.findElements(By.tagName("a"));

		//to find the each link we use attribute for link ie href
		//jo reponse code aya hai uske liye variable create krenge
		int rescode= 200;
		int brokenlinkcount = 0;
		System.out.println("Total links on page:" +LinkList.size());
		for(WebElement element :LinkList)
		{
			String url = element.getAttribute("href");

			try 
			{
				URL urlLink = new URL(url);

				//to open link
				HttpURLConnection huc=(HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();

				rescode = huc.getResponseCode();

				if(rescode>=400)
				{
					System.out.println(url +"brocken Link");
					brokenlinkcount++;
				}

			} 

			catch (MalformedURLException e) 
			{

			}
			catch (Exception e)
			{

			}
		}

		System.out.println("total brocken link: " +brokenlinkcount);
	}

}
