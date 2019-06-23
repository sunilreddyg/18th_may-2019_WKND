package method_parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import pageobjects.FB_Signup;

public class Run_Repository {

	public static void main(String[] args)
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		
		//Enter Text into Editbox using Reusable Keyword.
		obj.Enter_text("//input[@name='firstname']", "Newuser");
		obj.Enter_text("//input[@name='lastname']", "WebDriver");
		
		
		obj.Enter_text(By.name("reg_email__"), "newuserwebdriver@gmail.com");
		
		//Get Pageobject using pagefactory class
		FB_Signup signup=PageFactory.initElements(obj.driver, FB_Signup.class);
		//Calling reusable method using page objects
		obj.Enter_text(signup.Retype_email_EB, signup.IP_Retype_Email);
		obj.Enter_text(signup.password_EB, signup.IP_password);
		
		
		
		
		
		
	}

}
