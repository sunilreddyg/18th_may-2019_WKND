package framework_testng.Run_Using_Keywords;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Run_Keywords extends Repository
{
	
	  ExtentReports logger;
	  ExtentTest test;
	  String screen_path="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\screens\\";
	  String url="http://outlook.com";
	  
	  @Test
	  public void verify_Outlook_Signin_Email_validation() throws Exception
	  {
		  
		  Click_element(By.xpath("//a[text()='Sign in ']"));
		  test.log(LogStatus.INFO, "Sign in button clicked");
		  
		  //better get location from pageobjects or any locator class
		  Enter_text(By.name("loginfmt"), "qadarshan@gmail.com");
		  test.log(LogStatus.INFO, "Email enter successfull");
		  
		  Click_element(By.id("idSIButton9"));
		  test.log(LogStatus.INFO, "Next button clicked");
		  Thread.sleep(5000);
		  
		  if(isText_visibleAt_Webpage("Enter password"))
			  test.log(LogStatus.PASS, "password element visible at webpage");
		  else
			  test.log(LogStatus.FAIL, "password not visible at webpage");
		  
		  
	  }
	  
	  
	  
	
	  
	  @BeforeMethod
	  public void beforeMethod(Method method) 
	  {
		  test=logger.startTest(method.getName());  //Get Current constructed method
		  load_webpage(url);
	  }

	  @AfterMethod
	  public void afterMethod(Method method) 
	  {
		  Capturescreen(method.getName());
		  test.log(LogStatus.INFO, test.addScreenCapture(screen_path+method.getName()+".png"));
		  logger.endTest(test);
	  }

	  @BeforeClass
	  public void beforeClass() 
	  {
		  String filepath="D:\\reports\\Myreports.html";
		  logger=new ExtentReports(filepath,true);
		  
		  LaunchBrowser("chrome");
		  set_timeout(30);
	  }

	  @AfterClass
	  public void afterClass() throws InterruptedException
	  {
		  Thread.sleep(5000);
		  logger.flush();
		  driver.close();  //driver from repository class
	  }

  
}
