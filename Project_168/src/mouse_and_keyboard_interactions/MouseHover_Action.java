package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Action {

	public static void main(String[] args) throws Exception 
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		/*
		 *  Note:--> Create object for Actions class,In order to use mouse and keyboard
		 *  		 interaction commands.
		 */
		
		//Enable mouse and keyboard interactions at Automation Browser..
		Actions action=new Actions(driver);
		
		//Identify Category location and Perform mouse hover action.
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		action.moveToElement(Category).perform();
		Thread.sleep(4000);
		
		//Identify Elemnet and perform mousehover action
		WebElement Sub_Mobile_And_Computer=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		action.moveToElement(Sub_Mobile_And_Computer).perform();
		Thread.sleep(4000);
				
		//Identify Laptops
		WebElement sub_laptops=driver.findElement(By.xpath("//span[text()='Laptops']"));
		action.click(sub_laptops).perform();
		
		
		
	}

}
