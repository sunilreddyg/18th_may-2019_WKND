package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_With_Conditional_Statements 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object to access workbook at location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Using book target required sheet
		XSSFSheet sht=book.getSheet("Sheet4");
		
		
		//get number of rows data available at sheet
		int Rcount=sht.getLastRowNum();
		
		//Iteare for number or rows
		for (int i = 5; i <= Rcount ; i++)
		{
			//Get Execution status cell
			String Exe_Status=sht.getRow(i).getCell(2).getStringCellValue();
			
			//Condition to accept only when status yes
			if(Exe_Status.equalsIgnoreCase("y"))
			{
				
				//Get Username and password
				String username=sht.getRow(i).getCell(0).getStringCellValue();
				String password=sht.getRow(i).getCell(1).getStringCellValue();
				
				//Condition to accept on related scenario..
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				if(Stype.equalsIgnoreCase("text"))
				{
					System.out.println("Text captured for => "+username+"  AND "+password);
				}
				else if(Stype.equalsIgnoreCase("alert"))
				{
					System.out.println("alert captured for => "+username+"  AND "+password);
				}
				else if(Stype.equalsIgnoreCase("object"))
				{
					System.out.println("object verified for => "+username+"  AND "+password);
				}
				else
				{
					System.out.println("Sceario type mismatc in excel");
				}
			}
			
			
			
		}

	}

}
