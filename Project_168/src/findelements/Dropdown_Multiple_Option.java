package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown_Multiple_Option 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> verify respective cities displayed on correspondent State
		 * 			    selection
		 */
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
	
		String Cities[]={"Please select state first","South Andaman",
				"Guntur","East Siang","Guwahati","Gaya"};
		
	
		//Identify State dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Identify list of option tags under State Dropdown
		List<WebElement> All_Options=State_Dropdown.findElements(By.tagName("option"));
		
		//Iterate for number of option times
		for (int i = 0; i < 6; i++)
		{
			//Get Each Option using dynamic Number
			WebElement Eachoption=All_Options.get(i);
			//Get Option Name
			String StateName=Eachoption.getText();
			//Click Each State Option
			Eachoption.click();
			Thread.sleep(3000);  //timeout To Load cities 
			
			//Identify Citydropdown and Capture city names 
			WebElement City_dropdown=driver.findElement(By.id("customCity"));
			String All_Cities=City_dropdown.getText();
			

			boolean flag=All_Cities.contains(Cities[i]);
			System.out.println(StateName+"   City ---"+Cities[i]+" ---Display status is => "+flag);
		
			
		}
		
	}

}
