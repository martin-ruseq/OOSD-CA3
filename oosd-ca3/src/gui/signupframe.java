package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			18/01/2022

@SuppressWarnings("serial")
public class signupframe extends JFrame
{
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/* Create the frame */
	@SuppressWarnings({"rawtypes", "unchecked"})
	public signupframe()
	{
		setName("");
		setResizable(false);
		setTitle("Creating Account");
		setIconImage(Toolkit.getDefaultToolkit().getImage(signupframe.class.getResource("/resources/icon.png")));
		setAlwaysOnTop(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel signupLogo = new JLabel("");
		signupLogo.setIcon(new ImageIcon(signupframe.class.getResource("/resources/logo.png")));
		signupLogo.setBounds(42, 10, 366, 120);
		contentPane.add(signupLogo);
		
		JLabel firstName = new JLabel("FIRST NAME *");
		firstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		firstName.setBounds(33, 149, 150, 15);
		contentPane.add(firstName);
		
		textField = new JTextField();
		textField.setBounds(33, 163, 150, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel DateOfBirth = new JLabel("DATE OF BIRTH *");
		DateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 12));
		DateOfBirth.setBounds(33, 210, 150, 15);
		contentPane.add(DateOfBirth);
		
		JLabel lastName = new JLabel("LAST NAME *");
		lastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lastName.setBounds(245, 149, 150, 15);
		contentPane.add(lastName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(245, 163, 150, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(33, 225, 150, 30);
		contentPane.add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 270, 416, 2);
		contentPane.add(separator);
		
		JLabel lblPhone = new JLabel("PHONE *");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhone.setBounds(245, 210, 150, 15);
		contentPane.add(lblPhone);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(245, 225, 150, 30);
		contentPane.add(textField_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 136, 416, 2);
		contentPane.add(separator_1);
		
		JLabel street = new JLabel("STREET *");
		street.setFont(new Font("Tahoma", Font.BOLD, 12));
		street.setBounds(33, 282, 150, 15);
		contentPane.add(street);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(33, 297, 150, 30);
		contentPane.add(textField_4);
		
		JLabel town = new JLabel("TOWN *");
		town.setFont(new Font("Tahoma", Font.BOLD, 12));
		town.setBounds(245, 282, 150, 15);
		contentPane.add(town);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(245, 297, 150, 30);
		contentPane.add(textField_5);
		
		JLabel county = new JLabel("COUNTY *");
		county.setFont(new Font("Tahoma", Font.BOLD, 12));
		county.setBounds(33, 345, 150, 15);
		contentPane.add(county);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", "Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow"}));
		comboBox.setBounds(33, 361, 150, 30);
		contentPane.add(comboBox);
		
	}
}
