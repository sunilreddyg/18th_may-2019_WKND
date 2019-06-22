package datadriven_framework.CSVFiles;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class WriteData_To_CSV_Files {

	public static void main(String[] args) throws IOException 
	{
		//Create New file writer
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\src\\datadriven_framework\\CSVFiles\\";
		FileWriter fw=new FileWriter(filepath+"Output.csv");
		
		//Create object for CsvFiles
		CSVWriter writer=new CSVWriter(fw);
		
		String line1[]={"#email","Sunil","9030248855"};
		writer.writeNext(line1);
		
		
	
		String line2[]={"#firstname","Arjun","9521478545"};
		writer.writeNext(line2);
		
		//save and write data..
		writer.close();


	}

}
