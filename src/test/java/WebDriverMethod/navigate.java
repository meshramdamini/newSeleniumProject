package WebDriverMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium. chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		String page1=driver.getTitle();
		System.out.println(page1);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		
		String Page2= driver.getTitle();
		System.out.println(Page2);
		Thread.sleep(3000);
		
		driver.navigate().back();//facebook
		Thread.sleep(5000);
		
		
        driver.navigate().forward();//amazon
        Thread.sleep(5000);
        
        
        driver.navigate().refresh();//Amazon
        
        Thread.sleep(3000);
        
       // driver.navigate().back();//facebook
        
        
		
		
		
		
		
		
		

	}

}
