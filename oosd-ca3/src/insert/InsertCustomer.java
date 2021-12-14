package insert;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			14/12/2021

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class InsertCustomer
{
	public static void main(String [] args)
	{
		final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
		Connection connection = null ;
		PreparedStatement pstat = null ;
		String firstname = "Mark";
		String lastname = "Power";
		String address = "Irish Street 6, Bunclody,Co.Wexford";
		String phone = "+353-87-321-1085";
		String dob = "1973-03-11";
		int i = 0;
		
		Date date = Date.valueOf(dob);
		
		try
		{
			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			pstat = connection.prepareStatement("INSERT INTO Customer (FirstName, LastName, Address, PhoneNo, DateOfBirth)VALUES (?,?,?,?,?)");
			
			pstat.setString(1, firstname);
			pstat.setString(2, lastname);
			pstat.setString(3, address);
			pstat.setString(4, phone);
			pstat.setDate(5, date);
			
			// insert data into table
			i = pstat .executeUpdate();
			System.out. println ( i + " record successfully added to the table .");
		}
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
		finally
		{
			try
			{
				pstat.close();
				connection.close();
			}
			catch (Exception exception)
			{
				exception.printStackTrace();
			}
		}
	}
}
