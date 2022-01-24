package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			18/01/2022

@SuppressWarnings("serial")
public class loginframe extends JFrame
{
	private JPanel contentPane;
	private JPasswordField pwdPassword;
	private JTextField loginEmail;

	/* Launch the application */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					loginframe frame = new loginframe();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/* Create the frame */
	public loginframe()
	{
		setMaximizedBounds(new Rectangle(0, 0, 400, 560));
		setResizable(false);
		setForeground(Color.WHITE);
		setName("login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(loginframe.class.getResource("/resources/icon.png")));
		setBackground(Color.LIGHT_GRAY);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 560);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel loginemail = new JLabel("EMAIL");
		loginemail.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginemail.setBounds(65, 148, 140, 30);
		contentPane.add(loginemail);
		
		JLabel loginpw = new JLabel("PASSWORD");
		loginpw.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginpw.setBounds(65, 218, 140, 30);
		contentPane.add(loginpw);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pwdPassword.setBounds(65, 248, 257, 30);
		contentPane.add(pwdPassword);
		
		loginEmail = new JTextField();
		loginEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		loginEmail.setName("loginEmail");
		loginEmail.setBounds(65, 178, 257, 30);
		contentPane.add(loginEmail);
		loginEmail.setColumns(10);
		
		JButton signupButton = new JButton("Sign Up");
		signupButton.addMouseListener(new MouseAdapter() 
		{
			@SuppressWarnings("deprecation")
			public void mouseClicked(MouseEvent e) 
			{
				new signupframe().show();
			}
		});
		signupButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		signupButton.setBounds(80, 462, 226, 30);
		contentPane.add(signupButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(80, 323, 226, 30);
		contentPane.add(loginButton);
		
		JLabel loginLogo = new JLabel("");
		loginLogo.setIcon(new ImageIcon(loginframe.class.getResource("/resources/logo.png")));
		loginLogo.setBounds(20, 10, 366, 120);
		contentPane.add(loginLogo);
		
		JLabel newCustomerInfo = new JLabel("Don't have an account? \r\n");
		newCustomerInfo.setDisplayedMnemonic(KeyEvent.VK_BEGIN);
		newCustomerInfo.setPreferredSize(new Dimension(320, 13));
		newCustomerInfo.setToolTipText("");
		newCustomerInfo.setFont(new Font("Tahoma", Font.BOLD, 12));
		newCustomerInfo.setLabelFor(signupButton);
		newCustomerInfo.setBounds(116, 396, 153, 30);
		contentPane.add(newCustomerInfo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 384, 366, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 136, 366, 2);
		contentPane.add(separator_1);
		
		JLabel loginWarning = new JLabel("");
		loginWarning.setBounds(80, 295, 226, 15);
		contentPane.add(loginWarning);
		
		JLabel lblClicksignUp = new JLabel("Click \"Sign Up\" button to create one!");
		lblClicksignUp.setToolTipText("");
		lblClicksignUp.setPreferredSize(new Dimension(320, 13));
		lblClicksignUp.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClicksignUp.setDisplayedMnemonic(KeyEvent.VK_BEGIN);
		lblClicksignUp.setBounds(75, 422, 236, 30);
		contentPane.add(lblClicksignUp);
	}
}
