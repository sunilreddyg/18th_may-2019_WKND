package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_CssValue 
{
	public static void main(String[] args) 
	{
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//identify sensex tab
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
		Sensex_tab.click();
		
		//Get Tab back-ground color
		String Bg_color=Sensex_tab.getCssValue("background-color");
		
		String Exp_color="rgba(231, 120, 23, 1)";
		
		//Verify Runtime and expected color
		if(Bg_color.equals(Exp_color))
			System.out.println("Sensex tab active");
		else
			System.out.println("Sensex tab deactive");
		
		
		//Get selected element font-size
		String font_size=Sensex_tab.getCssValue("font-size");
		System.out.println("font size is displayed => "+font_size);
		
		
		
		/*
		 * Hex to rgba converter
		 * 		http://hex2rgba.devoth.com/
		 */
	}

}
