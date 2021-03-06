package selenium_webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login_With_ImpliicitWait 
{

	public static void main(String[] args) 
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://gmail.com");  //Load webpage to browser window
		driver.manage().window().maximize();
		
		
		//Identify Email editbox and type valid email address
		WebElement Username=driver.findElement(By.id("identifierId"));
		Username.clear();
		Username.sendKeys("qadarshan@gmail.com",Keys.ENTER);
	
		
		//Identify password editbox and type valid password
		WebElement Password=driver.findElement(By.name("password"));
		Password.clear();
		Password.sendKeys("Hello123456"+Keys.ENTER);
				
				
		

	}

}
