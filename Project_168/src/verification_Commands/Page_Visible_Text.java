package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Visible_Text {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Gettext:-->
		 * 			Method capture selected element and it's outterText
		 */
	
		/*
		 * Testcase:-->
		 * 			Verify welcome message display on valid email entry
		 * Steps:-->
		 * 			Enter site url http://gmail.com
		 * 			Enter valid email and click next button
		 * Expected:-->
		 * 			Navigate to next page and display Welcome message..
		 */
		
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//Identify email editbox and press enter key
		WebElement Email_editbox=driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email_editbox.clear();
		Email_editbox.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		Thread.sleep(5000);
		
		
		//Identify webpage
		WebElement Webpage=driver.findElement(By.tagName("body"));
		//Get page visible text
		String page_visible_text=Webpage.getText();
		System.out.println(page_visible_text);
		
		//Verify Expected text visible at webpage
		if(page_visible_text.contains("Welcome"))
			System.out.println("password entry page displayed");
		else
			System.out.println("password entry page not displayed");

	}

}
