package PageObjectModel_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_Page1 {

		
		//1 Data member/variable should be declared globally with access level private by using @findby annotation.
		
		@FindBy(xpath= "//input[@name=\"username\"]")
		public WebElement Username;
		
		@FindBy(xpath = "//input[@name=\"password\"]")
		private WebElement Password;

		@FindBy(xpath = "//button[@type=\"submit\"]")
		private WebElement LoginButton;
		
		//initialize within a constructor with access levl public using pagefactory
		
		public  Orange_HRM_Page1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		//Utilize within a method with access level public
		
		public void Username()
		{
		Username.sendKeys("Admin");
		
		}
		public void Password()
		{
		 Password.sendKeys("admin123");
			
		}
		public void LoginButton()
		{
			LoginButton.click();
		}

  }
