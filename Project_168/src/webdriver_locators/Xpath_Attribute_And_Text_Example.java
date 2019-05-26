package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute_And_Text_Example {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.naukri.com/");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		/*
		 * Identify Elemnet with element outtertext.
		 * HtmlSource:--> 
		 * 		<button  id="cjaMain">Create a Job Alert</button>
		 */
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		
		
		/*
		 * IDentify Element with unique attribute proprty
		 * HtmlSource:-->
		 * 			<input name="keyskills" type="text" id="Sug_kwdsugg">
		 * 
		 */
		driver.findElement(By.xpath("//input[@name='keyskills']")).clear();
		driver.findElement(By.xpath("//input[@name='keyskills']")).sendKeys("software testing");
		Thread.sleep(3000);  //Timeout to load suggestions
		
		
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Automation Testing']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Appium']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[.='Selenium']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[.='Cucumber']")).click();
		Thread.sleep(3000);
		
		

	}

}
