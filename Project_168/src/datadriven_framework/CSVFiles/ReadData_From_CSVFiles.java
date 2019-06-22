package datadriven_framework.CSVFiles;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadData_From_CSVFiles {

	public static void main(String[] args) throws IOException {
		
		
		//Target file location
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\src\\datadriven_framework\\CSVFiles\\CsvInput.csv";
		FileReader fr=new FileReader(filepath);
		System.out.println("File located");
		
		
		//Create object for csv reader
		CSVReader reader=new CSVReader(fr);
		
		String Header[]=reader.readNext();
		System.out.println(Header[0]+"   "+Header[1]);
		
		
		String Line[];
		while((Line=reader.readNext())!=null)
		{
			System.out.println(Line[0]+"    "+Line[1]);
		}
		
		
		
		
		
	}

}
