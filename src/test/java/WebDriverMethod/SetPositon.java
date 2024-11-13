package WebDriverMethod;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetPositon {

	public static void main(String[] args) throws InterruptedException 
	{
		//String abc=new String("Sum546edh");
		//String dbc="Bhagat";
		System.setProperty("webdriver.chrome.driver","F:\\\\SOFTWARE_SETUP\\\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		Point p1= new Point(600,600);
		//Thread.sleep(3000);
		
		//driver.manage().window().setPosition(p1);
		//GetPositon
		//Thread.sleep(6000);
		driver.manage().window().setPosition(p1);
		//System.out.println(driver.manage().window().getPosition());
		
		

	}

}
