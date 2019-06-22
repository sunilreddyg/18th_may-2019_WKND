package datadriven_framework.PropertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_To_PropertyFiles {

	public static void main(String[] args) throws IOException 
	{
		//Create object for Property files
		Properties repository=new Properties();
				
		repository.setProperty("Result1", "Tc001 Pass");
		repository.setProperty("Result2", "Tc002 Pass");
		repository.setProperty("Result3", "Tc003 Pass");
		repository.setProperty("Result4", "Tc004 Pass");
		
		
		//Create property output file
		String filepath="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\src\\framework\\PropertyFiles\\";
		FileOutputStream fo=new FileOutputStream(filepath+"Output.properties");
		repository.store(fo, "Output data for login");

	}

}
