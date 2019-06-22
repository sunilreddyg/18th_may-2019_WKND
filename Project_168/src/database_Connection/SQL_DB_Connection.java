package database_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL_DB_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//Set Variable name
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		//Target database using driver manager
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost" + 
		"databaseName=MQDSNR" + "user=sunil" + "password=111");
				
		ResultSet result_set=con.createStatement()
		.executeQuery("SELECT * FROM Customers WHERE City IN ('Paris','London')");
				
				
		//Writing conditional loop to iterate number of records
		while(result_set.next())
		{
			String CID=result_set.getString("CustomerID");
			String Cname=result_set.getString("CustomerName");
		}
			

	}

}
