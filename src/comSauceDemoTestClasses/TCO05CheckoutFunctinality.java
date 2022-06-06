package comSauceDemoTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import comSauceDemoPomClasses.AddToCart;
import comSauceDemoPomClasses.CheckoutOverview;
import comSauceDemoPomClasses.LoginPage;
import comSauceDemoPomClasses.YourInformation;
import junit.framework.Assert;

public class TCO05CheckoutFunctinality extends SauceDemoBaseClass
{

	@Test(priority=5)
	
	public void checkout()
	{
		   
		   // add to card functinality calling
		   AddToCart a= new  AddToCart(driver);
		   
		   a.clickaddtocart();
		   a.clickshoping();
	//	   a.remove();
		   a.checkout();
		   
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
		  
		  
		   
		   // checkout class calling
		   CheckoutOverview c= new CheckoutOverview(driver);
           
		   c.check();
		   
		   String expectedurl="https://www.saucedemo.com/checkout-complete.html";
		   String Actualurl=driver.getCurrentUrl();
		   System.out.println(Actualurl);
		   
		   Assert.assertEquals(Actualurl, expectedurl);
	}

}
