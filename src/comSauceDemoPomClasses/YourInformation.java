package comSauceDemoPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformation 
{
      private  WebDriver driver;
      
      //Find WebElmenet
      
      //firstname
      @FindBy(xpath="(//input[@class='input_error form_input'])[1]")
      private  WebElement firstname;
      
      //lastname
      @FindBy(xpath="(//input[@class='input_error form_input'])[2]")
      private  WebElement lastName;
      
      //postalcode
      @FindBy(xpath="(//input[@class='input_error form_input'])[3]")
      private  WebElement postalcode;
      
      //cancel
      @FindBy(xpath="//input[@id='cancel']")
      private  WebElement cancelbutton;
      
      //continue
      @FindBy(xpath="//input[@id='continue']")
      private  WebElement contiunebutton;
      
      // Description name
      @FindBy(xpath="//div[text()='DESCRIPTION']")
      private  WebElement descrption;
      
      
      // constructor
     public  YourInformation( WebDriver driver)
     {
	   this.driver=driver;
	  PageFactory.initElements(driver,this);
     }
   
   //Action Performed on webelement
   
   public void sendfirstname()
   {
	  firstname.sendKeys("Tejas");
   }
   public void sendlastname()
   {
	   lastName.sendKeys("Ugale");
   }
   public void sendpostalcode()
   {
	   postalcode.sendKeys("423109");
   }
   public void cancelbutton()
   {
	   cancelbutton.click();
   }
   public void continuebutton()
   {
	   contiunebutton.click();
   }
   
   public String gettext()
   {
	    String s=descrption.getText();
	    return s;
   }
      
      
      
}
