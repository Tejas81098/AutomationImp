package comSauceDemoPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
     // declared WebDriver
	
	private WebDriver driver;
	
	//find WebElement
	
	//username
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement userName;
	
	//Password
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	
	//login
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbutton;
	

	
	
	
	// Action Perform on web element method creation
	
	public void senduserName() 
	{
		userName.sendKeys("standard_user");
	}
	public void sendpassword() 
	{
		 Password.sendKeys("secret_sauce");
	}
	public void login() 
	{
		loginbutton.click();
	}
	// create Constructor
	
		public LoginPage( WebDriver driver)
		{
			this.driver=driver;
			
			//seleium method Compulsory add
			PageFactory.initElements( driver,this);
		}
	
	
}

