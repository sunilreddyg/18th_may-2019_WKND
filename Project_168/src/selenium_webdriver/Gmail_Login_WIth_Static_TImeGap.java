package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login_WIth_Static_TImeGap
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");  //Load webpage to browser window
		driver.manage().window().maximize();
		
		
		//Identify Email editbox and type valid email address
		WebElement Username=driver.findElement(By.id("identifierId"));
		Username.clear();
		Username.sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		
		
		Thread.sleep(5000);   //static timegap to load password element at source.
		
		//Identify password editbox and type valid password
		WebElement Password=driver.findElement(By.name("password"));
		Password.clear();
		Password.sendKeys("Hello123456"+Keys.ENTER);
		
		
		
		/*
		 * Sendkeys:-->
		 * 		Sendkeys is a methode it accept  "charactes sequences"
		 * 		to type and "Keyboard shortcuts" to implement on Any selected
		 * 		location.
		 * 
		 * 	  //Dummy location 
		 * 		WebElemen Element=driver.findElement(By.id("X"));
		 * 
		 *    Characters Sequences:-->
		 *    		Element.Sendkeys("a-z/0-9/special chars")
		 * 
		 * 	  Keyboard shorctus   :--> 
		 * 			Element.Sendkeys(Keys.TAB);
		 * 		
		 *    Character Sequence and Keyboard shortcuts:-->
		 *    		Elemnet.Sendkeys("Hello"+Keys.Enter);
		 *    
		 *    Multple Keyboard shortcuts to use :---> 
		 *    		Element.Sendkeys(Keys.TAB,Keys.TAB);
		 *    
		 *    
		 *    
		 *    Note:-->
		 *    		=> In Sendkeys + allow combination of characters 
		 *    			sequences and keyboard shortcuts
		 *    		=> In Sendkeys command  , allow only keyboard shortcuts
		 */
		
		
		
	}

}
