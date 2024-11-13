package TestNgFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword3 
{
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		driver=new ChromeDriver();
       driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	 //annotaion @test(enabled = false) helps to disable this test case.@test(enabled = false)then the test case that is not ready to test is by passed
	
	@Test(enabled = false)
	public void Loginpage() 
	{
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Test4");
		
	}
	@Test(enabled = false)
	public void OrangeHRMLogo()
	{
		boolean b = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
		System.out.println(b);
		System.out.println("Test5");
	}
	@Test()
	public void D()
	{
		driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
		System.out.println("Test6");
		
	}
   
	@Test(enabled = false)
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(enabled = false)
	public void test2()
	{
		System.out.println("Test2");
		
	}
    @Test
    public void testB()
    {
    	System.out.println("Test1");
    	
    }
    @AfterMethod
    public void Teardown() throws InterruptedException
    {
    	Thread.sleep(3000);
    	driver.quit();
    }
}
