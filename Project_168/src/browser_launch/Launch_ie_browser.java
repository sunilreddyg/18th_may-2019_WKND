package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_ie_browser
{

	public static void main(String[] args)
	{
		
		/*
		 * download  IEDriverServer.exe file
		 * 		URL:--> https://www.seleniumhq.org/download/
		 * 		download IEdriverserver under the internet explorer driver server.
		 * 
		 * 		Security setting for IE-browser:-->
		 * 			
		 * 			=>  IE browser zoom level should be 100%
		 * 			=>  Go to internet options and disable all security and private 
		 * 						settings
		 * 
		 */
		
		
		//Set runtime environment variable beforelaunch IE browser
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		
		//launch ie browser instance
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");  //get method load webpage to browser window
		
		
	
		

	}

}
