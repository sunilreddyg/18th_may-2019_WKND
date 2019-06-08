package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args)
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Switch to frame using frame ID property
		driver.switchTo().frame("modal_window");
		
		
		
		//Identify Editbox
		WebElement Email=driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys("Qadarshan@gmail.com");
		
		//Identify Editbox
		WebElement Trip_id=driver.findElement(By.id("tripidSecond"));
		Trip_id.clear();
		Trip_id.sendKeys("Hello12345");
		
		
		//Switch controls back to mainpage source
		driver.switchTo().defaultContent();
		
		//Click Link under page source
		WebElement Flights_link=driver.findElement(By.linkText("Flights"));
		Flights_link.click();

	}

}
