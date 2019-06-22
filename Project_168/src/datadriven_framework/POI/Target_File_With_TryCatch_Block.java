package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

public class Target_File_With_TryCatch_Block {

	public static void main(String[] args) 
	{
		
		
		try {
			
			String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\TestData\\InputData.xlsx";
			FileInputStream fi=new FileInputStream(filepath);
			System.out.println("file located");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Run Continued");
		

	}

}
