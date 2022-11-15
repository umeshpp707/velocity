package Utilpakage;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basepackage.baseclas1;
import basepackage.baseclass;



public class utilityclass extends baseclas1 {
	public static WebDriver driver;
	public static void takescreenshot(String filename) throws IOException {
	 Date currentdate=new Date();
	 String screenshotfile=currentdate.toString().replace(";", ",").replace(":",",");
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src, new File("C:\\Users\\renuk\\Desktop\\Screenshot\\"+filename+".png"));
	    
	    
   
	}
   
   
	 

}
