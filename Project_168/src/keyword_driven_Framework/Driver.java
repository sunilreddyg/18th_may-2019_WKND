package keyword_driven_Framework;

import org.openqa.selenium.By;

public class Driver extends Repository
{
  
		
	public static void main(String args[])
	{
		Repository obj=new Repository();
		
		obj.LaunchBrowser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		Excel.excel_connection("KWD.xlsx", "Sheet1");
		
		//Get Dynmic row count at excel
		int Rcount=Excel.sht.getLastRowNum();
		
		//Iterate for number of rows
		for (int i = 1; i <= Rcount; i++) 
		{
			
			String Tcname=Excel.getcellData(i, 0);
			String Lname=Excel.getcellData(i, 1);
			String Lvalue=Excel.getcellData(i, 2);
			String keyword=Excel.getcellData(i, 3);
			String Inputdata=Excel.getcellData(i, 4);
			
			
			//Convert Locator name and value into BY class
			By Common_Locator=Locator.convert_locator(Lname, Lvalue);
			
			
			//Switch to keyword w.r.t keyword name
			switch (keyword)
			{
			case "enter_text":
				obj.Enter_text(Common_Locator, Inputdata);
				break;
				
			case "select_dropdown":
				obj.Select_dropdown(Common_Locator, Inputdata);
				break;
				
			case "click_element":
				obj.Click_element(Common_Locator);
				break;
				
			case "switchto_window":
				obj.switchto_window(Inputdata);
				break;
				
			case "mouse_hover":
				obj.MouseHover(Common_Locator);
				break;
				

			default:
				break;
			}
			
		}
		
	}
	
	
 }


