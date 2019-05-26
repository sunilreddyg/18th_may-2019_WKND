package selenium_webdriver.Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_Option_At_Single_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Example:--> Verify dropdown allow more than one option selection.
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/branch-atm-locator");  //Load webpage to browser window
		driver.manage().window().maximize();
		
		
		//using javascript convert single option dropdown to multiple option dropdown
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");		
		Thread.sleep(5000);  //General timeout
		
		
		//Verifying dropdown accept multiple selection type.
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);
		
		
		//Write decision statement to accept condition on multiple selection.
		if(flag==true)
		{
			Select Dropdown=new Select(driver.findElement(By.id("customState")));
			Dropdown.deselectAll();   //Deselection only accept on multiple selection
			
			//Select multiple options
			Dropdown.selectByIndex(3);
			Dropdown.selectByIndex(6);
			Dropdown.selectByIndex(9);
			
			//Get Selection count
			int Count=Dropdown.getAllSelectedOptions().size();
			if(Count > 1)
			{
				System.out.println("Dropdown accepted multiple selection");
			}
			else
			{
				System.out.println("Dropdown failed to select multiple options");
			}
			
        }
		else
		{
			System.out.println("Dropdown is not a multiple selection type..");
		} 
	}
}
