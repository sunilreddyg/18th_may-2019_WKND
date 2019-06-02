package corejava.variables.Global_Variable;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper 
{
	public WebDriver driver;
	public String username=null;
	public String password=null;
	public String appurl=null;
	public String browsername=null;
	String path=null;
	
	public void launch_browser()
	{
		switch (browsername) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		default: System.out.println("browser name mismatch");
			break;
		}
		
		
	}
	
	
	public void Load_Webpage()
	{
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void User_Signin()
	{
		
		//Syntax without element referral.
		WebElement username_Element=driver.findElement(Locators.Signin_email);
		username_Element.clear();
		username_Element.sendKeys(username);
				
		//WebElement-referral syntax
		WebElement Password_Element=driver.findElement(Locators.Signin_pwd);
		Password_Element.clear();
		Password_Element.sendKeys(password);
		
		//Webelement referral syntax
		WebElement Signin_btn=driver.findElement(Locators.Signin_login_btn);
		Signin_btn.click();
		
	
	}

}
