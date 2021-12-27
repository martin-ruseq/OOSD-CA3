package insert;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			14/12/2021

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertProduct
{
	public static void main(String [] args)
	{
		final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
		Connection connection = null ;
		PreparedStatement prepstat = null ;
		String productName = "Electric Drill";
		double productPrice = 432.21;
		int productStock = 15;
		int i = 0;
		
		try
		{
			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("INSERT INTO product (ProductName, ProductPrice, ProductStock)VALUES (?,?,?)");
			
			prepstat.setString(1, productName);
			prepstat.setDouble(2, productPrice);
			prepstat.setInt(3, productStock);

			
			// insert data into table
			i = prepstat.executeUpdate();
			System.out.println (i + " record successfully added to the table.");
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