package switch_commands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_iterator_Get_Next_Window {

	public static void main(String[] args) throws Exception {
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	
		//Identify Instagram link
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();
		Thread.sleep(5000);
		
		//Get All window Dynamic ID's open by WebDriver.
		Set<String> AllwindowIDs=driver.getWindowHandles();
		//Get All Collection of set objects into iterators
		Iterator<String> itr=AllwindowIDs.iterator();
		
		//Reading each token using next keyword
		String W1=itr.next();
		driver.switchTo().window(W1);
		System.out.println("W1 title is => "+driver.getTitle());
		
		//Reading each token using next keyword
		String W2=itr.next();
		driver.switchTo().window(W2);
		System.out.println("W2 title is => "+driver.getTitle());
		
		
				

	}

}
