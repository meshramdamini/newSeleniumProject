package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
	//sbse pehele webdriver ka object create krte hai q k wbelements ko find krne k liye webdriver ka object chahiy hoga
	WebDriver driver;
	
	//then wbdriver k object ko initioalized krna hai to uske liye hme cunstructor ka use krna hoga
	//cunstructor ek parameter lega
	loginPage(WebDriver d)
	{
		driver = d;
		
		PageFactory.initElements(driver, this);
	}
	
	//then idenfify the web elements
	
	@FindBy(id="user-name")
	WebElement usernam;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	
	//webelement pe operation perform krne k liye mehod create krni hogi testing
	public void enterUsername(String uname)
	{
		usernam.sendKeys(uname);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass); 
	}
	public void login()
	{
		loginBtn.click(); 
		
	}

}
