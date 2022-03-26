package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022 

/**
 * This class creats the panel for the user dashboard that contains user account information.
 * @author Marcin Rusiecki
 * @version 1.0
 */
public class MyAccPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JTextField textFieldFName;
	private JTextField textFieldLName;
	private JTextField textFieldId;
	private JTextField textFieldDoB;
	private JTextField textFieldPhone;
	private JTextField textFieldMail;
	private JTextField textFieldZipCode;
	private JTextField textFieldCountry;
	private JTextField textFieldStreet;
	private JTextField textFieldTown;

	/**
	 * Builds the panel with non editable user details used in User Dashboard.
	 * @param email address that has been used by the user to log in to the account. 
	 */
	public MyAccPanel(String email)
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		JLabel lblMyAccount = new JLabel("MY ACCOUNT");
		lblMyAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyAccount.setForeground(new Color(224, 255, 255));
		lblMyAccount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMyAccount.setBounds(10, 0, 605, 40);
		add(lblMyAccount);
		
		Panel panelDetails = new Panel();
		panelDetails.setLayout(null);
		panelDetails.setName("");
		panelDetails.setBounds(10, 46, 605, 437);
		add(panelDetails);
		
		textFieldFName = new JTextField();
		textFieldFName.setEditable(false);
		textFieldFName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldFName.setBounds(10, 39, 190, 30);
		panelDetails.add(textFieldFName);
		textFieldFName.setColumns(10);
		
		JLabel lblFname = new JLabel("First Name");
		lblFname.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFname.setBounds(10, 10, 103, 30);
		panelDetails.add(lblFname);
		
		JLabel lblLname = new JLabel("Last Name");
		lblLname.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLname.setBounds(210, 10, 103, 30);
		panelDetails.add(lblLname);
		
		textFieldLName = new JTextField();
		textFieldLName.setEditable(false);
		textFieldLName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldLName.setColumns(10);
		textFieldLName.setBounds(207, 39, 190, 30);
		panelDetails.add(textFieldLName);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBounds(407, 10, 88, 30);
		panelDetails.add(lblId);
		
		textFieldId = new JTextField();
		textFieldId.setEditable(false);
		textFieldId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldId.setColumns(10);
		textFieldId.setBounds(407, 39, 85, 30);
		panelDetails.add(textFieldId);
		
		textFieldDoB = new JTextField();
		textFieldDoB.setEditable(false);
		textFieldDoB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldDoB.setColumns(10);
		textFieldDoB.setBounds(10, 108, 190, 30);
		panelDetails.add(textFieldDoB);
		
		JLabel lblDoB = new JLabel("Date of Birth");
		lblDoB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDoB.setBounds(10, 79, 121, 30);
		panelDetails.add(lblDoB);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhone.setBounds(210, 79, 103, 30);
		panelDetails.add(lblPhone);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setEditable(false);
		textFieldPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(207, 108, 190, 30);
		panelDetails.add(textFieldPhone);
		
		textFieldMail = new JTextField();
		textFieldMail.setEditable(false);
		textFieldMail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldMail.setColumns(10);
		textFieldMail.setBounds(405, 108, 190, 30);
		panelDetails.add(textFieldMail);
		
		JLabel lblmail = new JLabel("Email");
		lblmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblmail.setBounds(409, 79, 103, 30);
		panelDetails.add(lblmail);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 148, 585, 2);
		panelDetails.add(separator);
		
		JLabel lblTown = new JLabel("Town");
		lblTown.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTown.setBounds(210, 160, 103, 30);
		panelDetails.add(lblTown);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStreet.setBounds(10, 160, 103, 30);
		panelDetails.add(lblStreet);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblZipCode.setBounds(10, 229, 121, 30);
		panelDetails.add(lblZipCode);
		
		textFieldZipCode = new JTextField();
		textFieldZipCode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldZipCode.setEditable(false);
		textFieldZipCode.setColumns(10);
		textFieldZipCode.setBounds(10, 258, 190, 30);
		panelDetails.add(textFieldZipCode);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCountry.setBounds(210, 229, 103, 30);
		panelDetails.add(lblCountry);
		
		textFieldCountry = new JTextField();
		textFieldCountry.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCountry.setEditable(false);
		textFieldCountry.setColumns(10);
		textFieldCountry.setBounds(207, 258, 190, 30);
		panelDetails.add(textFieldCountry);
		
		textFieldStreet = new JTextField();
		textFieldStreet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldStreet.setEditable(false);
		textFieldStreet.setColumns(10);
		textFieldStreet.setBounds(10, 189, 190, 30);
		panelDetails.add(textFieldStreet);
		
		textFieldTown = new JTextField();
		textFieldTown.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldTown.setEditable(false);
		textFieldTown.setColumns(10);
		textFieldTown.setBounds(207, 189, 190, 30);
		panelDetails.add(textFieldTown);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 298, 585, 2);
		panelDetails.add(separator_1);
		
		JButton btnDeleteAccount = new JButton("DELETE ACCOUNT");
		btnDeleteAccount.addMouseListener(new MouseAdapter() 
		{
			@Override
			/**
			 * Displays warning message with confirmation to delete account from the database.
			 */
			public void mouseClicked(MouseEvent e) 
			{
				try
				{
					JOptionPane deleteAcc = new JOptionPane();
					@SuppressWarnings("static-access")
					int result = deleteAcc.showConfirmDialog(null, "Do you want to DELETE your account?", "WARNING!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					
					if (result == 0)
					{
						final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
						Connection connection = null ;
						int i = 0;
						PreparedStatement prepstat = null ;
						
						connection = DriverManager.getConnection(DATABASE_URL, "root", "");
						
						// create Prepared Statement for inserting data into table
						prepstat = connection.prepareStatement("DELETE FROM customer WHERE Email=?");
						prepstat.setString(1, email);
						
						i = prepstat.executeUpdate();
						if ( i != 0)
						{
							System.exit(i);
						}
					}

				}
				catch (SQLException sqlException)
				{
					sqlException.printStackTrace();
				}
			}
		});
		btnDeleteAccount.setBackground(Color.RED);
		btnDeleteAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDeleteAccount.setBounds(10, 317, 190, 40);
		panelDetails.add(btnDeleteAccount);
		
		try 
		{
			final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
			Connection connection = null ;
			ResultSet resultset = null;
			PreparedStatement prepstat = null ;
			String name = "";
			String lname = "";
			int id = 0;
			String dob = "";
			String phone = ""; 
			String street = "";
			String town = "";
			String zipcode = "";
			String country = "";
			
			
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");
			
			// create Prepared Statement for inserting data into table
			prepstat = connection.prepareStatement("SELECT * FROM customer WHERE Email=?");
			prepstat.setString(1, email);
			
			resultset = prepstat.executeQuery();
			
			while(resultset.next()) 
			{
				id = resultset.getInt(1);
				name = resultset.getString(2);
				lname = resultset.getString(3);
				street = resultset.getString(4);
				town = resultset.getString(5);
				zipcode = resultset.getString(6);
				country = resultset.getString(7);
				phone = resultset.getString(9);
				dob = resultset.getString(10);

			}
			textFieldId.setText("" + id);
			textFieldFName.setText(name);
			textFieldLName.setText(lname);
			textFieldStreet.setText(street);
			textFieldTown.setText(town);
			textFieldZipCode.setText(zipcode);
			textFieldCountry.setText(country);
			textFieldPhone.setText(phone);
			textFieldDoB.setText(dob);
			textFieldMail.setText(email);
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
}
