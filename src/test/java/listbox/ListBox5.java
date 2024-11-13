package listbox;
import java.util.TimeZone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Calendar;
import java.util.List;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
	System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("src")).sendKeys("Pune");
	
	Thread.sleep(4000);
	//
	
	List<WebElement>City=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	
	System.out.println("Total Count Src City:"+City.size());
	
	for(int i=0;i<City.size();i++)
	{
		City.get(i).getText();
		System.out.println(City.get(i).getText());
	
	
	if(City.get(i).getText().equals("pimpri chinchwad,pune"))
    {
		System.out.println(City.get(i).getText());
		
		City.get(i).click();
		
		break;
    }
   }
	System.out.println();
	
	
	// destiNATION
	
	
    driver.findElement(By.id("dest")).sendKeys("mumbai");
	
    Thread.sleep(8000);
	
	
    List<WebElement>DestCity=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	
    System.out.println("Total Count Dest City:"+DestCity.size());
	
	for(int i=0;i<DestCity.size();i++)
	{
		DestCity.get(i).getText();
		System.out.println(DestCity.get(i).getText());
	
	
	if(DestCity.get(i).getText().equals("Nerul,Mumbai"))
    {
		System.out.println(DestCity.get(i).getText());
		
		DestCity.get(i).click();
		
	 }
   }
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
	//added by sumedh start
	 //Create a Calendar Object
     Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
    //Get Current Day as a number
     int todayInt = calendar.get(Calendar.DAY_OF_MONTH)+10;
    //System.out.println("Today Int: " + todayInt + "\n");
    //Integer to String Conversion
    String todayStr = Integer.toString(todayInt);
    //todayStr="20";
    
    //This is from date picker table
    WebElement dateWidgetFrom = driver.findElement(By.id("rb-calendar_onward_cal"));
    //This are the columns of the from date picker table
    List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
    //for(int i=0;i<columns.size();i++)
    //{
    //	String abc=columns.get(i).getText();
    //	System.out.println(abc);
   // 	
    //}
    
    columns.stream().filter(element -> element.getText().contains(todayStr)).findFirst().ifPresent(WebElement::click);
	//sumedh end
	
	driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
	
	
	}
	
}


