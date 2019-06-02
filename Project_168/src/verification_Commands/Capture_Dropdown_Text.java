package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Capture_Dropdown_Text {

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Testcase:-->
		 * 			Verify respective city option displayed on State selection.
		 */
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		//Select any state seletion
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(10000);   //Timeout to load cities
		
		
		//IDentify City Dropdown
		WebElement City_Dropdown=driver.findElement(By.name("cityName"));
		String All_City_Options=City_Dropdown.getText();
		System.out.println(All_City_Options);
		
		
		//Condition to accept on Expected City Displayed
		if(All_City_Options.contains("Anantapur"))
		{
			System.out.println("Expected city displayed on respective state selection");
		}
		else
		{
			System.out.println("Expected city not available at dropdown list");
		}
		
		
		
		
		
		
		

	}

}
