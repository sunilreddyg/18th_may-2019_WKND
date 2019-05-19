package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Script {

	public static void main(String[] args) {
		
		
		/*
		 * Perfrom User Login at facebook:-->
		 * 		Step1 :--> Launch Browser
		 * 		Step2 :--> Load webpage
		 * 		Step3 :--> Enter username
		 * 		Step4 :--> Enter password
		 * 		Step5 :--> Click Signin button
		 */
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//launch chrome browser instance
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");  //Load webpage to browser window
		driver.manage().window().maximize();
		
		//identify email elemnet at webpage using id property
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("qadarshan@gmail.com");
		
		//identify password element at webpage using id property
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hell0123456");
		
		//identify signin button 
		driver.findElement(By.id("loginbutton")).click();	
		
		
		
		

	}

}
