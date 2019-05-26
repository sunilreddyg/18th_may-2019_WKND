package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");  //Load webpage to browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);   //Timeout to load all notifications..
		
		
		//Select Roundtrip radio button
		WebElement RoundTrip=driver.findElement(By.id("RoundTrip"));
		RoundTrip.click();  //We use click method to select radio buttons
		
		
		//IDentify auto-complete editbox and type referral keyword
		WebElement From_Editbox=driver.findElement(By.id("FromTag"));
		From_Editbox.clear();
		From_Editbox.sendKeys("HYD");  
		//Implicit wait manage timegap to laod suggestions.
		WebElement Hyd_city=driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)"));
		Hyd_city.click();
		
		
		//IDentify auto-complete editbox and type referral keyword
		WebElement To_Editbox=driver.findElement(By.id("ToTag"));
		To_Editbox.clear();
		To_Editbox.sendKeys("DEL");
		//Implicit wait manage timegap to laod suggestions.
		WebElement Delhi_City=driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)"));
		Delhi_City.click();
		
		
		//Select Any date from calendar [Date-picker]
		WebElement Current_month_Date=driver.findElement(By.linkText("28"));
		Current_month_Date.click();
		
		
		//IDentify Return date editbox
		WebElement ReturnDate=driver.findElement(By.id("ReturnDate"));
		ReturnDate.clear();
		ReturnDate.sendKeys("Tue, 22 Oct, 2019"+Keys.ESCAPE);
		
		
		//Click On search button
		WebElement Search_btn=driver.findElement(By.id("SearchBtn"));
		Search_btn.click();
		
		
		
		
		

	}

}
