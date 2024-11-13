package Synchronization;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AssignmentUdemyOnWait

{
	public static void main(String[] args)
	{
	
	System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    int j=0;
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.manage().window().maximize();
    
    String[] Itemsneeded = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
   
    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
    
    driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
    
    driver.findElement(By.id("password")).sendKeys("learning");
    
    driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[1]")).click();
   
    //Alert alert = driver.switchTo().alert();
    // alert.accept();
    
    WebElement Dropdown =  driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
    
   Select s1 = new Select(Dropdown);
   s1.selectByIndex(2);
   
    
  
    System.out.println(s1.getFirstSelectedOption().getText());
    
    driver.findElement(By.id("terms")).click();
    
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInBtn")));
    
    driver.findElement(By.id("signInBtn")).click();
    
   List<WebElement> product = driver.findElements(By.cssSelector("h4.card-title"));
   
   for(int i=0; i<product.size();i++)
	{
	   String[] name = product.get(i).getText().split("-");
		String formatedname = name[0].trim();
		
		List ItemsneededList= Arrays.asList(Itemsneeded);
		
		if(ItemsneededList.contains(formatedname))
		{
			j++;
			driver.findElements(By.xpath("//div[@class=\"card-footer\"]/button")).get(i).click();
			
			if(j==Itemsneeded.length)
			{
				break;
			}
		}
		}
		
   driver.findElement(By.cssSelector("a[class=\"nav-link btn btn-primary\"]")).click();
 
    driver.findElement(By.cssSelector("button[class=\"btn btn-success\"]")).click();
    
    driver.findElement(By.id("country")).sendKeys("india pune");
    
    driver.findElement(By.xpath("//input[@value=\"Purchase\"]")).click();
    
    
}
	}
	

