package WebTable;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowsize {

	public static void main(String[] args) throws InterruptedException 
	
	
		{
		//to open chrome browser
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//wait
		Thread.sleep(2000);
		//to open created webtable page
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		//to identify webtable
		//List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		//int Size = AllRows.size();
		//System.out.println(Size);
		
	     //List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		 //System.out.println(AllRows.size()); // row size
		 
		 List<WebElement> Allcoulum = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		 System.out.println(Allcoulum.size()); //column size 
		
		
		//int Size = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		//System.out.println(Size);
		
		//int Size = driver.findElements(By.xpath("///table[@id='customers']/tbody/tr[1]/th")).size();
		//System.out.println(Size);//coulom size
		}

		
	}


