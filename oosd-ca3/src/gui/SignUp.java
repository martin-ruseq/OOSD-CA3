package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			18/01/2022 

/**
 * This class creates the signup form window allowing the user to create an account in the database.
 * @author Marcin Rusiecki
 * @version 1.0
 */
public class SignUp extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtDoB;
	private JTextField txtLastName;
	private JTextField txtPhone;
	private JTextField txtStreet;
	private JTextField txtTown;
	private JTextField txtEmail;
	private JTextField txtEmailConf;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirmPass;
	private JTextField txtZipCode;
	private JTextField txtCountry;

	/**
	 * Runs the Sign Up application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					SignUp frame = new SignUp();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/** 
	 * Builds the Sign Up window.
	 */
	public SignUp()
	{
		setLocation(new Point(550, 50));
		setResizable(false);
		setName("SignUp");
		setTitle("Creating Account");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp.class.getResource("/resources/icon.png")));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 451, 630);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pDetailsPanel = new JPanel();
		pDetailsPanel.setFont(new Font("Tahoma", Font.BOLD, 12));
		pDetailsPanel.setBackground(Color.LIGHT_GRAY);
		pDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "PERSONAL DETAILS", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		pDetailsPanel.setBounds(10, 10, 417, 170);
		contentPane.add(pDetailsPanel);
		pDetailsPanel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("FIRST NAME *");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName.setBounds(32, 27, 130, 20);
		pDetailsPanel.add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setCaretColor(new Color(0, 102, 255));
		txtFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setToolTipText("Enter your first name");
		lblFirstName.setLabelFor(txtFirstName);
		txtFirstName.setBounds(32, 50, 150, 25);
		pDetailsPanel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("LAST NAME *");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setBounds(234, 27, 130, 20);
		pDetailsPanel.add(lblLastName);
		lblLastName.setLabelFor(txtLastName);
		
		txtLastName = new JTextField();
		txtLastName.setCaretColor(new Color(0, 102, 255));
		txtLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtLastName.setBackground(Color.WHITE);
		txtLastName.setToolTipText("Enter your last name");
		txtLastName.setColumns(10);
		txtLastName.setBounds(234, 50, 150, 25);
		pDetailsPanel.add(txtLastName);
		
		JLabel lblDoB = new JLabel("DATE OF BIRTH*");
		lblDoB.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDoB.setBounds(32, 85, 130, 20);
		pDetailsPanel.add(lblDoB);
		
		txtDoB = new JTextField();
		txtDoB.setCaretColor(new Color(0, 102, 255));
		txtDoB.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtDoB.setToolTipText("Enter your date of birth\r\n");
		lblDoB.setLabelFor(txtDoB);
		txtDoB.setColumns(10);
		txtDoB.setBounds(32, 108, 150, 25);
		pDetailsPanel.add(txtDoB);
		
		JLabel lblPhone = new JLabel("PHONE *");
		lblPhone.setLabelFor(txtPhone);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhone.setBounds(234, 85, 130, 20);
		pDetailsPanel.add(lblPhone);
		
		txtPhone = new JTextField();
		txtPhone.setCaretColor(new Color(0, 102, 255));
		txtPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPhone.setToolTipText("Enter your phone number");
		txtPhone.setColumns(10);
		txtPhone.setBounds(234, 108, 150, 25);
		pDetailsPanel.add(txtPhone);
		
		JLabel warningPesonalPanel = new JLabel("");
		warningPesonalPanel.setHorizontalTextPosition(SwingConstants.CENTER);
		warningPesonalPanel.setHorizontalAlignment(SwingConstants.CENTER);
		warningPesonalPanel.setForeground(Color.RED);
		warningPesonalPanel.setFont(new Font("Tahoma", Font.BOLD, 12));
		warningPesonalPanel.setBounds(63, 143, 290, 25);
		pDetailsPanel.add(warningPesonalPanel);
		
		JPanel aDetailsPanel = new JPanel();
		aDetailsPanel.setFont(new Font("Tahoma", Font.BOLD, 12));
		aDetailsPanel.setBackground(Color.LIGHT_GRAY);
		aDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ADDRESS DETAILS", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		aDetailsPanel.setBounds(10, 190, 417, 170);
		contentPane.add(aDetailsPanel);
		aDetailsPanel.setLayout(null);
		
		JLabel lblStreet = new JLabel("STREET *");
		lblStreet.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStreet.setBounds(32, 27, 130, 20);
		aDetailsPanel.add(lblStreet);
		
		txtStreet = new JTextField();
		txtStreet.setCaretColor(new Color(0, 102, 255));
		txtStreet.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtStreet.setToolTipText("Enter your street and house number");
		lblStreet.setLabelFor(txtStreet);
		txtStreet.setColumns(10);
		txtStreet.setBounds(32, 50, 150, 25);
		aDetailsPanel.add(txtStreet);
		
		JLabel lblTown = new JLabel("TOWN *");
		lblTown.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTown.setBounds(234, 27, 130, 20);
		aDetailsPanel.add(lblTown);
		lblTown.setLabelFor(txtTown);
		
		txtTown = new JTextField();
		txtTown.setCaretColor(new Color(0, 102, 255));
		txtTown.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtTown.setToolTipText("Enter your town");
		txtTown.setColumns(10);
		txtTown.setBounds(234, 50, 150, 25);
		aDetailsPanel.add(txtTown);
		
		JLabel lblZipCode = new JLabel("ZIP CODE *");
		lblZipCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblZipCode.setBounds(32, 85, 130, 20);
		aDetailsPanel.add(lblZipCode);
		
		txtZipCode = new JTextField();
		txtZipCode.setToolTipText("Enter your street and house number");
		txtZipCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtZipCode.setColumns(10);
		txtZipCode.setCaretColor(new Color(0, 102, 255));
		txtZipCode.setBounds(32, 110, 150, 25);
		aDetailsPanel.add(txtZipCode);
		
		JLabel lblCountry = new JLabel("COUNTRY *");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCountry.setBounds(234, 85, 130, 20);
		aDetailsPanel.add(lblCountry);
		
		txtCountry = new JTextField();
		txtCountry.setToolTipText("Enter your street and house number");
		txtCountry.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCountry.setColumns(10);
		txtCountry.setCaretColor(new Color(0, 102, 255));
		txtCountry.setBounds(234, 110, 150, 25);
		aDetailsPanel.add(txtCountry);
		
		JLabel warningAddressPanel = new JLabel("");
		warningAddressPanel.setHorizontalTextPosition(SwingConstants.CENTER);
		warningAddressPanel.setHorizontalAlignment(SwingConstants.CENTER);
		warningAddressPanel.setForeground(Color.RED);
		warningAddressPanel.setFont(new Font("Tahoma", Font.BOLD, 12));
		warningAddressPanel.setBounds(63, 145, 290, 25);
		aDetailsPanel.add(warningAddressPanel);
		
		JPanel lDetailsPanel = new JPanel();
		lDetailsPanel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lDetailsPanel.setBackground(Color.LIGHT_GRAY);
		lDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "LOGIN DETAILS", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		lDetailsPanel.setBounds(10, 370, 417, 170);
		contentPane.add(lDetailsPanel);
		lDetailsPanel.setLayout(null);
		
		JLabel lblEmail = new JLabel("E-MAIL *");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(32, 28, 130, 20);
		lDetailsPanel.add(lblEmail);
		lblEmail.setLabelFor(txtEmail);
		
		txtEmail = new JTextField();
		txtEmail.setCaretColor(new Color(0, 102, 255));
		txtEmail.setSelectedTextColor(SystemColor.activeCaption);
		txtEmail.setSelectionColor(SystemColor.inactiveCaption);
		txtEmail.setToolTipText("Enter your e-mail");
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEmail.setBounds(32, 51, 150, 25);
		lDetailsPanel.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblEmailConf = new JLabel("CONFIRM E-MAIL *");
		lblEmailConf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailConf.setBounds(234, 28, 130, 20);
		lDetailsPanel.add(lblEmailConf);
		lblEmailConf.setLabelFor(txtEmailConf);
		
		txtEmailConf = new JTextField();
		txtEmailConf.setCaretColor(new Color(0, 102, 255));
		txtEmailConf.setToolTipText("Repeat your e-mail");
		txtEmailConf.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEmailConf.setColumns(10);
		txtEmailConf.setBounds(234, 51, 150, 25);
		lDetailsPanel.add(txtEmailConf);
		
		JLabel lblPassword = new JLabel("PASSWORD *");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(33, 86, 130, 20);
		lDetailsPanel.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setEchoChar('*');
		txtPassword.setCaretColor(new Color(0, 102, 255));
		txtPassword.setToolTipText("Enter your password");
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPassword.setBounds(32, 109, 150, 25);
		lDetailsPanel.add(txtPassword);
		
		JLabel lblConfirmPass = new JLabel("CONFIRM PASSWORD *");
		lblConfirmPass.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmPass.setBounds(234, 86, 150, 20);
		lDetailsPanel.add(lblConfirmPass);
		
		txtConfirmPass = new JPasswordField();
		txtConfirmPass.setEchoChar('*');
		txtConfirmPass.setCaretColor(new Color(0, 102, 255));
		txtConfirmPass.setToolTipText("Repeat your password");
		txtConfirmPass.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtConfirmPass.setBounds(234, 109, 150, 25);
		lDetailsPanel.add(txtConfirmPass);
		
		JLabel icoSeePass = new JLabel("");
		icoSeePass.setHorizontalTextPosition(SwingConstants.CENTER);
		icoSeePass.setToolTipText("See Password");
		icoSeePass.setHorizontalAlignment(SwingConstants.CENTER);
		icoSeePass.setIcon(new ImageIcon(SignUp.class.getResource("/resources/show.png")));
		icoSeePass.setBounds(383, 109, 24, 25);
		lDetailsPanel.add(icoSeePass);
		
		JLabel warningLoginPanel = new JLabel("");
		warningLoginPanel.setHorizontalTextPosition(SwingConstants.CENTER);
		warningLoginPanel.setHorizontalAlignment(SwingConstants.CENTER);
		warningLoginPanel.setForeground(Color.RED);
		warningLoginPanel.setFont(new Font("Tahoma", Font.BOLD, 12));
		warningLoginPanel.setBounds(63, 144, 290, 25);
		lDetailsPanel.add(warningLoginPanel);
		
		icoSeePass.addMouseListener(new MouseAdapter() 
		{
			/**
			 * Show password when the mouse cursor enters the "eye" icon.
			 */
			public void mouseEntered(MouseEvent e) 
			{
				txtPassword.setEchoChar((char)0);
				txtConfirmPass.setEchoChar((char)0);
				
			}
			/**
			 * Hide password when the mouse cursor exits the "eye" icon.
			 */
			public void mouseExited(MouseEvent e) 
			{
				txtPassword.setEchoChar('*');
				txtConfirmPass.setEchoChar('*');
			}
		});
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCreateAccount.addMouseListener(new MouseAdapter() 
		{
			@Override
			/**
			 * Input validation. If correct, connects to the database and passes the information entered by the user.
			 * @param e left mouse button click.
			 */
			public void mouseClicked(MouseEvent e) 
			{
				String fname = txtFirstName.getText();
				String lname = txtLastName.getText();
				String dob = txtDoB.getText();
				String phone = txtPhone.getText();
				String street = txtStreet.getText();
				String town = txtTown.getText();
				String zipcode = txtZipCode.getText();
				String country = txtCountry.getText();
				@SuppressWarnings("deprecation")
				String password = txtPassword.getText();
				@SuppressWarnings("deprecation")
				String cPassword = txtConfirmPass.getText();
				String email = txtEmail.getText();
				String cEmail = txtEmailConf.getText();
				
				//Personel Details Warning
				if((fname.length() == 0) || (lname.length() == 0) || (dob.length() == 0) || (phone.length() == 0))
				{
					warningPesonalPanel.setText("WARNING! Fill out ALL fields!");
				}
				else
				{
					warningPesonalPanel.setText("");
				}
				
				//Address Details Warning
				if ((street.length() == 0) || (town.length() == 0) || (zipcode.length() == 0) || (country.length() == 0))
				{
					warningAddressPanel.setText("WARNING! Fill out ALL fields!");
				}
				else
				{
					warningAddressPanel.setText("");
				}
				
				//Match Passowrd and Email
				if  ((email.compareTo(cEmail) != 0) && (password.compareTo(cPassword) != 0))
				{
					warningLoginPanel.setText("Check your email or passowrd!");
				}
				else if(email.compareTo(cEmail) != 0) 
				{
					warningLoginPanel.setText("Email MUST match!");
				}
				else if(password.compareTo(cPassword) != 0)
				{
					warningLoginPanel.setText("Password MUST mach!");
				}
				else
				{
					warningLoginPanel.setText("");
				}
				
				if ((email.length() == 0) || (cEmail.length() == 0) || (password.length() == 0) || (cPassword.length() == 0))
				{
					warningLoginPanel.setText("WARNING! Fill out all fields");
				}
				else
				{
					warningLoginPanel.setText("");
				}
				
				if ((warningPesonalPanel.getText() == "") && (warningAddressPanel.getText() == "") && (warningLoginPanel.getText() == ""))
				{
					final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
					Connection connection = null ;
					PreparedStatement prepstat = null ;
					int i = 0;
					
					try
					{
						// establish connection to database
						connection = DriverManager.getConnection(DATABASE_URL, "root", "");
						
						// create Prepared Statement for inserting data into table
						prepstat = connection.prepareStatement("INSERT INTO customer (FirstName, LastName, Street, Town, ZipCode, Country, Email, Phone, DateOfBirth, Password)VALUES (?,?,?,?,?,?,?,?,?,?)");
						
						prepstat.setString(1, fname);
						prepstat.setString(2, lname);
						prepstat.setString(3, street);
						prepstat.setString(4, town);
						prepstat.setString(5, zipcode);
						prepstat.setString(6, country);
						prepstat.setString(7, email);
						prepstat.setString(8, phone);
						prepstat.setString(9, dob);
						prepstat.setString(10, password);
						
						// insert data into table
						i = prepstat.executeUpdate();
						if (i == 1)
						{
					           JOptionPane.showMessageDialog(null, "Account created succesfully! ","INFO", JOptionPane.INFORMATION_MESSAGE);
						}
						else if (i == 0)
						{
					           JOptionPane.showMessageDialog(null, "Account is not created!","ERROR", JOptionPane.ERROR_MESSAGE);
						}
						
						Login login = new Login();
						login.setVisible(true);
						login.setLocationRelativeTo(null);
						dispose();
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
			
		});
		btnCreateAccount.setBounds(145, 550, 146, 33);
		contentPane.add(btnCreateAccount);
		
	}
}
