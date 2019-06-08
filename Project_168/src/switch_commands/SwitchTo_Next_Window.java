package switch_commands;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Get Current Window Runtime dynamic ID
		String MainWIndow_ID=driver.getWindowHandle();
		
		
		//Identify Instagram link
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();
		Thread.sleep(5000);
		
		
		//Get All window Dynamic ID's
		Set<String> Allwindows_IDS=driver.getWindowHandles();
		
		//Iterate for number of windows
		for (String Eachwindow_ID : Allwindows_IDS) 
		{
			if(!Eachwindow_ID.equals(MainWIndow_ID)) //!--NOT
			{
				driver.switchTo().window(Eachwindow_ID);
				break; //Where it break statement it keep controls on same window
			}
		}
		
		
		
		System.out.println("Current Focused Window Title is => "+driver.getTitle());

	}

}
