package switch_commands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_iterator {

	public static void main(String[] args) throws Exception 
	{
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All window Dynamic ID's open by WebDriver.
		Set<String> AllwindowIDs=driver.getWindowHandles();
		//Get All Collection of set objects into iterators
		Iterator<String> itr=AllwindowIDs.iterator();
		
		//Using Conditional loop iterate for allwindows
		while(itr.hasNext())
		{
			 String Each_itr=itr.next();
			 driver.switchTo().window(Each_itr);
			//Get Runtime title of EachWindow
				String Runtime_title=driver.getTitle();
				
				//Decision to accept on expected title
				if(Runtime_title.contains("Cancel Train Bookings"))
				{
					break; //Where it break statement it keep controls on same window
				}
		}
		
		
		System.out.println("Current focused window title is => "+driver.getTitle());
		

	}

}
