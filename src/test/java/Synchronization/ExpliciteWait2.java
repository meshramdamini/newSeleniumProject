package Synchronization;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class ExpliciteWait2 {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		    
		    WebDriver driver = new ChromeDriver();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		     
			
			String[] Itemsneeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
			
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			//Thread.sleep(2000);
			
			addItems(driver,Itemsneeded);
			
			driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
			
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
			
			driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
			
			driver.findElement(By.cssSelector("button.promoBtn")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));
			
			System.out.println(driver.findElement(By.cssSelector("button.promoBtn")).getText());
			
			driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();
			
			WebElement ele = driver.findElement(By.xpath("//select[@style=\"width: 200px;\"]"));
			
			Select dropdown = new Select(ele);
			
			dropdown.selectByVisibleText("India");
			
			driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
			
			driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
			
			//driver.findElement(By.xpath("//span[@style=\"color:green;font-size:25px\"]"));
			
			System.out.println(driver.findElement(By.xpath("//span[@style=\"color:green;font-size:25px\"]")).getText());
					
			
	}
	
	public static void addItems(WebDriver driver,String[] Itemsneeded)
	{
		int j=0;
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size();i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formatedname = name[0].trim();
			
			List ItemsneededList= Arrays.asList(Itemsneeded);
			
			
			
			if(ItemsneededList.contains(formatedname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==Itemsneeded.length)
				{
					break;
				}
			}
		}
		
	}
	

}
