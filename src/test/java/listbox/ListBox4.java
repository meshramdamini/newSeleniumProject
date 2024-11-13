package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBox4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement day1=driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
		
		day1.click();
		Thread.sleep(3000);
		
		WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
		Select select = new Select(day);
		
		// how will u get total no size
		
	    List<WebElement> Listday = select.getOptions();	
	    
	    System.out.println("Total days:"+Listday.size());
	    
	    // how will you print all the values
	    
	    for(int i=0;i<Listday.size();i++)
	    {
	    	String DayValues = Listday.get(i).getText();
	    	//WebElement we=Listday.get(i);
	    	//DayValues=we.getText();
	    	if(DayValues.equals("15"))
		    {
		    	Listday.get(i).click();
		    }
	    }
	    //System.out.println(DayValues);
	    
	    //how will you select the specific value from drop down
	    
	    
	
	    System.out.println("===========");
	    
	    Select select1 = new Select(month);
	    List<WebElement>Listmonth = select1.getOptions();
	    
	   System.out.println("total month:" +Listmonth.size());
	   
	   System.out.println();
	   
	   for(int i=0; i<Listmonth.size();i++)
	   {
		   String monthvalues= Listmonth.get(i).getText();
		   
		   if(monthvalues.equals("May"))
		   {
			   Listmonth.get(i).click();
		   }
	   }
	   

	   System.out.println("===========");
	    
	    Select select2 = new Select(year);
	    List<WebElement>Listyear = select2.getOptions();
	    
	   System.out.println("total year:" +Listyear.size());
	   
	   System.out.println();
	   
	   for(int i=0; i<Listyear.size();i++)
	   {
		   String YearValues= Listyear.get(i).getText();
		   
		   if(YearValues.equals("2021"))
		   {
			   Listyear.get(i).click();
		   }
	   }

	   
	   
	}

	    
}


