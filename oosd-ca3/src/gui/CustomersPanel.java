package gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

public class CustomersPanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JTable customersTable;
	private JTextField textFieldCustomerID;
	private JTextField textFieldCustomerFName;
	private JTextField textFieldICustomerLName;
	private JTextField textFieldCutomerDOB;
	private JTextField textFieldCustomerEmail;
	private JTextField textFieldCustomerPhone;


	public CustomersPanel()
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		Panel panelDetails = new Panel();
		panelDetails.setName("");
		panelDetails.setBounds(10, 220, 605, 263);
		add(panelDetails);
		panelDetails.setLayout(null);
		
		JPanel CustomerDetailsPanel = new JPanel();
		CustomerDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CUSTOMER DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		CustomerDetailsPanel.setBounds(1, 0, 604, 263);
		CustomerDetailsPanel.setBackground(new Color(102, 153, 204));
		panelDetails.add(CustomerDetailsPanel);
		CustomerDetailsPanel.setLayout(null);
		
		JLabel lblCustomerFName = new JLabel("First Name:");
		lblCustomerFName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerFName.setBounds(10, 68, 130, 30);
		CustomerDetailsPanel.add(lblCustomerFName);
		
		JLabel lblCustomerLName = new JLabel("Last Name:");
		lblCustomerLName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerLName.setBounds(10, 108, 130, 30);
		CustomerDetailsPanel.add(lblCustomerLName);
		
		textFieldCustomerID = new JTextField();
		textFieldCustomerID.setEditable(false);
		textFieldCustomerID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldCustomerID.setBounds(124, 29, 50, 30);
		CustomerDetailsPanel.add(textFieldCustomerID);
		textFieldCustomerID.setColumns(10);
		
		textFieldCustomerFName = new JTextField();
		textFieldCustomerFName.setEditable(false);
		textFieldCustomerFName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldCustomerFName.setBounds(124, 69, 175, 30);
		CustomerDetailsPanel.add(textFieldCustomerFName);
		textFieldCustomerFName.setColumns(10);
		
		JLabel lblCustomerAddress = new JLabel("Address:");
		lblCustomerAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerAddress.setBounds(10, 148, 97, 30);
		CustomerDetailsPanel.add(lblCustomerAddress);
		
		textFieldICustomerLName = new JTextField();
		textFieldICustomerLName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldICustomerLName.setEditable(false);
		textFieldICustomerLName.setColumns(10);
		textFieldICustomerLName.setBounds(124, 108, 175, 30);
		CustomerDetailsPanel.add(textFieldICustomerLName);
		
		JLabel lblCusomerId = new JLabel("Customer ID:");
		lblCusomerId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCusomerId.setBounds(10, 28, 120, 30);
		CustomerDetailsPanel.add(lblCusomerId);
		
		JTextArea textAreaAddress = new JTextArea();
		textAreaAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaAddress.setEditable(false);
		textAreaAddress.setText("");
		textAreaAddress.setBounds(124, 148, 175, 85);
		CustomerDetailsPanel.add(textAreaAddress);
		
		textFieldCutomerDOB = new JTextField();
		textFieldCutomerDOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCutomerDOB.setEditable(false);
		textFieldCutomerDOB.setColumns(10);
		textFieldCutomerDOB.setBounds(436, 68, 158, 30);
		CustomerDetailsPanel.add(textFieldCutomerDOB);
		
		JLabel lblCustomerDOB = new JLabel("Date of Birth:");
		lblCustomerDOB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerDOB.setBounds(316, 68, 120, 30);
		CustomerDetailsPanel.add(lblCustomerDOB);
		
		JLabel lblCustomerEmail = new JLabel("E-Mail:");
		lblCustomerEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerEmail.setBounds(316, 108, 130, 30);
		CustomerDetailsPanel.add(lblCustomerEmail);
		
		textFieldCustomerEmail = new JTextField();
		textFieldCustomerEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCustomerEmail.setEditable(false);
		textFieldCustomerEmail.setColumns(10);
		textFieldCustomerEmail.setBounds(419, 108, 175, 30);
		CustomerDetailsPanel.add(textFieldCustomerEmail);
		
		textFieldCustomerPhone = new JTextField();
		textFieldCustomerPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCustomerPhone.setEditable(false);
		textFieldCustomerPhone.setColumns(10);
		textFieldCustomerPhone.setBounds(419, 148, 175, 30);
		CustomerDetailsPanel.add(textFieldCustomerPhone);
		
		JLabel lblCustomerPhone = new JLabel("Phone:");
		lblCustomerPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerPhone.setBounds(316, 148, 130, 30);
		CustomerDetailsPanel.add(lblCustomerPhone);
		
		JScrollPane scrollPaneCustomersTable = new JScrollPane();
		scrollPaneCustomersTable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneCustomersTable.setBounds(10, 37, 605, 177);
		add(scrollPaneCustomersTable);
		
		customersTable = new JTable();
		customersTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		customersTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		customersTable.setRowHeight(20);
		customersTable.setSelectionBackground(SystemColor.activeCaption);
		customersTable.setName("CustomersTable");
		customersTable.setFillsViewportHeight(true);
		customersTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		customersTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Customer ID", "First Name", "Last Name", "Address", "E-Mail", "Date of Birth", "Phone"
			}
		));
		customersTable.getColumnModel().getColumn(0).setResizable(false);
		customersTable.getColumnModel().getColumn(0).setMinWidth(75);
		customersTable.getColumnModel().getColumn(0).setMaxWidth(75);
		customersTable.getColumnModel().getColumn(1).setResizable(false);
		customersTable.getColumnModel().getColumn(1).setPreferredWidth(150);
		customersTable.getColumnModel().getColumn(1).setMinWidth(150);
		customersTable.getColumnModel().getColumn(2).setResizable(false);
		customersTable.getColumnModel().getColumn(2).setPreferredWidth(150);
		customersTable.getColumnModel().getColumn(2).setMinWidth(150);
		customersTable.getColumnModel().getColumn(3).setResizable(false);
		customersTable.getColumnModel().getColumn(3).setPreferredWidth(150);
		customersTable.getColumnModel().getColumn(3).setMinWidth(150);
		customersTable.getColumnModel().getColumn(4).setResizable(false);
		customersTable.getColumnModel().getColumn(4).setPreferredWidth(150);
		customersTable.getColumnModel().getColumn(4).setMinWidth(150);
		customersTable.getColumnModel().getColumn(5).setResizable(false);
		customersTable.getColumnModel().getColumn(5).setPreferredWidth(150);
		customersTable.getColumnModel().getColumn(5).setMinWidth(150);
		customersTable.getColumnModel().getColumn(6).setResizable(false);
		customersTable.getColumnModel().getColumn(6).setPreferredWidth(120);
		customersTable.getColumnModel().getColumn(6).setMinWidth(120);
		scrollPaneCustomersTable.setViewportView(customersTable);
		
		JLabel lblCustomers = new JLabel("CUSTOMERS");
		lblCustomers.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomers.setForeground(new Color(224, 255, 255));
		lblCustomers.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCustomers.setBounds(10, 0, 605, 40);
		add(lblCustomers);
		setVisible(true);
	}
}
