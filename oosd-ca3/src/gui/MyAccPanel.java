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
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtId;
	private JTextField txtDoB;
	private JTextField txtPhone;
	private JTextField txtMail;
	private JTextField txtZipCode;
	private JTextField txtCountry;
	private JTextField txtStreet;
	private JTextField txtTown;

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
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFirstName.setBounds(10, 10, 103, 30);
		panelDetails.add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setEditable(false);
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFirstName.setBounds(10, 39, 190, 30);
		panelDetails.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLastName.setBounds(210, 10, 103, 30);
		panelDetails.add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setEditable(false);
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLastName.setColumns(10);
		txtLastName.setBounds(207, 39, 190, 30);
		panelDetails.add(txtLastName);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBounds(407, 10, 88, 30);
		panelDetails.add(lblId);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtId.setColumns(10);
		txtId.setBounds(407, 39, 85, 30);
		panelDetails.add(txtId);
		
		JLabel lblDoB = new JLabel("Date of Birth");
		lblDoB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDoB.setBounds(10, 79, 121, 30);
		panelDetails.add(lblDoB);
		
		txtDoB = new JTextField();
		txtDoB.setEditable(false);
		txtDoB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDoB.setColumns(10);
		txtDoB.setBounds(10, 108, 190, 30);
		panelDetails.add(txtDoB);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhone.setBounds(210, 79, 103, 30);
		panelDetails.add(lblPhone);
		
		txtPhone = new JTextField();
		txtPhone.setEditable(false);
		txtPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPhone.setColumns(10);
		txtPhone.setBounds(207, 108, 190, 30);
		panelDetails.add(txtPhone);
		
		JLabel lblMail = new JLabel("Email");
		lblMail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMail.setBounds(409, 79, 103, 30);
		panelDetails.add(lblMail);
		
		txtMail = new JTextField();
		txtMail.setEditable(false);
		txtMail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMail.setColumns(10);
		txtMail.setBounds(405, 108, 190, 30);
		panelDetails.add(txtMail);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 148, 585, 2);
		panelDetails.add(separator);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStreet.setBounds(10, 160, 103, 30);
		panelDetails.add(lblStreet);
		
		txtStreet = new JTextField();
		txtStreet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtStreet.setEditable(false);
		txtStreet.setColumns(10);
		txtStreet.setBounds(10, 189, 190, 30);
		panelDetails.add(txtStreet);
		
		JLabel lblTown = new JLabel("Town");
		lblTown.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTown.setBounds(210, 160, 103, 30);
		panelDetails.add(lblTown);
		
		txtTown = new JTextField();
		txtTown.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTown.setEditable(false);
		txtTown.setColumns(10);
		txtTown.setBounds(207, 189, 190, 30);
		panelDetails.add(txtTown);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblZipCode.setBounds(10, 229, 121, 30);
		panelDetails.add(lblZipCode);
		
		txtZipCode = new JTextField();
		txtZipCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtZipCode.setEditable(false);
		txtZipCode.setColumns(10);
		txtZipCode.setBounds(10, 258, 190, 30);
		panelDetails.add(txtZipCode);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCountry.setBounds(210, 229, 103, 30);
		panelDetails.add(lblCountry);
		
		txtCountry = new JTextField();
		txtCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCountry.setEditable(false);
		txtCountry.setColumns(10);
		txtCountry.setBounds(207, 258, 190, 30);
		panelDetails.add(txtCountry);
		
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
						if (i != 0)
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
			txtId.setText("" + id);
			txtFirstName.setText(name);
			txtLastName.setText(lname);
			txtStreet.setText(street);
			txtTown.setText(town);
			txtZipCode.setText(zipcode);
			txtCountry.setText(country);
			txtPhone.setText(phone);
			txtDoB.setText(dob);
			txtMail.setText(email);
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
}