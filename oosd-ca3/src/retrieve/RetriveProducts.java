package retrieve;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			30/12/2021

import java . sql .Connection;
import java . sql .DriverManager;
import java . sql .PreparedStatement;
import java . sql . ResultSet ;
import java . sql .ResultSetMetaData;
import java . sql .SQLException;

public class RetriveProducts
{
	public static void main(String args [])
	{
		// database URL
		final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
		Connection connection = null;
		PreparedStatement prepstat= null;
		ResultSet resultSet = null;
		
		try
		{
			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
						
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("SELECT ProductID, ProductName, ProductPrice, ProductStock FROM product");
			
			//query data in the table
			resultSet = prepstat.executeQuery();
			
			//process query resuls
			ResultSetMetaData metaData = resultSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			System.out. println ("Customer Table of oosd_ca3 Database:\n");
			
			for(int i = 1; i <= numberOfColumns; i++)
			System.out.print (metaData.getColumnName(i) + "\t");
			System.out.println("");
			
			while(resultSet.next())
			{
				for(int i = 1; i <= numberOfColumns; i++)
				System.out. print (resultSet.getObject(i) + "\t\t");
				System.out. println();
			}
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
