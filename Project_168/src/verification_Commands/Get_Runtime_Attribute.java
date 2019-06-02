package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attribute {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> Verifying appropriate error message displayed on
		 * invalid flight search using get Attribute method.
		 */
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
				
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.cleartrip.com");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		
		//Click on search button without enter proper flight details
		WebElement Search_btn=driver.findElement(By.xpath("//input[@id='SearchBtn']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Expected:--> Appropriate error message display at front page.
		WebElement Error_Locator=driver.findElement(By.xpath("//div[@id='homeErrorMessage']"));
		//Using location of error get runtime attribute property.
		String Runtime_value=Error_Locator.getAttribute("style");
		
		
		//Validate error message was displayed at webpage using runtime attribute
		if(Runtime_value.isEmpty() ||  Runtime_value.equals("display:block"))
		{
			System.out.println("Error message displayed at front page");
		}
		else
		{
			System.out.println("Error message not displayed at front page");
		}
		
		
		//Verify Element text visible at webpage
		if(Error_Locator.isDisplayed())
		{
			System.out.println("Text visible");
		}
		else
		{
			System.out.println("text not visible");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
