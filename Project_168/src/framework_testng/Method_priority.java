package framework_testng;

import org.testng.annotations.Test;

public class Method_priority {
  @Test(priority=0)
  public void f() 
  {
	  System.out.println("browser launch");
  }
  
  @Test(priority=1)
  public void x() 
  {
	  System.out.println("application load");
  }
  
  @Test(priority=2)
  public void a() 
  {
	  System.out.println("signin");
  }
}
