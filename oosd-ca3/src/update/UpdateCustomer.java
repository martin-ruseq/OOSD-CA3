package update;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			30/12/2021

public class UpdateCustomer
{
	public static void main(String [] args)
	{
		final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
		Connection connection = null ;
		PreparedStatement prepstat = null ;
		String phone = "+353-87-542-5342";
		String dob = "1994-10-11";
		int i = 0;
		
		Date date = Date.valueOf(dob);
		
		try
		{
			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("UPDATE customer SET DateOfBirth=? WHERE Phone=?");
			prepstat.setDate(1, date);
			prepstat.setString(2, phone);
			
			
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

