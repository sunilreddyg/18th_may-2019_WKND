package touch_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Example_Touch_Actions 
{

	public static void main(String[] args) 
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		//Enable touch interactions at automation browser
		TouchActions touch=new TouchActions(driver);
		
		WebElement Exp_salary_btn=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		touch.singleTap(Exp_salary_btn).perform();
		
		touch.down(515, 572).perform();
		
		
	}

}
