package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Read_Data_From_Multiple_Rows {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object to access workbook at location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Using book target required sheet
		XSSFSheet sht=book.getSheet("Sheet3");
		
		
		
		
		//Browser Initiation..
		//Set location of chromedriver before launch chrome browser..
		String path="E:\\18th_may_2019_WKND\\selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Get Url from Zero cell
		String Url=sht.getRow(0).getCell(1).getStringCellValue();
		driver.get(Url);
		
		
		
		//Get List of rows data available in excel
		int Rcount=sht.getLastRowNum();
		
		//Iterate for number of rows
		for (int i = 5; i <= Rcount; i++)
		{
			//Target static row to read locators
			String UID_locator=sht.getRow(1).getCell(1).getStringCellValue();
			String PWD_locator=sht.getRow(2).getCell(1).getStringCellValue();
			
			
			//Target Dynamic row
			String username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.xpath(UID_locator)).clear();
			driver.findElement(By.xpath(UID_locator)).sendKeys(username);
			
			driver.findElement(By.xpath(PWD_locator)).clear();
			driver.findElement(By.xpath(PWD_locator)).sendKeys(password);
			
			Thread.sleep(3000);
			
		}
		
		
		

	}

}
