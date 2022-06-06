package comSauceDemoTestClasses;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import UtilitypomClases.UtilityClasses;
import comSauceDemoPomClasses.LoginPage;
import junit.framework.Assert;

public class TC001LoginFunctionality extends SauceDemoBaseClass

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
}


