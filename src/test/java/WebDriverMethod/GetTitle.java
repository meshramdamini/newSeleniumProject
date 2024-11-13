package WebDriverMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetTitle 
{

	public static void main(String[] args)throws InterruptedException 
	{
		//step1
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String ExpectedResult = "Facebook – log in or sign up"; 
		
		Thread.sleep(4000);
		
		//System.out.println(driver.getTitle());

		String Title = driver.getTitle();
		
		System.out.println(Title);
		//driver.close();	
		
		if(Title.equals(ExpectedResult))
		{
			
			System.out.println("corrent title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		driver.quit();
		
		
			
		
	}

}
