package gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022 

/**
 * This class creats the panel for the user dashboard that allows the user to edith his account details.
 * @author Marcin Rusiecki
 * @version 1.0
 */
public class SettingsPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JTextField textFieldFname;
	private JTextField textFieldLName;
	private JTextField textFieldDoB;
	private JTextField textFieldPhone;
	private JTextField textFieldZipCode;
	private JTextField textFieldCountry;
	private JTextField textFieldStreet;
	private JTextField textFieldTown;
	private JPasswordField password;
	private JPasswordField passwordConfirm;
	
	/**
	 * Builds the panel with editable user details used in User Dashboard.
	 * @param email address that has been used by the user to log in to the account. 
	 */
	public SettingsPanel(String email)
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		Panel panelDetails = new Panel();
		panelDetails.setLayout(null);
		panelDetails.setName("");
		panelDetails.setBounds(10, 46, 605, 437);
		add(panelDetails);
		
		textFieldFname = new JTextField();
		textFieldFname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldFname.setColumns(10);
		textFieldFname.setBounds(100, 28, 190, 30);
		panelDetails.add(textFieldFname);
		
		JLabel lblFname = new JLabel("First Name");
		lblFname.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFname.setBounds(100, 0, 103, 30);
		panelDetails.add(lblFname);
		
		JLabel lblLname = new JLabel("Last Name");
		lblLname.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLname.setBounds(310, 0, 103, 30);
		panelDetails.add(lblLname);
		
		textFieldLName = new JTextField();
		textFieldLName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldLName.setColumns(10);
		textFieldLName.setBounds(310, 28, 190, 30);
		panelDetails.add(textFieldLName);
		
		textFieldDoB = new JTextField();
		textFieldDoB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldDoB.setColumns(10);
		textFieldDoB.setBounds(100, 95, 190, 30);
		panelDetails.add(textFieldDoB);
		
		JLabel lblDoB = new JLabel("Date of Birth");
		lblDoB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDoB.setBounds(100, 68, 121, 30);
		panelDetails.add(lblDoB);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhone.setBounds(310, 68, 103, 30);
		panelDetails.add(lblPhone);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(310, 95, 190, 30);
		panelDetails.add(textFieldPhone);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(100, 135, 400, 2);
		panelDetails.add(separator);
		
		JLabel lblTown = new JLabel("Town");
		lblTown.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTown.setBounds(310, 147, 103, 30);
		panelDetails.add(lblTown);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStreet.setBounds(100, 147, 103, 30);
		panelDetails.add(lblStreet);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblZipCode.setBounds(100, 214, 121, 30);
		panelDetails.add(lblZipCode);
		
		textFieldZipCode = new JTextField();
		textFieldZipCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldZipCode.setColumns(10);
		textFieldZipCode.setBounds(100, 242, 190, 30);
		panelDetails.add(textFieldZipCode);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCountry.setBounds(310, 214, 103, 30);
		panelDetails.add(lblCountry);
		
		textFieldCountry = new JTextField();
		textFieldCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldCountry.setColumns(10);
		textFieldCountry.setBounds(310, 242, 190, 30);
		panelDetails.add(textFieldCountry);
		
		textFieldStreet = new JTextField();
		textFieldStreet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldStreet.setColumns(10);
		textFieldStreet.setBounds(100, 174, 190, 30);
		panelDetails.add(textFieldStreet);
		
		textFieldTown = new JTextField();
		textFieldTown.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldTown.setColumns(10);
		textFieldTown.setBounds(310, 174, 190, 30);
		panelDetails.add(textFieldTown);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(100, 282, 400, 2);
		panelDetails.add(separator_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(100, 294, 121, 30);
		panelDetails.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConfirmPassword.setBounds(310, 294, 190, 30);
		panelDetails.add(lblConfirmPassword);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setBounds(100, 321, 190, 30);
		panelDetails.add(password);
		
		passwordConfirm = new JPasswordField();
		passwordConfirm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordConfirm.setBounds(310, 321, 190, 30);
		panelDetails.add(passwordConfirm);
		
		JButton btnUpdateDetails = new JButton("UPDATE");
		btnUpdateDetails.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				try
				{
					final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
					Connection connection = null ;
					PreparedStatement prepstat = null ;
					String name = textFieldFname.getText();
					String lname = textFieldLName.getText();
					String dob = textFieldDoB.getText();
					String phone = textFieldPhone.getText(); 
					String street = textFieldStreet.getText();
					String town = textFieldTown.getText();
					String zipcode = textFieldZipCode.getText();
					String country = textFieldCountry.getText();
					@SuppressWarnings("deprecation")
					String Userpassword = password.getText();
					@SuppressWarnings("deprecation")
					String confpassword = passwordConfirm.getText();
					
					int i = 0;
					
					connection = DriverManager.getConnection(DATABASE_URL, "root", "");
					
					if ( Userpassword.compareTo(confpassword) !=0 )
					{
						throw new PasswordException();
					}
					// create Prepared Statement for inserting data into table
					prepstat = connection.prepareStatement("UPDATE customer SET FirstName=?, LastName=?, Street=?, Town=?, ZipCode=?, Country=?, Phone=?, DateOfBirth=?, Password=? WHERE Email=?");
					prepstat.setString(1, name);
					prepstat.setString(2, lname);
					prepstat.setString(3, street);
					prepstat.setString(4, town);
					prepstat.setString(5, zipcode);
					prepstat.setString(6, country);
					prepstat.setString(7, phone);
					prepstat.setString(8, dob);
					prepstat.setString(9, Userpassword);
					prepstat.setString(10, email);
					
					i=prepstat.executeUpdate();
					
					if (i != 1 )
					{
						JOptionPane.showMessageDialog(null, "Details have not been updated", "INFO", JOptionPane.ERROR_MESSAGE);
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Details have been successfully updated", "INFO", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				catch(PasswordException h)
				{
					JOptionPane.showMessageDialog(null, "Passwords must match!");
				}
				catch (SQLException sqlException)
				{
					sqlException.printStackTrace();
				}
			}
		});
		btnUpdateDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUpdateDetails.setBounds(201, 386, 190, 40);
		panelDetails.add(btnUpdateDetails);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(100, 361, 400, 2);
		panelDetails.add(separator_1_1);
		
		JLabel lblSettings = new JLabel("SETTINGS");
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setForeground(new Color(224, 255, 255));
		lblSettings.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSettings.setBounds(10, 0, 605, 40);
		add(lblSettings);
		
		try 
		{
			final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
			Connection connection = null ;
			ResultSet resultset = null;
			PreparedStatement prepstat = null ;
			String name = "";
			String lname = "";
			String dob = "";
			String phone = ""; 
			String street = "";
			String town = "";
			String zipcode = "";
			String country = "";
			String Userpassword = "";
			
			
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("SELECT * FROM customer WHERE Email=?");
			prepstat.setString(1, email);
			
			resultset = prepstat.executeQuery();
			
			while(resultset.next()) 
			{
				name = resultset.getString(2);
				lname = resultset.getString(3);
				street = resultset.getString(4);
				town = resultset.getString(5);
				zipcode = resultset.getString(6);
				country = resultset.getString(7);
				phone = resultset.getString(9);
				dob = resultset.getString(10);
				Userpassword = resultset.getString(11);

			}

			textFieldFname.setText(name);
			textFieldLName.setText(lname);
			textFieldStreet.setText(street);
			textFieldTown.setText(town);
			textFieldZipCode.setText(zipcode);
			textFieldCountry.setText(country);
			textFieldPhone.setText(phone);
			textFieldDoB.setText(dob);
			password.setText(Userpassword);
			passwordConfirm.setText(Userpassword);
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
}
