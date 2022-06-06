package comSauceDemoPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageLogout 
{
   private WebDriver driver;
    
    //find webelement
    
    @FindBy(xpath="//button[@id='react-burger-menu-btn']")
    private  WebElement Threebutton;
    
    
    
    @FindBy(xpath="//a[@id='logout_sidebar_link']")
    private WebElement logoutbutton;
    
    
    
  //constructor
    public HomepageLogout(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
    
    //Action Performed
    
    public void dotclick()
    {
        Threebutton.click();
    }
    public void logout()
    {
    	logoutbutton.click();
    }
    
    
    
    
    
    
    
    
}
