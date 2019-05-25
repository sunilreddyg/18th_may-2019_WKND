package selenium_webdriver.Link;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_LInk_Using_LInkText_And_ParitalLInktext {

	public static void main(String[] args)  
	{
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://cleartrip.com");  //Load webpage to browser window
		driver.manage().window().maximize();
		
		

		/*
		 * Identify link with original link name
		 * HtmlSource:-->
		 * 			<a href="/about" title="About Us" >About Us</a>
		 */
		driver.findElement(By.linkText("About Us")).click();
		
		
		/*
		 * Identify link with original link name
		 * htmlsource:-->
		 * 			<a href="/jobs">Jobs</a>
		 */
		driver.findElement(By.linkText("Jobs")).click();
		
		
		/*
		 * identify link with original link name
		 * Htmlsource:-->
		 * 			<a href="/jobs/openings">Job Openings</a>
		 */
		driver.findElement(By.linkText("Job Openings")).click();
		
		
		/*
		 * Identify link with partial link name
		 * htmlsource:-->
		 * 		<a href="https://www.cleartrip.com/jobs/openings/qa-engineer/">
		 * 			<strong>QA Engineer</strong>
		 *		    <span class="location">Bangalore</span>	
	     *      </a>
		 */
		driver.findElement(By.partialLinkText("QA Engineer")).click();

		
		/*
		 * Identify link with partial link name
		 * htmlsource:-->
		 * 			<a href="/jobs/openings">← Back to Job openings</a>
		 */
		driver.findElement(By.partialLinkText("Back to Job openings")).click();
		
		
		
		
		/*
		 * identify link with original link name
		 * Htmlsource:-->
		 * 			<a rel="bToolTip" title="Flights" href="/flights">
		 * 				<span class="productIcon flights">Flights</span>
		 *          </a>
		 */
		driver.findElement(By.linkText("Flights")).click();
		

	}

}
