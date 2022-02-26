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
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.DebugGraphics;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			18/01/2022


public class Login extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtEmail;

	/* Launch the application */
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

	/* Create the frame */
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
		
		JButton signupButton = new JButton("Sign Up");
		signupButton.addMouseListener(new MouseAdapter() 
		{

			public void mouseClicked(MouseEvent e) 
			{
				//new signupframe().setVisible(true);
				SignUp signup = new SignUp();
				signup.setVisible(true);
				signup.setLocationRelativeTo(null);
				dispose();

			}
		});
		signupButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		signupButton.setBounds(116, 462, 153, 30);
		contentPane.add(signupButton);
		
		JLabel loginLogo = new JLabel("");
		loginLogo.setIcon(new ImageIcon(Login.class.getResource("/resources/logo.png")));
		loginLogo.setBounds(20, 10, 366, 120);
		contentPane.add(loginLogo);
		
		JLabel lblSignUpInfo1 = new JLabel("Don't have an account? \r\n");
		lblSignUpInfo1.setDisplayedMnemonic(KeyEvent.VK_BEGIN);
		lblSignUpInfo1.setPreferredSize(new Dimension(320, 13));
		lblSignUpInfo1.setToolTipText("");
		lblSignUpInfo1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSignUpInfo1.setLabelFor(signupButton);
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
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(36, 206, 226, 30);
		LoginPanel.add(loginButton);
		
		JLabel lblLoginWarning = new JLabel("");
		lblLoginWarning.setBounds(36, 180, 226, 16);
		LoginPanel.add(lblLoginWarning);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(36, 140, 226, 30);
		LoginPanel.add(txtPassword);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblLoginPass = new JLabel("PASSWORD");
		lblLoginPass.setBounds(36, 106, 140, 30);
		LoginPanel.add(lblLoginPass);
		lblLoginPass.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtEmail = new JTextField();
		txtEmail.setBounds(37, 66, 225, 30);
		LoginPanel.add(txtEmail);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmail.setName("loginEmail");
		txtEmail.setColumns(10);
		
		JLabel lblLoginEmail = new JLabel("EMAIL");
		lblLoginEmail.setBounds(36, 32, 140, 30);
		LoginPanel.add(lblLoginEmail);
		lblLoginEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
	}
}
