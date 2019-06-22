package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Numeric_CellData {

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
		
		//Target Numeric Cell
		Double Mobile_num_Double=row.getCell(4).getNumericCellValue();
		System.out.println("Mobile number in double format => "+Mobile_num_Double);
		
		//COnvert Double format into numeric format.
		System.out.println("Mobile number is number format is => "+Mobile_num_Double.longValue());
		
		//Convert double format numeric value int text foramt..
		String Mobilenum_String_Value=NumberToTextConverter.toText(Mobile_num_Double);
		System.out.println("Mobile number in String format is => "+Mobilenum_String_Value);
	}

}
