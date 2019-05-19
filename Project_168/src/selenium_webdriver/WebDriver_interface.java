package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_interface {

	public static void main(String[] args) 
	{
		
		/*
		 * WebDriver is common interface class it can implements all
		 * browser instances supported by Selenium-WebDriver.
		 */
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//launch chrome browser instance
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");  //Load webpage to browser window
		driver.manage().window().maximize();
		
		
		
		
		
		
		

	}

}
