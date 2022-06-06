package UtilitypomClases;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClasses 
{
	      
	      public static void takescrrenshot(WebDriver driver) throws IOException 
	      {
	    	 
	    	    Date date= new Date();
	    	    DateFormat d= new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	    	    String newDate= d.format(date);
	    	    
	    		   TakesScreenshot t = (TakesScreenshot)driver;
	    		   
	    		   File SourceFile=t.getScreenshotAs(OutputType.FILE);
	    		   File destFile= new File("D:\\Scrrenshot automation\\Tejas"+newDate+".jpg" );
	    		   
	    		 FileHandler.copy(SourceFile, destFile);
	      }
	      
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

