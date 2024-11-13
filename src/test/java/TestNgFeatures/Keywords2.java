package TestNgFeatures;

import java.util.concurrent.TimeUnit;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Keywords2 {

	 
	  WebDriver driver;
		@SuppressWarnings("deprecation")
		@BeforeClass
		public void Setup()
		{
			System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
			driver=new ChromeDriver();
	       driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		@Test(priority = 4)
		public void Loginpage()
		{
			String Title = driver.getTitle();
			System.out.println(Title);
			System.out.println("Test4");
		}
		@Test(priority = 5)
		public void OrangHRMLogo()
		{
			boolean b = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
			System.out.println(b);
			System.out.println("Test5");
	

	    }
		@Test(priority = 6)
		public void A()
		{
			driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
			System.out.println("Test6");
		}
		@Test(priority = 3)
		public void test1()
		{
			System.out.println("test3");
		}
		@Test(priority = 2)
		public void test2()
		{
			System.out.println("test2");
			
		}
		@Test(priority = 1)
		public void test3()
		{
			System.out.println("test1");
		}
		
		@AfterClass
		public void Teardown() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.quit();
		}
	
}


