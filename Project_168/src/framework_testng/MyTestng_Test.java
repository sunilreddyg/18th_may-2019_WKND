package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test
{
  @Test
  public void tc001() 
  {
	  //It send report to html file..
	  Reporter.log("tc001 executed successfull");
  }
  
  @Test
  public void tc002() 
  {
	  //It send report to html file..
	  Reporter.log("tc002 executed successfull");
  }
  
  @Test
  public void tc003() 
  {
	  //It send report to html file..
	  Reporter.log("tc003 executed successfull");
  }
}
