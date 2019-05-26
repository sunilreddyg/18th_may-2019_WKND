package selenium_webdriver.Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Deselection_From_Multiple_Option {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Verify dropdown allow deselection after selection of multiple options
		 */  
		
		
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/branch-atm-locator");  //Load webpage to browser window
		driver.manage().window().maximize();
		
	
		/*
		 * Using javascript executor convert single option dropdown to multiple
		 * 		selection dropdown.
		 */
		((JavascriptExecutor)driver).executeScript("document.getElementById"
				+ "('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		//Method return multple selection state in true/false
		boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);
		
		//Write decision statement to Select multiple options
		if(flag==true)
		{
					Select OpenAccount=new Select(driver.findElement(By.id("open_account")));
					OpenAccount.deselectAll();  //We can deselect only on multiple seleciton type
					OpenAccount.selectByIndex(1);
					OpenAccount.selectByIndex(3);
					OpenAccount.selectByIndex(5);
					
					//Get size of selection
					int count=OpenAccount.getAllSelectedOptions().size();
					if(count==3)
					{
						//Deselect single option from selection
						OpenAccount.deselectByIndex(3);
						if(OpenAccount.getAllSelectedOptions().size() ==2)
						{
							System.out.println("Testpass:--> expected option deselected from selection");
						}
						else if(OpenAccount.getAllSelectedOptions().size() ==3)
						{
							System.out.println("Failed to deselect option ");
						}
					}
					
		}
		else
		{
			System.out.println("Dropdown is a single option selection type");
		}
				


	}

}
