package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_popup 
{

	public static void main(String[] args) throws Exception {
		
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Create alert using javascript
		((JavascriptExecutor)driver).executeScript("return alert('Tc001 Executed')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		//Get window title
		String pagetitle=((JavascriptExecutor)driver).executeScript
			("return document.title").toString();
		System.out.println("Window tilte is => "+pagetitle);
		
		
		

	}

}
