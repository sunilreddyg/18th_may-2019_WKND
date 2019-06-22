package datadriven_framework.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_PropetyFiles {

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\src\\framework\\PropertyFiles\\Input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object for properties
		Properties repository=new Properties();
		//Load input data to repository
		repository.load(fi);
		
		
		//Get Property from repository
		String URL=repository.getProperty("appurl");
		System.out.println(URL);
		
		String UID=repository.getProperty("username");
		System.out.println(UID);
		
		
		

	}

}
