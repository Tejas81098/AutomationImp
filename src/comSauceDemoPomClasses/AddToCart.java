package comSauceDemoPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart 
{
   private  WebDriver driver;
	
	// Find Webelement 
   @FindBy(xpath="//button[text()='Add to cart'][1]")
	private WebElement addtocartbutton;
	
   @FindBy(xpath="//a[@class='shopping_cart_link']")
  	private WebElement shoppingCartbutton; 
   
   @FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
 	private WebElement removebutton; 
  
   
   @FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continueshopping; 
   
   @FindBy(xpath="//button[@id='checkout']")
	private WebElement checkoutbutton; 
  
   
   //constructor
   
   public AddToCart(WebDriver driver) 
   {
	   this.driver=driver;
	   PageFactory.initElements( driver,this);
   }
   
   //action performed on web element
   public void clickaddtocart()
   {
	   addtocartbutton.click();
   }
   public void clickshoping()
   {
	   shoppingCartbutton.click();
   }
   public void remove()
   {
	   removebutton.click();
   }
   public void continuebutton()
   {
	   continueshopping.click();
   }
   public void checkout()
   {
	   checkoutbutton.click();
   }
  
   
  	
	
	
	
	
	
	
}
