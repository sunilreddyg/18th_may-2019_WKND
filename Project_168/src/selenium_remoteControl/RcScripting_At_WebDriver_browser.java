package selenium_remoteControl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class RcScripting_At_WebDriver_browser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Enable Old Rc scripting on WebDriver automation browser..
		WebDriverBackedSelenium rc=new WebDriverBackedSelenium(driver, "http://");
		
		//Type text into editbox using RC
		rc.type("id=u_0_l", "newuser");
		rc.type("name=lastname", "webdriver");
		
		//Select dropdown
		rc.select("day","17");
		rc.select("xpath=//select[@id='month']", "May");
		
		//Using javascript select dropdown option
		rc.getEval("document.getElementById('year').value='1990'");

		
		//Click Messenger link
		rc.click("link=Messenger");
		
		
		
		
		
	}

}
