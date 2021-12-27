package insert;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			14/12/2021

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class InsertInvoice
{
	public static void main(String [] args)
	{
		final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
		Connection connection = null ;
		PreparedStatement prepstat = null ;
		String orderStatus = "Paid";
		String paymentType = "Card";
		double totalPrice = 432.21;
		String dateOfOrder = "2021-12-11";
		int i = 0;
		
		Date orderDate = Date.valueOf(dateOfOrder);
		
		try
		{
			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("INSERT INTO invoice (OrderStatus, PaymentType, TotalPrice, OrderDate)VALUES (?,?,?,?)");
			
			prepstat.setString(1, orderStatus);
			prepstat.setString(2, paymentType);
			prepstat.setDouble(3, totalPrice);
			prepstat.setDate(4, orderDate);
			
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