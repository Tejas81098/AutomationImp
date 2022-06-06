package comSauceDemoTestClasses;

import org.testng.annotations.Test;

import comSauceDemoPomClasses.AddToCart;
import comSauceDemoPomClasses.CheckoutOverview;
import comSauceDemoPomClasses.YourInformation;
import junit.framework.Assert;

public class BaseClass2 extends SauceDemoBaseClass
{
	@Test(priority=1)
    
    public void Verifylogin()

    {
	     String expectedUrl="https://www.saucedemo.com/inventory.html";
	     String actualUrl= driver.getCurrentUrl();
	    
	     System.out.println(actualUrl);
	     
	     // Applying Assertion 
	     
	    Assert.assertEquals(actualUrl,expectedUrl);
		
	}
  @Test(priority=2)
      
      public void Addtocart() throws InterruptedException
      {
	  Thread.sleep(4000);
	
		   // add to card functinality calling
		   AddToCart a= new  AddToCart(driver);
		   
		   a.clickaddtocart();
		   a.clickshoping();
		   a.remove();
		   a.checkout();
//		   a.continuebutton();
//		   Thread.sleep(4000);
	   
		  
		 String expectedUrl="https://www.saucedemo.com/checkout-step-one.html";
		     String actualUrl=driver.getCurrentUrl();
		    System.out.println(actualUrl);
		     
		    Assert.assertEquals(actualUrl,expectedUrl);
			
    Thread.sleep(4000);
	} 
  @Test(priority=3)
	
	public void information() throws InterruptedException
	{
	    Thread.sleep(4000);
	   // add to card functinality calling
	   AddToCart a= new  AddToCart(driver);
	   
	   a.clickaddtocart();
	   a.clickshoping();
	   a.remove();
	   a.checkout();

		   
		    // Your information  Class calling\
		   
		   YourInformation x = new YourInformation(driver);
		   
		   		  
		   x.sendfirstname();
		   Thread.sleep(2000);
		   
		   x.sendlastname();
		   Thread.sleep(2000);
		   
		   x.sendpostalcode();
		   Thread.sleep(2000);
		   
		   x.continuebutton();
	//	   x.cancelbutton();
		  
		   
		   
		     String expectedText= "DESCRIPTION";
		     String ActualText="DESCRIPTION";
		    
		     Assert.assertEquals(ActualText,expectedText);
     Thread.sleep(4000);
	}
       
	@Test(priority=4)
	
	public void checkout() throws InterruptedException
	{
		   Thread.sleep(4000);
		   // add to card functinality calling
		   AddToCart a= new  AddToCart(driver);
		   
		   a.clickaddtocart();
		   a.clickshoping();
	//	   a.remove();
		   a.checkout();
		   Thread.sleep(4000);
//		   a.continuebutton();
//		   Thread.sleep(4000);
//		   
		    // Your information  Class calling\
		   
		   YourInformation x = new YourInformation(driver);
		   
		  		  
		   x.sendfirstname();
		   x.sendlastname();
		   x.sendpostalcode();
		   x.continuebutton();
	//	   x.cancelbutton();
		  
		   Thread.sleep(4000);
		   
		   // checkout class calling
		   CheckoutOverview c= new CheckoutOverview(driver);
         
		   c.check();
		   
		   String expectedurl="https://www.saucedemo.com/checkout-complete.html";
		   String Actualurl=driver.getCurrentUrl();
		   System.out.println(Actualurl);
		   
		   Assert.assertEquals(Actualurl, expectedurl);
		   
		   Thread.sleep(4000);
	}

}




  
  
  
  
  
  
  
  
  
  
  
  
  



