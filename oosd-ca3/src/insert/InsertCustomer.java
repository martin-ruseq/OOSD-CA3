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
		PreparedStatement prepstat = null ;
		String firstname = "Mark";
		String lastname = "Power";
		String street = "Irish Street 6";
		String city = "Carlow";
		String zcode = "R93 GH89";
		String country = "Ireland";
		String email = "markpower123@gmail.com";
		String phone = "+353-87-321-1085";
		String dob = "1973-03-11";
		int i = 0;
		
		Date date = Date.valueOf(dob);
		
		try
		{
			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("INSERT INTO Customer (FirstName, LastName, Street, City, ZipCode, Country, Email, Phone, DateOfBirth)VALUES (?,?,?,?,?,?,?,?,?)");
			
			prepstat.setString(1, firstname);
			prepstat.setString(2, lastname);
			prepstat.setString(3, street);
			prepstat.setString(4, city);
			prepstat.setString(5, zcode);
			prepstat.setString(6, country);
			prepstat.setString(7, email);
			prepstat.setString(8, phone);
			prepstat.setDate(9, date);
			
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