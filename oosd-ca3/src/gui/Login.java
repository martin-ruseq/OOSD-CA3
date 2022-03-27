package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.DebugGraphics;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			18/01/2022 

/**
 * This class creates login window allowing the user to login to the account. 
 * @author Marcin Rusiecki
 * @version 1.0
 */
public class Login extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField txtLoginPass;
	private JTextField txtLoginEmail;

	/**
	 * Runs the Login application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Login frame = new Login();
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
	 * Builds the Login window. 
	 */
	public Login()
	{
		setPreferredSize(new Dimension(400, 560));
		setMinimumSize(new Dimension(400, 560));
		setMaximumSize(new Dimension(400, 560));
		setMaximizedBounds(new Rectangle(0, 0, 400, 560));
		setResizable(false);
		setForeground(Color.WHITE);
		setName("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/resources/icon.png")));
		setBackground(Color.LIGHT_GRAY);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 560);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addMouseListener(new MouseAdapter() 
		{
			/**
			 * Display sign up form in the screen.
			 * @param e left mouse button click.
			 */
			public void mouseClicked(MouseEvent e) 
			{
				SignUp signup = new SignUp();
				signup.setVisible(true);
				signup.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSignUp.setBounds(116, 462, 153, 30);
		contentPane.add(btnSignUp);
		
		JLabel loginLogo = new JLabel("");
		loginLogo.setIcon(new ImageIcon(Login.class.getResource("/resources/logo.png")));
		loginLogo.setBounds(20, 10, 366, 120);
		contentPane.add(loginLogo);
		
		JLabel lblSignUpInfo1 = new JLabel("Don't have an account? \r\n");
		lblSignUpInfo1.setDisplayedMnemonic(KeyEvent.VK_BEGIN);
		lblSignUpInfo1.setPreferredSize(new Dimension(320, 13));
		lblSignUpInfo1.setToolTipText("");
		lblSignUpInfo1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSignUpInfo1.setLabelFor(btnSignUp);
		lblSignUpInfo1.setBounds(116, 396, 153, 30);
		contentPane.add(lblSignUpInfo1);
		
		JLabel lblSignUpInfo2 = new JLabel("Click \"Sign Up\" button to create one!");
		lblSignUpInfo2.setToolTipText("");
		lblSignUpInfo2.setPreferredSize(new Dimension(320, 13));
		lblSignUpInfo2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSignUpInfo2.setDisplayedMnemonic(KeyEvent.VK_BEGIN);
		lblSignUpInfo2.setBounds(75, 422, 236, 30);
		contentPane.add(lblSignUpInfo2);
		
		JPanel LoginPanel = new JPanel();
		LoginPanel.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		LoginPanel.setName("LOGIN_PANEL");
		LoginPanel.setBackground(Color.LIGHT_GRAY);
		LoginPanel.setForeground(Color.LIGHT_GRAY);
		LoginPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "LOGIN", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		LoginPanel.setBounds(45, 140, 296, 256);
		contentPane.add(LoginPanel);
		LoginPanel.setLayout(null);
			
		JLabel lblLoginEmail = new JLabel("EMAIL");
		lblLoginEmail.setBounds(36, 32, 140, 30);
		LoginPanel.add(lblLoginEmail);
		lblLoginEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtLoginEmail = new JTextField();
		txtLoginEmail.setBounds(37, 66, 225, 30);
		LoginPanel.add(txtLoginEmail);
		txtLoginEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLoginEmail.setName("loginEmail");
		txtLoginEmail.setColumns(10);
		
		JLabel lblLoginPass = new JLabel("PASSWORD");
		lblLoginPass.setBounds(36, 106, 140, 30);
		LoginPanel.add(lblLoginPass);
		lblLoginPass.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtLoginPass = new JPasswordField();
		txtLoginPass.setBounds(36, 140, 226, 30);
		LoginPanel.add(txtLoginPass);
		txtLoginPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() 
		{
			@Override
			/**
			 * Logs the user into the account and displays the user dashboard.
			 * @param e left mouse button click. 
			 */
			public void mouseClicked(MouseEvent e) 
			{
				try 
				{
					final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
					Connection connection = null ;
					ResultSet resultset = null;
					PreparedStatement prepstat = null ;
					String email = txtLoginEmail.getText();
					@SuppressWarnings("deprecation")
					String password = txtLoginPass.getText();
					String dEmail = "";
					String dPassword = "";
					
					connection = DriverManager.getConnection(DATABASE_URL, "root", "");
					
					// create Prepared Statement for inserting data into table
					prepstat = connection.prepareStatement("SELECT Email, Password FROM customer WHERE Email=? AND Password=?");
					prepstat.setString(1, email);
					prepstat.setString(2, password);
					
					resultset = prepstat.executeQuery();
					
					while(resultset.next())
					{
						dEmail = resultset.getString(1);
						dPassword = resultset.getString(2);
					}
					if ( dEmail.compareTo(email)!=0 || dPassword.compareTo(password)!=0 )
					{
						throw new LoginException();
					}
					else if (email.length() == 0 || password.length() == 0)
					{
						throw new LoginException();
					}
					else 
					{
						UserDashboard l = new UserDashboard(dEmail);
						l.setVisible(true);
						dispose();
					}
				}
				catch (LoginException loginException)
				{
					JOptionPane.showMessageDialog(null, "Incorrect EMAIL or PASSWORD\n          Please try again", "WARNING!", JOptionPane.WARNING_MESSAGE);
				}
				catch (SQLException sqlException)
				{
					sqlException.printStackTrace();
				}
				
			}
		});
		btnLogin.setBounds(36, 206, 226, 30);
		LoginPanel.add(btnLogin);
		

	}
}
