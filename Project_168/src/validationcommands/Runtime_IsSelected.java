package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_IsSelected 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Testcase:-->
		 * 		verify triptype functionality for roundtrip
		 * 	Steps:-->
		 * 		launch browser and load cleartrip webpage
		 * 		click roundtrip radio button.
		 * 	precondition:--> 
		 * 		make sure roundtrip radio button selected.
		 * 	Expected:-->
		 * 		system should display return date container
		 */
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		
		//click roundtrip radio button
		WebElement Roundtrip=driver.findElement(By.xpath("//input[@value='RoundTrip']"));
		//Roundtrip.click();
		
		
		//Condition to accep on roundtrip selection
		if(Roundtrip.isSelected())
		{
			//target Return date container
			WebElement returndate=driver.findElement(By.id("ReturnDate"));
			
			//Write condition statement
			if(returndate.isDisplayed())
				System.out.println("As expected return date displayed on roundtrip selection");
			else
				System.err.println("Return date not visible on roundtrip selection");
			
			
		}
		else
			System.err.println("Roundtrip is not selected, Return date not  validated");
		
		
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
