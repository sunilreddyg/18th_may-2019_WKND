package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_KeyBoard_shortCuts 
{

	public static void main(String[] args) throws Exception
	{
		
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement Element=driver.findElement(By.id("u_0_j"));
		Element.sendKeys("Ajay"+Keys.TAB+"krishna"+Keys.TAB
				+"AjayKrishna@gmail.com"+Keys.TAB
				+"Ajaykrishna@gmail.com"+Keys.TAB
				+"Hello123456");
		
		
		//Select drodpown option by sending character sequences
		WebElement DOB_day=driver.findElement(By.id("day"));
		DOB_day.sendKeys("28");
		Thread.sleep(2000);  //general timeout
		
		//Select Dropdown option using keyboard shortcuts
		WebElement DOB_month=driver.findElement(By.id("month"));
		DOB_month.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		
		/*
		 * Sendkeys command doesn't throw any exception on invalid
		 * operations. For keyboard  shortcuts in webdriver we don't
		 * hava any exceptions..
		 */
		
		
		
	}

}
