package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteCellData_Into_Excel {

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\TestData\\";
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//Get Sheet acces using above book referal
		XSSFSheet sht=book.getSheet("Sheet1");
		
		
		//Write data into existing row and existing cell
		sht.getRow(1).getCell(3).setCellValue("Newpwd123");
		
		//Write date into existing row and New cell
		sht.getRow(1).createCell(5).setCellValue("Testpass");

		//Write Data into new row and new cell
		sht.createRow(2).createCell(0).setCellValue("http://facebook.com");
		
		
		//Create output workbook
		book.write(new FileOutputStream(filepath+"OP.xlsx"));
		book.close();  //Write and Save Data into Excel

	}

}
