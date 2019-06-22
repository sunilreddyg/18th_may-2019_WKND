package waitcommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_and_verify_title 
{

	public static void main(String[] args) 
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		
		String Exp_title="Selenium - Web Browser Automation";
		
		
		//Create object for explicit
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleIs(Exp_title));
		System.out.println("Selenium hq title verified");
		
	
		//Identify and click download link
		WebElement download=driver.findElement(By.linkText("Download"));
		download.click();
		
		
		wait.until(ExpectedConditions.titleContains("Downloads"));
		System.out.println("Download page title verified");
		
		
		/*
		 * Note:--> Explicitwait throws "Timeout exception" In case
		 * 			expected behaviour not found.
		 */
	}

}
