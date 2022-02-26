package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

//Name:					Julia Lodygowska
//Student ID:			C00263203
//Date:					26.01.2022

public class ViewAccount extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstnamefield;
	private JTextField surnamefield;
	private JTextField addressfield;
	private JTextField phonefield;
	private JTextField emailfield;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					ViewAccount frame = new ViewAccount("");
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
}

/**
 * Create the frame.
 */
public ViewAccount(String passEmail) 
{
	final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
	Connection connection = null;
	ResultSet resultSet = null;
	String fName = "";
	String sName = "";
	String address = "";
	int phone = 0;
	String email = "";
	String password = "";
	
	try
	{
		// establish connection to database
		connection = DriverManager.getConnection(DATABASE_URL, "root", "" );
		// create Prepared Statement for deleting data from the table
		
		PreparedStatement pstat1 = connection.prepareStatement("SELECT FirstName FROM customer WHERE Email=?" );
		pstat1.setString(1, passEmail);
		
		resultSet = pstat1.executeQuery();
		
		while(resultSet.next())
		{
			fName = resultSet.getString(1);
		}
		pstat1.close();
		resultSet.close();
		
		PreparedStatement pstat2 = connection.prepareStatement("SELECT Surname FROM customer WHERE Email=?" );
		pstat2.setString(1, passEmail);
		
		resultSet = pstat2.executeQuery();
		
		while(resultSet.next())
		{
			sName = resultSet.getString(1);
		}
		pstat2.close();
		resultSet.close();
		
		PreparedStatement pstat3 = connection.prepareStatement("SELECT Address FROM customer WHERE Email=?" );
		pstat3.setString(1, passEmail);
		
		resultSet = pstat3.executeQuery();
		
		while(resultSet.next())
		{
			address = resultSet.getString(1);
		}
		pstat3.close();
		resultSet.close();
		
		PreparedStatement pstat4 = connection.prepareStatement("SELECT Phone FROM customer WHERE Email=?" );
		pstat4.setString(1, passEmail);
		
		resultSet = pstat4.executeQuery();
		
		while(resultSet.next())
		{
			phone = resultSet.getInt(1);
		}
		pstat4.close();
		resultSet.close();
		
		PreparedStatement pstat5 = connection.prepareStatement("SELECT Email FROM customer WHERE Email=?" );
		pstat5.setString(1, passEmail);
		
		resultSet = pstat5.executeQuery();
		
		while(resultSet.next())
		{
			email = resultSet.getString(1);
		}
		pstat5.close();
		resultSet.close();
		
		PreparedStatement pstat6 = connection.prepareStatement("SELECT Password FROM customer WHERE Email=?" );
		pstat6.setString(1, passEmail);
		
		resultSet = pstat6.executeQuery();
		
		while(resultSet.next())
		{
			password = resultSet.getString(1);
		}
		pstat6.close();
		resultSet.close();
		
	}
		
		catch(SQLException sqlException ) 
		{
			sqlException . printStackTrace () ;
		}
			finally 
			{
				try
				{
					resultSet . close () ;
					connection . close () ;
				}
				catch (Exception exception){
				exception . printStackTrace () ;
			}
		
	
	setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp.class.getResource("/Images/logo2.PNG")));
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 881, 368);
	contentPane = new JPanel();
	contentPane.setBackground(Color.WHITE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JPanel logoPanel = new JPanel();
	logoPanel.setLayout(null);
	logoPanel.setBackground(Color.WHITE);
	logoPanel.setBounds(10, 10, 286, 385);
	contentPane.add(logoPanel);
	
	JLabel lblNewLabel = new JLabel("New label");
	lblNewLabel.setIcon(new ImageIcon(SignUp.class.getResource("/Images/logo2.PNG")));
	lblNewLabel.setBounds(-32, 10, 308, 299);
	logoPanel.add(lblNewLabel);
	
	JPanel newAccountDetails = new JPanel();
	newAccountDetails.setBackground(new Color(102, 153, 204));
	newAccountDetails.setBounds(306, 10, 551, 397);
	contentPane.add(newAccountDetails);
	newAccountDetails.setLayout(null);
	
	JLabel createNewAccount = new JLabel("My Account");
	createNewAccount.setHorizontalAlignment(SwingConstants.CENTER);
	createNewAccount.setFont(new Font("Times New Roman", Font.BOLD, 25));
	createNewAccount.setBounds(10, -11, 531, 67);
	newAccountDetails.add(createNewAccount);
	
	JLabel firstname = new JLabel("First Name:");
	firstname.setFont(new Font("Times New Roman", Font.BOLD, 20));
	firstname.setBounds(37, 50, 119, 35);
	newAccountDetails.add(firstname);
	
	JLabel surname = new JLabel("Surname:");
	surname.setFont(new Font("Times New Roman", Font.BOLD, 20));
	surname.setBounds(37, 106, 119, 35);
	newAccountDetails.add(surname);
	
	JLabel addressLabel = new JLabel("Address:");
	addressLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
	addressLabel.setBounds(37, 162, 112, 35);
	newAccountDetails.add(addressLabel);
	
	JLabel phonenumber = new JLabel("Phone Number:");
	phonenumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
	phonenumber.setBounds(309, 54, 145, 26);
	newAccountDetails.add(phonenumber);
	
	JLabel emailLabel = new JLabel("Email:");
	emailLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
	emailLabel.setBounds(309, 106, 119, 35);
	newAccountDetails.add(emailLabel);
	
	firstnamefield = new JTextField();
	firstnamefield.setFont(new Font("Times New Roman", Font.PLAIN, 19));
	firstnamefield.setBounds(36, 77, 214, 26);
	newAccountDetails.add(firstnamefield);
	firstnamefield.setColumns(10);
	firstnamefield.setText("" + fName);
	
	surnamefield = new JTextField();
	surnamefield.setFont(new Font("Times New Roman", Font.PLAIN, 19));
	surnamefield.setColumns(10);
	surnamefield.setBounds(37, 132, 213, 26);
	newAccountDetails.add(surnamefield);
	surnamefield.setText("" + sName);
	
	addressfield = new JTextField();
	addressfield.setFont(new Font("Times New Roman", Font.PLAIN, 19));
	addressfield.setColumns(10);
	addressfield.setBounds(37, 189, 213, 26);
	newAccountDetails.add(addressfield);
	addressfield.setText("" + address);
	
	phonefield = new JTextField();
	phonefield.setFont(new Font("Times New Roman", Font.PLAIN, 19));
	phonefield.setColumns(10);
	phonefield.setBounds(309, 77, 214, 26);
	newAccountDetails.add(phonefield);
	phonefield.setText("" + phone);
	
	emailfield = new JTextField();
	emailfield.setFont(new Font("Times New Roman", Font.PLAIN, 19));
	emailfield.setColumns(10);
	emailfield.setBounds(309, 132, 213, 26);
	newAccountDetails.add(emailfield);
	emailfield.setText("" + email);
	
	JLabel passwordLabel = new JLabel("Password:");
	passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
	passwordLabel.setBounds(309, 162, 119, 35);
	newAccountDetails.add(passwordLabel);
	
	passwordField = new JPasswordField();
	passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 19));
	passwordField.setBounds(309, 189, 214, 26);
	newAccountDetails.add(passwordField);
	passwordField.setText("" + password);
}
}
}
