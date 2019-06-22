package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Target_File_location 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
	}

}
