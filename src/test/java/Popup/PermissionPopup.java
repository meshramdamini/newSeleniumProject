package Popup;

//import java.lang.StackWalker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class PermissionPopup {

	public static void main(String[] args)
	{
		ChromeOptions Option = new ChromeOptions();
		
		Option.addArguments("--disable-notification");
		
System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver(Option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
	

	}

}
