package framework_testng.DP;

import org.testng.annotations.Test;

public class Get_Dataprovider_From_Diff_Class {
	  
	
	
	  @Test(dataProvider="userdata",dataProviderClass=DataProvider_InputData.class)
	  public void tc002(String name,String mobile) 
	  {
		  
		  
		  
	  }
	  
	  
	  /*
	   * Inorder to access dataprovider annotation in diff class. We
	   * muset declare dataprovider annotated method with static access specifier..
	   */
}
