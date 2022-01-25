package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			18/01/2022

@SuppressWarnings("serial")
public class signupframe extends JFrame
{
	private JPanel contentPane;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtDob;
	private JTextField txtPhone;
	private JTextField txtStreet;
	private JTextField txtTown;

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
		setName("SignUp");
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
		
		JLabel lblFName = new JLabel("FIRST NAME *");
		lblFName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFName.setBounds(33, 149, 150, 15);
		contentPane.add(lblFName);
		
		txtFName = new JTextField();
		txtFName.setBounds(33, 163, 150, 30);
		contentPane.add(txtFName);
		txtFName.setColumns(10);
		
		JLabel lblDob = new JLabel("DATE OF BIRTH *");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDob.setBounds(33, 210, 150, 15);
		contentPane.add(lblDob);
		
		JLabel lblLName = new JLabel("LAST NAME *");
		lblLName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLName.setBounds(255, 149, 150, 15);
		contentPane.add(lblLName);
		
		txtLName = new JTextField();
		txtLName.setBounds(255, 163, 150, 30);
		contentPane.add(txtLName);
		txtLName.setColumns(10);
		
		txtDob = new JTextField();
		txtDob.setColumns(10);
		txtDob.setBounds(33, 225, 150, 30);
		contentPane.add(txtDob);
		
		JLabel lblPhone = new JLabel("PHONE *");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhone.setBounds(255, 210, 150, 15);
		contentPane.add(lblPhone);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(255, 225, 150, 30);
		contentPane.add(txtPhone);
		
		JLabel lblStreet = new JLabel("STREET *");
		lblStreet.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStreet.setBounds(33, 282, 150, 15);
		contentPane.add(lblStreet);
		
		txtStreet = new JTextField();
		txtStreet.setColumns(10);
		txtStreet.setBounds(33, 297, 150, 30);
		contentPane.add(txtStreet);
		
		JLabel lblTown = new JLabel("TOWN *");
		lblTown.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTown.setBounds(255, 282, 150, 15);
		contentPane.add(lblTown);
		
		txtTown = new JTextField();
		txtTown.setColumns(10);
		txtTown.setBounds(255, 297, 150, 30);
		contentPane.add(txtTown);
		
		JLabel lblCounty = new JLabel("COUNTY *");
		lblCounty.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCounty.setBounds(33, 345, 150, 15);
		contentPane.add(lblCounty);
		
		JComboBox countyList = new JComboBox();
		countyList.setFont(new Font("Tahoma", Font.BOLD, 12));
		countyList.setModel(new DefaultComboBoxModel(new String[] {"Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", "Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow"}));
		countyList.setBounds(33, 361, 150, 30);
		contentPane.add(countyList);
		
		JPanel detailsPanel = new JPanel();
		detailsPanel.setBackground(Color.LIGHT_GRAY);
		detailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DETAILS", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		detailsPanel.setBounds(10, 128, 416, 143);
		contentPane.add(detailsPanel);
		
	}
}
