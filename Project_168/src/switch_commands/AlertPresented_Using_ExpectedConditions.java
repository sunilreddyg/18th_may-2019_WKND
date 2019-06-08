package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertPresented_Using_ExpectedConditions 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:-->
		 * 			Verify search job without enter selectcourse and keyword.
		 * Steps:-->
		 * 		=> Given url https://www.firstnaukri.com/
		 * 		=> When click search button without enter Select courst and Keyword Enter
		 * 		=> Then receive Alert with expected text.
		 */
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Conditional statement to verify alert presented
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			//Switch to alert
			Alert alert=driver.switchTo().alert();
			
			//Capture alert text
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			
			//Accept alert window [Closing alert widnow]
			alert.accept();
		}
		else
		{
			System.out.println("alert not presented");
		}
		
		

	}

}
