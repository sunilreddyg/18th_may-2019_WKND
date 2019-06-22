package datadriven_framework.POI.Keywords;

public class Run_POI_Keywords {

	public static void main(String[] args) {
		
		
		ExcelKeywords.getExcel_connection("InputData.xlsx","Sheet3");
		//Iterate for number or rows
		for (int i = 5; i <= ExcelKeywords.sht.getLastRowNum(); i++) 
		{
			
			//Get CellData
			String username=ExcelKeywords.getcelldata(i, 0);
			System.out.println(username);
			
			ExcelKeywords.write_celldata(i, 2, "Testpas");
		}
		
		//Create output ifle
		ExcelKeywords.Create_excel_output("op1.xlsx");
		
	}

}
