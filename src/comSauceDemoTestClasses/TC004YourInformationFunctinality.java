package comSauceDemoTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import comSauceDemoPomClasses.AddToCart;
import comSauceDemoPomClasses.LoginPage;
import comSauceDemoPomClasses.YourInformation;
import junit.framework.Assert;

public class TC004YourInformationFunctinality extends SauceDemoBaseClass
{

	@Test(priority=4)
	
	public void information() throws InterruptedException
	{
	
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

	}




	}


