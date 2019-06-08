package robot_actions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Capturescreen 
{
	public static void main(String[] args) throws AWTException, IOException, InterruptedException
	{
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
	
		//Capture screen when alert presented
		
		//Create object for robot
		Robot robot=new Robot();
		
		//getdefault screen size of current system
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		//Capture screen using robot
		BufferedImage image=robot.createScreenCapture(new Rectangle(screensize));
		//Create file location
		File fpath=new File("C:\\Users\\SUNIL\\Desktop\\robotimage5.jpg");
		//Write image to path
		ImageIO.write(image, "jpg", fpath);
		
		
		
		/*
		 *  Why screen capture using Robot class..
		 *  
		 *  	=> Because webdriver can't take screen when alert presented..
		 */
		
		
		
	}

}
