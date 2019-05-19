package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser 
{

	public static void main(String[] args)
	{
		
		/*
		 * Launch Firefox browser:-->
		 * 
		 * 		=> Download geckodriver w.r.t firefox browser version
		 * 
		 * 		URL:-->  https://github.com/mozilla/geckodriver/releases
		 * 					Firefox browser version  => 65 >
		 * 					geckodriver version is   => v0.24.0
		 * 				 Download w.r.t operating systems
		 * 				 After download unzip file to project location
		 */
		
		
		//set location of geckodriver before launch firefox browser
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		//Call firefox browser instance 
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://google.com");   //get method load webpage to browser window
		
		

	}

}
