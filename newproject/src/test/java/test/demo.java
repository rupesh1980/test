package test;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class demo {
 	 WebDriver driver;
	 FileOutputStream fos;
	 Logger logger 
     = Logger.getLogger(demo.class.getName()); 
	 @SuppressWarnings("restriction")
	@Test
	public void display() throws InterruptedException, IOException
	{
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  logger.info("trying to click on radio button");
		  driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
	    

	 Thread.sleep(2000);
	 driver.close();
	 
	}
     
}
