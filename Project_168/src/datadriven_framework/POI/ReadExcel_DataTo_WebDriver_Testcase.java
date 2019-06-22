package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel_DataTo_WebDriver_Testcase 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object to access workbook at location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Using book target required sheet
		XSSFSheet sht=book.getSheet("Sheet2");
		
		//Taret first row at above sheet
		XSSFRow row=sht.getRow(6);
		
		
		
		//Browser Initiation..
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Get Url from Zero cell
		String Url=row.getCell(0).getStringCellValue();
		driver.get(Url);
		
		//Get First cell value
		String Locator_Signin_btn=row.getCell(1).getStringCellValue();
		driver.findElement(By.xpath(Locator_Signin_btn)).click();
		
		//Get Second and 3rd cell values
		String Locator_email_EB=row.getCell(2).getStringCellValue();
		String Input_email_EB=row.getCell(3).getStringCellValue();
		WebElement Email_Editbox=driver.findElement(By.xpath(Locator_email_EB));
		Email_Editbox.clear();
		Email_Editbox.sendKeys(Input_email_EB);
		
		//Get 4th cell value
		String Locator_Email_next_btn=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Locator_Email_next_btn)).click();
		
		
		
	}

}
