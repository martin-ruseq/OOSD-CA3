package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			30/12/2021

public class DeleteProduct
{
	public static void main(String [] args)
	{
		final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
		Connection connection = null ;
		PreparedStatement prepstat = null ;
		int productID = 2;
		int i = 0;
		
		try
		{
			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("DELETE FROM product WHERE ProductID=?");
			prepstat.setInt(1, productID);
			
			// insert data into table
			i = prepstat.executeUpdate();
			System.out.println (i + " record successfully deleted from the table.");
		}
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
		finally
		{
			try
			{
				prepstat.close();
				connection.close();
			}
			catch (Exception exception)
			{
				exception.printStackTrace();
			}
		}
	}
}
