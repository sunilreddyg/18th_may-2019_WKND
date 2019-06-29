package framework_testng;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Testng_WEbDriver_TestCase 
{
	  ExtentReports logger;
	  ExtentTest test;
	  WebDriver driver;
	  String driver_path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
	  String url="http://facebook.com";
	  String screenpath="D:\\screens\\";
	 
	  @Test(priority=0)
	  public void Verify_Sign_up_link()
	  {
		 driver.findElement(By.linkText("Sign Up")).click();
		 Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		 test.log(LogStatus.PASS, "Expected Page Displayed");
	  }
	  
	  
	  @Test(priority=1)
	  public void Verify_Sign_In_link()
	  {
		 driver.findElement(By.linkText("Log In")).click();
		 Assert.assertEquals(driver.getTitle(), "Log in to Facebook | Facebook");
		 test.log(LogStatus.PASS, "Login  Page Displayed");
	  }
	  
	  
	  @Test(priority=2)
	  public void Verify_Messenger_link()
	  {
		 driver.findElement(By.linkText("Messenger")).click();
		 Assert.assertEquals(driver.getTitle(), "Messenger");
		 test.log(LogStatus.PASS, "Login  Page Displayed");
	  }
	  
	  

	  @BeforeMethod
	  public void beforeMethod(Method method) 
	  {
		  test=logger.startTest(method.getName());  //Get Current constructed method
		  driver.get(url);
		  test.log(LogStatus.INFO, "Page load success => "+url);
	  }

	  @AfterMethod
	  public void afterMethod(Method method) throws IOException 
	  {
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File(screenpath+method.getName()+".png"));
		  test.log(LogStatus.INFO, "Screen captured => "+test.addScreenCapture(screenpath+method.getName()+".png"));
		  logger.endTest(test);
	  }

	  @BeforeClass
	  public void beforeClass() 
	  {
		  String filepath="D:\\reports\\Myreports.html";
		  logger=new ExtentReports(filepath,true);
		  
		  System.setProperty("webdriver.chrome.driver", driver_path);
		  driver=new ChromeDriver();  //Launch browser
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void afterClass() throws InterruptedException
	  {
		  Thread.sleep(5000);
		  logger.flush();
		  driver.close();
	  }

	
  
}
