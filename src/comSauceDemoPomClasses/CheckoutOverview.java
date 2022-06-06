package comSauceDemoPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverview
{
   private WebDriver driver;
   
   @FindBy(xpath="//button[@id='finish']")
   private WebElement checkout;
   
   //constrctor
  public CheckoutOverview(WebDriver driver)
   {
	  this.driver= driver;
	  
	  PageFactory.initElements(driver,this);
   }
  
  //action on Webelemet
  
  public void check()
  {
	  checkout.click();
  }
  
  
  
  
  
}
