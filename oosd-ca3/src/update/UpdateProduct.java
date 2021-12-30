package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			30/12/2021

public class UpdateProduct
{
	public static void main(String [] args)
	{
		final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
		Connection connection = null ;
		PreparedStatement prepstat = null ;
		String productName = "Drill";
		double productPrice = 399.99;
		int productStock = 19;
		int i = 0;
		
		try
		{
			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("UPDATE product SET ProductStock=?, ProductPrice=? WHERE ProductName=?");
			prepstat.setString(3, productName);
			prepstat.setDouble(2, productPrice);
			prepstat.setInt(1, productStock);
			
			
			// insert data into table
			i = prepstat.executeUpdate();
			System.out.println (i + " record successfully updated in the table.");
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
