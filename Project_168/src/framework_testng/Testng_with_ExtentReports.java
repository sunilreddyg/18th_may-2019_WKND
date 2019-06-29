package framework_testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;

public class Testng_with_ExtentReports 
{
  ExtentReports logger;
  ExtentTest test;
  
  
  
  @Test
  public void tc001()
  {
	  test.log(LogStatus.PASS, "tc001 executed successfull");
  }
  
  
  @Test
  public void tc002()
  {
	  
	  test.log(LogStatus.FAIL, "tc001 executed successfull");
  }
  
  
  
  @Test
  public void tc003()
  {
	  test.log(LogStatus.SKIP, "tc001 executed successfull");
  }
  
  
  @BeforeMethod
  public void beforeMethod(Method method) 
  {
	  test=logger.startTest(method.getName());  //Get Current constructed method
  }

  @AfterMethod
  public void afterMethod() 
  {
	  logger.endTest(test);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  String filepath="D:\\reports\\Myreports.html";
	  logger=new ExtentReports(filepath,true);
  }

  @AfterClass
  public void afterClass() throws InterruptedException
  {
	  Thread.sleep(5000);
	  logger.flush();
  }

}
