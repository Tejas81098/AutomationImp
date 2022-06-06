package comSauceDemoTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import comSauceDemoPomClasses.HomepageLogout;
import comSauceDemoPomClasses.LoginPage;

public class SauceDemoBaseClass
{
    WebDriver driver;
     
      //cross browser testing
//     @Parameters("browserName")
//      
       @BeforeClass
       
       public void BrowserOpen()
      {
//    	 if(browserName.equals("chrome"))
//    	 {
        System.setProperty("webdriver.chrome.driver",
  			"D:\\SeleniumConfigurefile\\chromeDriver\\chromedriver.exe");
  	
        driver= new ChromeDriver();
        System.out.println("open browser");

       driver.manage().window().maximize(); 
        }
//        else if(browserName.equals("firefox"))
//     
//          {
//    	   System.setProperty("webdriver.gecko.driver",
//    			   "D:\\SeleniumConfigurefile\\FirefoxDriver\\geckodriver.exe");
//    	        driver= new FirefoxDriver();
//    	        System.out.println("open browser");
//
//    	       driver.manage().window().maximize(); 
//          }
//      }	       
    
        @BeforeMethod
      
     public void SetUpMethod() 
  {  
	
   
       driver.get("https://www.saucedemo.com/");
       System.out.println("open sauce demo url");

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

     LoginPage l= new LoginPage( driver);
     
     l.senduserName();
     System.out.println("Send Username");
     
     l.sendpassword();
     System.out.println("send Password");
     
     l.login();
     System.out.println("login succesfull");
	
     }
	
    @AfterMethod
	public void tearDownMethod() throws InterruptedException
	{
		 // logout functinality
		   HomepageLogout hc= new  HomepageLogout(driver);
		   hc.dotclick();
		   Thread.sleep(4000);
		   hc.logout();
		   Thread.sleep(4000);
	}
	
	@AfterClass
   public void quit() 
   {
		driver.quit();
		
   }
	
	
	
	
	
}
