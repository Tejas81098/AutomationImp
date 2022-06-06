package comSauceDemoTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import comSauceDemoPomClasses.AddToCart;
import comSauceDemoPomClasses.LoginPage;
import junit.framework.Assert;

public class TC003AddToCartFuctinality  extends SauceDemoBaseClass
{
      @Test(priority=3)
      
      public void Addtocart() throws InterruptedException
      {
	
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
			

	}

}
