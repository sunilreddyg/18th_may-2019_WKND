package selenium_webdriver.Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Multiple_Selection_State 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/branch-atm-locator");  //Load webpage to browser window
		driver.manage().window().maximize();
		
		
		//Verifying dropdown accept multiple selection type.
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);

	
		/*
		 * using javascript convert single option dropdown to multiple option dropdown
		 * 
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");		
		Thread.sleep(5000);  //General timeout
		
		
		//Verifying dropdown accept multiple selection type.
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag1);

		
		//Write decision statement to validate Dropdown multiple selection type
		if(flag1==true)
		{
			System.out.println("Dropdown accepting multiple selection");
		}
		else
		{
			System.out.println("Dropdown is a single option selection type");
		}
			
			
			
			
			
			
			
			
			
			
		
		
		
	}

}
