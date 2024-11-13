package listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
		//step1
		WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
	   //step2
		Select s1= new Select(month);
		
		//step3
		//select by value
		s1.selectByValue("3");
		
		//s1.selectByVisibleText("Jan");
		//s1.selectByIndex(0);
		
		//select by value
		
		//Select s7 = new Select(day);
		//s7.selectByValue("12");
		//Select s8 = new Select(month);
       // s8.selectByValue("8");
	   // Select s9 = new Select(year);
		//s9.selectByValue("2022");

	}
}
