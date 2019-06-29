package framework_testng;

import org.testng.annotations.Test;

public class Method_Ignore {
  
	
  @Test(priority=0,enabled=false) //Ingore method execution
  public void tc001() 
  {
  }
  
  @Test(priority=1)
  public void tc002() 
  {
  }
  
  //Method doesn't invoke 
  public void tc003() 
  {
  }
  
  
  
}
