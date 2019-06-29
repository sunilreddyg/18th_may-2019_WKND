package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider_InputData 
{
  @Test(dataProvider = "dp")
  public void tc001(String UID,String PWD)
  {
	  System.out.println(UID+"   "+PWD);
  }

  @DataProvider
  public static Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { "user1", "pwd1" },
      new Object[] { "user2", "pwd2" },
      new Object[] { "user3", "pwd3" },
      new Object[] { "user4", "pwd4" },
    };
  }
  
  
  
  @DataProvider
  public static String[][] userdata()
  {
	  String data[][]=
		  {
				  {"kiran","9030234564"},
				  {"akash","9787897987"},
				  {"suresh","9879798777"},
		  };
	  
	  return data;
  }
  
  
  
  
  
}
