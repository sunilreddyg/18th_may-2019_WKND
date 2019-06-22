package extent_reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReposts_With_WebDriver {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		//Location of file
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\reports\\";
		//Create object for Extent reports
		ExtentReports reports=new ExtentReports(filepath+"LoginTest_Reports.html", true);
		
		
		ExtentTest test1=reports.startTest("Tc001 Verify login");
		
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		test1.log(LogStatus.INFO, "browser launched and maximized");
		
		driver.get("http://outlook.com");
		test1.log(LogStatus.INFO, "Url loaded to browser window");
		
		WebElement Signin_btn=driver.findElement(By.xpath("//a[@class='linkButtonSigninHeader']"));
		Signin_btn.click();
		test1.log(LogStatus.INFO, "Signin button clicked");
		
		
		WebElement Email_editbox=driver.findElement(By.xpath("//input[@type='email']"));
		Email_editbox.clear();
		Email_editbox.sendKeys("sunilreddy.gajjala@outlook.com");
		test1.log(LogStatus.INFO, "Email Enter successfull");
		
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		Next_btn.click();
		test1.log(LogStatus.INFO, "Next button clicked");
		
		Thread.sleep(5000);
		test1.log(LogStatus.INFO, "Static timeout waiting for 5 seconds");
		
		
		//Capture screen
		String imagepath=filepath+"\\Screens\\Email_valid.png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(imagepath));
		
		//Verify password visible at webpage
		WebElement Password_Editbox=driver.findElement(By.xpath("//input[@name='passwd']"));
		if(Password_Editbox.isDisplayed())
		{
			test1.log(LogStatus.PASS, "Test pass Screen captured ",test1.addScreenCapture(imagepath));
		}
		else
		{
			test1.log(LogStatus.FAIL, "Failure screen captured",test1.addScreenCapture(imagepath));
		}
		
		
	
		
		reports.endTest(test1);
		
		
		reports.flush(); //Write and save reports
		
		

	}

}
