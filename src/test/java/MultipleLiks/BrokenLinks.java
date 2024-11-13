package MultipleLiks;

import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
	
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		int brokenlinks=0;
		for(WebElement element:Links)
		{
			String url= element.getAttribute("href");
			if(url==null||url.isEmpty())
			{
				System.out.println("URL is null or empty");
				continue;			
		    }
		URL link = new URL(url);
		HttpsURLConnection httpcode =(HttpsURLConnection)link.openConnection();
		httpcode.connect();
		
		if(httpcode.getResponseCode()>=400)
		{
			System.out.println(httpcode.getResponseCode()+"----->"+url+" is----->"+"Broken Links");
			brokenlinks++;
		}
		else
		{
			System.out.println(httpcode.getResponseCode()+"---->"+url+"is---->"+"Valid Links");
		}
		
	}


	System.out.println("Number of brokenlinks:"+brokenlinks);
	driver.quit();
	}
	

}

	
	
	



