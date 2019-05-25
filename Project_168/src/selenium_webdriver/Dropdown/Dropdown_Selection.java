package selenium_webdriver.Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) throws Exception {
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/branch-atm-locator");  //Load webpage to browser window
		driver.manage().window().maximize();
		
	
		
		/*
		 * Selecting dropdown-option using visible option name.
		 * 		
		 * 		new Select(WebElement).SelectByVisibleText("Option Name")
		 */
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Delhi");
		Thread.sleep(5000);  //Timeout to load Cities w.r.t state selection
		
		
		/*
		 * Selecting dropdown option using value attribute
		 *    
		 *    	new Select(WebElement).SelectByValue("Option value ");
		 */
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("new-delhi");
		
		
		
		//Identify Locality editbox and type text init
		WebElement Locality=driver.findElement(By.id("customLocality"));
		Locality.clear();
		Locality.sendKeys("Gandhi nagar");
		Thread.sleep(5000);  //Timeout to Enable  search radius dropdown
		
		
		
		/*
		 * Selecting Dropdown option using index number
		 * 		new Select(WebElement).SelectByIndex(int index-number);
		 */
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
		
		
		
		//Select Checkbox [For checkbox check and uncheck for both we use click command only]
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		
		//Click Search button
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
		
		
		
		
		
		
		
		

	}

}
