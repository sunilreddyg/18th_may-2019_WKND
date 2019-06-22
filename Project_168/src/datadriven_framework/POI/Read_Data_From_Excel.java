package datadriven_framework.POI;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel
{

	public static void main(String[] args) throws IOException
	{
		
		
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object to access workbook at location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Using book target required sheet
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Taret first row at above sheet
		XSSFRow row=sht.getRow(1);
		
		//Target cell
		XSSFCell cell=row.getCell(0);
		
		//Get String cell data
		String AppUrl=cell.getStringCellValue();
		System.out.println("Url is => "+AppUrl);
		
		//Get String cell data
		String CustomerID=row.getCell(1).getStringCellValue();
		System.out.println("Customer ID is => "+CustomerID);
		
		//Get String Cell data [Reading mobile number in string format]
		String Mobile_num=row.getCell(2).getStringCellValue();
		System.out.println("Mobile number is => "+Mobile_num);
		
		

	}

}
