package PageObjectModel_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_Page2 
{
	@FindBy(xpath= "//p[@class=\"oxd-userdropdown-name\"]")
	private WebElement name;
	
	
	@FindBy(xpath= "//p[@class=\"class=\"oxd-text oxd-text--p\"]")
	private WebElement TimeatWork;
	
	//2
	
	public Orange_HRM_Page2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3
	
	public void name()
	{
		String Text= name.getText();
		System.out.println(Text);
		
		if(Text.equals("Paul Collings"))
		{
			System.out.println("Correct usrname");
		}
		else
		{
			System.out.println("incorrectusername");
		}
	}
	public void Time()
	{
		Boolean
		Time = TimeatWork.isDisplayed();
		System.out.println(Time);
	}
	
}
