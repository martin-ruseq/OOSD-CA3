package gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

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

	public SettingsPanel()
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
		textFieldFname.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
		textFieldLName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldLName.setColumns(10);
		textFieldLName.setBounds(310, 28, 190, 30);
		panelDetails.add(textFieldLName);
		
		textFieldDoB = new JTextField();
		textFieldDoB.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
		textFieldPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
		textFieldZipCode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldZipCode.setColumns(10);
		textFieldZipCode.setBounds(100, 242, 190, 30);
		panelDetails.add(textFieldZipCode);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCountry.setBounds(310, 214, 103, 30);
		panelDetails.add(lblCountry);
		
		textFieldCountry = new JTextField();
		textFieldCountry.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCountry.setColumns(10);
		textFieldCountry.setBounds(310, 242, 190, 30);
		panelDetails.add(textFieldCountry);
		
		textFieldStreet = new JTextField();
		textFieldStreet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldStreet.setColumns(10);
		textFieldStreet.setBounds(100, 174, 190, 30);
		panelDetails.add(textFieldStreet);
		
		textFieldTown = new JTextField();
		textFieldTown.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
		password.setBounds(100, 321, 190, 30);
		panelDetails.add(password);
		
		passwordConfirm = new JPasswordField();
		passwordConfirm.setBounds(310, 321, 190, 30);
		panelDetails.add(passwordConfirm);
		
		JButton btnUpdateDetails = new JButton("UPDATE");
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
	}
}
