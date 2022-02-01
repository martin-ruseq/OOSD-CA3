package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;
import java.awt.Point;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			18/01/2022

@SuppressWarnings("serial")
public class signupframe extends JFrame
{
	private JPanel contentPane;
	private JTextField txtFName;
	private JTextField textDob;
	private JTextField txtLName;
	private JTextField textPhone;
	private JTextField txtStreet;
	private JTextField txtTown;
	private JTextField txtEmail;
	private JTextField txtEmailConf;
	private JPasswordField passwordField;
	private JPasswordField passwordConf;

	/* Launch the application */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					signupframe frame = new signupframe();
					frame.setVisible(true);
					frame.setLocation(550,50);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/* Create the frame */
	public signupframe()
	{
		setAlwaysOnTop(true);
		setLocation(new Point(550, 50));
		setResizable(false);
		setName("SignUp");
		setTitle("Creating Account");
		setIconImage(Toolkit.getDefaultToolkit().getImage(signupframe.class.getResource("/resources/icon.png")));
		setAlwaysOnTop(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 451, 681);
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
		
		JLabel lblFName = new JLabel("FIRST NAME *");
		lblFName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFName.setBounds(33, 36, 130, 20);
		pDetailsPanel.add(lblFName);
		
		txtFName = new JTextField();
		txtFName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFName.setBackground(Color.WHITE);
		txtFName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		txtFName.setToolTipText("Enter your first name");
		lblFName.setLabelFor(txtFName);
		txtFName.setBounds(33, 59, 150, 25);
		pDetailsPanel.add(txtFName);
		txtFName.setColumns(10);
		
		JLabel lblDob = new JLabel("DATE OF BIRTH*");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDob.setBounds(33, 94, 130, 20);
		pDetailsPanel.add(lblDob);
		
		textDob = new JTextField();
		textDob.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textDob.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		textDob.setToolTipText("Enter your date of birth\r\n");
		lblDob.setLabelFor(textDob);
		textDob.setColumns(10);
		textDob.setBounds(33, 117, 150, 25);
		pDetailsPanel.add(textDob);
		
		JLabel lblLName = new JLabel("LAST NAME *");
		lblLName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLName.setBounds(235, 36, 130, 20);
		pDetailsPanel.add(lblLName);
		
		txtLName = new JTextField();
		txtLName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLName.setBackground(Color.WHITE);
		txtLName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		txtLName.setToolTipText("Enter your last name");
		lblLName.setLabelFor(txtLName);
		txtLName.setColumns(10);
		txtLName.setBounds(235, 59, 150, 25);
		pDetailsPanel.add(txtLName);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPhone.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		textPhone.setToolTipText("Enter your phone number");
		textPhone.setColumns(10);
		textPhone.setBounds(235, 117, 150, 25);
		pDetailsPanel.add(textPhone);
		
		JLabel lblPhone = new JLabel("PHONE *");
		lblPhone.setLabelFor(textPhone);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhone.setBounds(235, 94, 130, 20);
		pDetailsPanel.add(lblPhone);
		
		JPanel aDetailsPanel = new JPanel();
		aDetailsPanel.setFont(new Font("Tahoma", Font.BOLD, 12));
		aDetailsPanel.setBackground(Color.LIGHT_GRAY);
		aDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ADDRESS DETAILS", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		aDetailsPanel.setBounds(10, 190, 417, 170);
		contentPane.add(aDetailsPanel);
		aDetailsPanel.setLayout(null);
		
		JLabel lblStreet = new JLabel("STREET *");
		lblStreet.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStreet.setBounds(32, 37, 130, 20);
		aDetailsPanel.add(lblStreet);
		
		txtStreet = new JTextField();
		txtStreet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtStreet.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		txtStreet.setToolTipText("Enter your street and house number");
		lblStreet.setLabelFor(txtStreet);
		txtStreet.setColumns(10);
		txtStreet.setBounds(32, 60, 150, 25);
		aDetailsPanel.add(txtStreet);
		
		JLabel lblCounty = new JLabel("COUNTY *");
		lblCounty.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCounty.setBounds(32, 95, 130, 20);
		aDetailsPanel.add(lblCounty);
		
		JLabel lblTown = new JLabel("TOWN *");
		lblTown.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTown.setBounds(234, 37, 130, 20);
		aDetailsPanel.add(lblTown);
		
		txtTown = new JTextField();
		txtTown.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTown.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		txtTown.setToolTipText("Enter your town");
		lblTown.setLabelFor(txtTown);
		txtTown.setColumns(10);
		txtTown.setBounds(234, 60, 150, 25);
		aDetailsPanel.add(txtTown);
		
		JLabel lblCountry = new JLabel("COUNTRY *");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCountry.setBounds(234, 95, 130, 20);
		aDetailsPanel.add(lblCountry);
		
		JComboBox cBoxCounty = new JComboBox();
		cBoxCounty.setActionCommand("cBoxCountyChanged");
		cBoxCounty.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		cBoxCounty.setToolTipText("Select your county");
		cBoxCounty.setBounds(32, 118, 150, 25);
		aDetailsPanel.add(cBoxCounty);
		
		JComboBox cBoxCountry = new JComboBox();
		cBoxCountry.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		cBoxCountry.setActionCommand("cBoxCountryChanged");
		cBoxCountry.setToolTipText("Select your Country");
		cBoxCountry.setBounds(234, 118, 150, 25);
		aDetailsPanel.add(cBoxCountry);
		
		JPanel lDetailsPanel = new JPanel();
		lDetailsPanel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lDetailsPanel.setBackground(Color.LIGHT_GRAY);
		lDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "LOGIN DETAILS", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		lDetailsPanel.setBounds(10, 370, 417, 170);
		contentPane.add(lDetailsPanel);
		lDetailsPanel.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Enter your e-mail");
		txtEmail.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmail.setBounds(32, 59, 150, 25);
		lDetailsPanel.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-MAIL *");
		lblEmail.setLabelFor(txtEmail);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(32, 36, 130, 20);
		lDetailsPanel.add(lblEmail);
		
		JLabel lblEmailConf = new JLabel("CONFIRM E-MAIL *");
		lblEmailConf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailConf.setBounds(32, 94, 130, 20);
		lDetailsPanel.add(lblEmailConf);
		
		txtEmailConf = new JTextField();
		txtEmailConf.setToolTipText("Repeat your e-mail");
		txtEmailConf.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		txtEmailConf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmailConf.setLabelFor(txtEmailConf);
		txtEmailConf.setColumns(10);
		txtEmailConf.setBounds(32, 117, 150, 25);
		lDetailsPanel.add(txtEmailConf);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter your password");
		passwordField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(234, 59, 150, 25);
		lDetailsPanel.add(passwordField);
		
		passwordConf = new JPasswordField();
		passwordConf.setToolTipText("Repeat your password");
		passwordConf.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		passwordConf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordConf.setBounds(234, 117, 150, 25);
		lDetailsPanel.add(passwordConf);
		
		JLabel lblPassword = new JLabel("PASSWORD *");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(234, 36, 130, 20);
		lDetailsPanel.add(lblPassword);
		
		JLabel lblEmail_2 = new JLabel("CONFIRM PASSWORD *");
		lblEmail_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail_2.setBounds(234, 94, 150, 20);
		lDetailsPanel.add(lblEmail_2);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setBackground(new Color(0, 204, 102));
		btnSubmit.setBounds(111, 585, 100, 30);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBackground(new Color(255, 102, 102));
		btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnClear.setBounds(245, 585, 100, 30);
		contentPane.add(btnClear);
		
		JCheckBox chckbxTnCAccept = new JCheckBox("");
		chckbxTnCAccept.setBackground(Color.LIGHT_GRAY);
		chckbxTnCAccept.setActionCommand("");
		chckbxTnCAccept.setBounds(73, 550, 21, 25);
		contentPane.add(chckbxTnCAccept);
		
		JLabel lblAgreement = new JLabel("I agree to");
		lblAgreement.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAgreement.setBounds(101, 550, 67, 25);
		contentPane.add(lblAgreement);
		
		JLabel lblTerms = new JLabel("Terms of Use");
		lblTerms.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 128)));
		lblTerms.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTerms.setForeground(Color.BLUE.darker());
		lblTerms.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblTerms.setBounds(166, 555, 78, 16);
		lblTerms.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				
			}
		});
		contentPane.add(lblTerms);
		
		JLabel lblAnd = new JLabel("and");
		lblAnd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnd.setBounds(249, 550, 31, 25);
		contentPane.add(lblAnd);
		
		JLabel lblPrivacyPolicy = new JLabel("Privacy Policy");
		lblPrivacyPolicy.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 128)));
		lblPrivacyPolicy.setForeground(new Color(0, 0, 178));
		lblPrivacyPolicy.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrivacyPolicy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPrivacyPolicy.setBounds(277, 555, 86, 16);
		lblPrivacyPolicy.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				
			}
		});
		contentPane.add(lblPrivacyPolicy);
		
	}
}
