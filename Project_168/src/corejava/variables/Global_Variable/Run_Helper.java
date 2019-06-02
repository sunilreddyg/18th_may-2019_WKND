package corejava.variables.Global_Variable;

public class Run_Helper 
{

	public static void main(String[] args) 
	{
		
		
		//Create object for Helper class
		Helper obj=new Helper();
		
		//Set browser name at runtime variable
		obj.path="E:\\18th_may_2019_WKND\\selenium_drivers\\";
		obj.browsername="chrome";
		obj.launch_browser();
		
		//Set URL at runtime
		obj.appurl="http://facebook.com";
		obj.Load_Webpage();
		
		
		//Set username and password at runtime
		obj.username="qadarshan@gmail.com";
		obj.password="Hello12345";
		obj.User_Signin();
		
		
		//Close browser window
		obj.driver.close();

	}

}
