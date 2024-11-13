package WebDriverMethod;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//this method is used to change the size of the browser
		
		Dimension size = new Dimension(500,500);
		
		driver.manage().window().setSize(size);
		//Thread.sleep(5000);
		
		//driver.quit();	
		}

}
