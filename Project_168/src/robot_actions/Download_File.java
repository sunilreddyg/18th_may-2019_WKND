package robot_actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Download_File
{

	public static void main(String[] args) throws Exception 
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		//Identify Element
		WebElement download=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/p[3]/a"));
		download.click();
		Thread.sleep(3000);
		
		//Create object for Robot framework
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Use shift+Tab
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		
		//release shift
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		//Press enter
		robot.keyPress(KeyEvent.VK_ENTER);
	
		
		
		
		
		

	}

}
