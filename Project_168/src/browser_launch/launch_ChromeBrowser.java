package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_ChromeBrowser
{

	public static void main(String[] args)
	{
		
		/*
		 * Download chrome browser driver:--->
		 * 
		 *  URl=L:--> https://www.seleniumhq.org/download/
		 *  	=>  Under third party drivers,bindings and plugins
		 *  		  click google chromedriver  link
		 *  	=>   download chromedriver w.r.t browser version and OS
		 *  	=>   After download unzip the file to project folder
		 *  
		 *  Note:-->
		 *       	Before lauch chome browser set runtime environement
		 *       	property using below syntax.
		 *       
		 *       	System.setProperty("keyname","location of .exe file");
		 */
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Call Firefox instance to launch browser
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");   //get method load webpage to browser window.
		
		 
		
	}

}
