package PageObjectModel_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_Page2 
{
	@FindBy(xpath= "//p[@class=\"oxd-userdropdown-name\"]")
	private WebElement Name;
	
	
	@FindBy(xpath= "//p[@class=\"oxd-text oxd-text--p\"]")
	private WebElement TimeatWork;
	//2
	
	public Orange_HRM_Page2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3
	public void name(String name)
	{
		String Text= Name.getText();
		System.out.println(Text);
		
		if(Text.equals(name))
		{
			System.out.println("Correct username");
		}
		else
		{
			System.out.println("incorrect username");
		}
		
	}
	public void Time()
	{
		Boolean Time= TimeatWork.isDisplayed();
		System.out.println(Time);
	}

}
