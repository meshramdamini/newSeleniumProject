package Popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	 
		WebElement skill =driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
	
		driver.findElement(By.xpath("//select[@id=\"Skills\"]")).click();

	 
	 Select select = new Select(skill);
	 //select.deselectByVisibleText("APIs");
	 
	 //total size
	 List<WebElement> allList = select.getOptions();	
	    
	    System.out.println("Total SkillList:"+allList.size());
	
	//how to print all values
	    
	    for(int i=0;i<allList.size();i++)
	    {
	    	String skillvalue = allList.get(i).getText();
	    	
	    	System.out.println(skillvalue);
	    	if(skillvalue.equals("APIs"))
			   {
	    		allList.get(i).click();
	    		
	    		
			   }
	    	
	    }
	
	    
	  
}

	
}

