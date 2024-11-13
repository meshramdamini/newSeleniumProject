package PageObjectModel_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_Page1 {
	
	@FindBy(name= "username")
	WebElement Username;
	
	@FindBy(xpath= "//input[@name=\"username\"]")
	public WebElement Username1;
	
	@FindBy(xpath= "//input[@name=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath= "//button[@type=\"submit\"]")
	public WebElement LoginButtton;
	
	//init within 
	
	public Orange_HRM_Page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void userID1(String UserID)
	{
		Username1.sendKeys(UserID);
	}
	public void Pass(String Passwor)
	{
		Password.sendKeys(Passwor);
	}
	public void Login()
	{
		LoginButtton.click();
	}
}
