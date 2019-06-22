package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ren_FB_Signup
{
	
	public static void main(String args[])
	{
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
				
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		FB_Signup signup=PageFactory.initElements(driver, FB_Signup.class);
		//text entry Perform at firstname,surname, mobile 
		signup.User_Signup();
		
		//Type Retype email 
		signup.Retype_email_EB.clear();
		signup.Retype_email_EB.sendKeys(signup.IP_Retype_Email);
		
		signup.password_EB.clear();
		signup.password_EB.sendKeys(signup.IP_password);
		
		
	}

}
