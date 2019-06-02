package corejava.variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebELement_And_Locatore_Referral_Syntax
{

	public static void main(String[] args) 
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Syntax without element referral.
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//WebElement-referral syntax
		WebElement Password_Element=driver.findElement(By.id("pass"));
		Password_Element.clear();
		Password_Element.sendKeys("Hello12345");
		
		//Locator and WebElement referral
		By Login_btn_locator=By.id("loginbutton");
		WebElement Login_btn_Element=driver.findElement(Login_btn_locator);
		Login_btn_Element.click();
		
	

	}

}
