package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Group_Links {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Example:--> Identify group links at webpage. And
		 * 		operate each link using iterations.
		 */
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		//identify page links of location
		WebElement Page_links_location;
		Page_links_location=driver.findElement
				(By.xpath("//div[@data-reactid='232']"));
		
		//IDentify list of link under Page location
		List<WebElement> All_links;
		All_links=Page_links_location.findElements(By.tagName("a"));
		
		//Iterate for all links
		for (int i = 0; i < All_links.size(); i++)
		{
			//Target Each link
			WebElement Each_link=All_links.get(i);
			
			//Get Linkname and Linkhref
			String linkname=Each_link.getText();
			String Linkhref=Each_link.getAttribute("href");
			
			System.out.println(linkname+"   "+Linkhref);
			
			//click eachlink
			Each_link.click();
			Thread.sleep(4000);
			
			//Navigate to back page
			driver.navigate().back();
			Thread.sleep(4000);
			
			//Restore all page referral identificaiton to avoid "StaleElementReferenceException"
			
			Page_links_location=driver.findElement
					(By.xpath("//div[@data-reactid='232']"));
			All_links=Page_links_location.findElements(By.tagName("a"));
			
		}
		
	}

}
