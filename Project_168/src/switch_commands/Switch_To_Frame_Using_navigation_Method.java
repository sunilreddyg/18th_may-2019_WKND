package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Frame_Using_navigation_Method 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		Thread.sleep(5000);  //General timeout
		
		
		//Switch to Frame using Navigation command
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
		
		
		
		//Identify Editbox
		WebElement Email=driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys("Qadarshan@gmail.com");
		
		//Identify Editbox
		WebElement Trip_id=driver.findElement(By.id("tripidSecond"));
		Trip_id.clear();
		Trip_id.sendKeys("Hello12345");
		Thread.sleep(5000);  //General timeout		
		
		
		//Navigate to back page
		driver.navigate().back();
		
		

	}

}
