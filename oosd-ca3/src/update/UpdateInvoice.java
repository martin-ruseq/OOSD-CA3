package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			30/12/2021

public class UpdateInvoice
{
	public static void main(String [] args)
	{
		final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
		Connection connection = null;
		PreparedStatement prepstat = null;
		int customerID = 1;
		String orderStatus = "Paid";
		String paymentType = "Card";
		int quantity = 1;
		double totalPrice = 399.99;
		int i = 0;
		
		try
		{
			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("UPDATE invoice SET OrderStatus=?, PaymentType=?, Quantity=?, TotalPrice=? WHERE CustomerID=?");
			
			prepstat.setString(1, orderStatus);
			prepstat.setString(2, paymentType);
			prepstat.setInt(3, quantity);
			prepstat.setDouble(4, totalPrice);
			prepstat.setInt(5, customerID);

			
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
