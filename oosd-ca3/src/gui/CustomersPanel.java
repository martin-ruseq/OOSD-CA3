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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

/**
 * This class creates a panel used in the administrator dashboard that is showing all customers in the database.
 * @author Marcin Rusiecki
 * @version 1.0
 */
public class CustomersPanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JTable customersTable;
	private JTextField txtCustomerId;
	private JTextField txtCustomerFName;
	private JTextField txtCustomerLName;
	private JTextField txtCutomerDOB;
	private JTextField txtCustomerEmail;
	private JTextField txtCustomerPhone;

	/** 
	 * Builds the panel with all customers in the database for administrator.
	 */
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
		
		txtCustomerFName = new JTextField();
		txtCustomerFName.setEditable(false);
		txtCustomerFName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCustomerFName.setBounds(124, 69, 175, 30);
		CustomerDetailsPanel.add(txtCustomerFName);
		txtCustomerFName.setColumns(10);
		
		JLabel lblCustomerLName = new JLabel("Last Name:");
		lblCustomerLName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerLName.setBounds(10, 108, 130, 30);
		CustomerDetailsPanel.add(lblCustomerLName);
		
		txtCustomerLName = new JTextField();
		txtCustomerLName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCustomerLName.setEditable(false);
		txtCustomerLName.setColumns(10);
		txtCustomerLName.setBounds(124, 108, 175, 30);
		CustomerDetailsPanel.add(txtCustomerLName);
		
		JLabel lblCusomerId = new JLabel("Customer ID:");
		lblCusomerId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCusomerId.setBounds(10, 28, 120, 30);
		CustomerDetailsPanel.add(lblCusomerId);
		
		txtCustomerId = new JTextField();
		txtCustomerId.setEditable(false);
		txtCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCustomerId.setBounds(124, 29, 50, 30);
		CustomerDetailsPanel.add(txtCustomerId);
		txtCustomerId.setColumns(10);
		
		JLabel lblCustomerAddress = new JLabel("Address:");
		lblCustomerAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerAddress.setBounds(10, 148, 97, 30);
		CustomerDetailsPanel.add(lblCustomerAddress);
		
		JTextArea txtCustomerAddress = new JTextArea();
		txtCustomerAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCustomerAddress.setEditable(false);
		txtCustomerAddress.setText("");
		txtCustomerAddress.setBounds(124, 148, 175, 85);
		CustomerDetailsPanel.add(txtCustomerAddress);
		
		JLabel lblCustomerDOB = new JLabel("Date of Birth:");
		lblCustomerDOB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerDOB.setBounds(316, 68, 120, 30);
		CustomerDetailsPanel.add(lblCustomerDOB);
		
		txtCutomerDOB = new JTextField();
		txtCutomerDOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCutomerDOB.setEditable(false);
		txtCutomerDOB.setColumns(10);
		txtCutomerDOB.setBounds(436, 68, 158, 30);
		CustomerDetailsPanel.add(txtCutomerDOB);
		
		JLabel lblCustomerEmail = new JLabel("E-Mail:");
		lblCustomerEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerEmail.setBounds(316, 108, 130, 30);
		CustomerDetailsPanel.add(lblCustomerEmail);
		
		txtCustomerEmail = new JTextField();
		txtCustomerEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCustomerEmail.setEditable(false);
		txtCustomerEmail.setColumns(10);
		txtCustomerEmail.setBounds(419, 108, 175, 30);
		CustomerDetailsPanel.add(txtCustomerEmail);
		
		JLabel lblCustomerPhone = new JLabel("Phone:");
		lblCustomerPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerPhone.setBounds(316, 148, 130, 30);
		CustomerDetailsPanel.add(lblCustomerPhone);
		
		txtCustomerPhone = new JTextField();
		txtCustomerPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCustomerPhone.setEditable(false);
		txtCustomerPhone.setColumns(10);
		txtCustomerPhone.setBounds(419, 148, 175, 30);
		CustomerDetailsPanel.add(txtCustomerPhone);
		
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
		) {
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			/**
			 * Sets if the cell in the table is edtable
			 * @param row specify which row in the table
			 * @param column specify which column th the table
			 * @return if the cell is editable (true) or not (false)
			 */
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		customersTable.getColumnModel().getColumn(0).setMinWidth(75);
		customersTable.getColumnModel().getColumn(0).setMaxWidth(75);
		customersTable.getColumnModel().getColumn(1).setPreferredWidth(180);
		customersTable.getColumnModel().getColumn(1).setMinWidth(180);
		customersTable.getColumnModel().getColumn(2).setPreferredWidth(180);
		customersTable.getColumnModel().getColumn(2).setMinWidth(180);
		customersTable.getColumnModel().getColumn(3).setPreferredWidth(180);
		customersTable.getColumnModel().getColumn(3).setMinWidth(180);
		customersTable.getColumnModel().getColumn(4).setPreferredWidth(180);
		customersTable.getColumnModel().getColumn(4).setMinWidth(180);
		customersTable.getColumnModel().getColumn(5).setPreferredWidth(180);
		customersTable.getColumnModel().getColumn(5).setMinWidth(180);
		customersTable.getColumnModel().getColumn(6).setPreferredWidth(140);
		customersTable.getColumnModel().getColumn(6).setMinWidth(140);
		scrollPaneCustomersTable.setViewportView(customersTable);
		DefaultTableModel table = (DefaultTableModel)customersTable.getModel();
		table.setRowCount(0);
		
		JLabel lblCustomers = new JLabel("CUSTOMERS");
		lblCustomers.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomers.setForeground(new Color(224, 255, 255));
		lblCustomers.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCustomers.setBounds(10, 0, 605, 40);
		add(lblCustomers);
		setVisible(true);
		
		try
		{
			final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
			Connection connection = null ;
			ResultSet resultset = null;
			PreparedStatement prepstat = null ;
			
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");

			prepstat = connection.prepareStatement("SELECT * FROM customer");
			
			resultset = prepstat.executeQuery();
			while(resultset.next())
			{
				Object row [] = {resultset.getInt("CustomerId"), resultset.getString("FirstName"), resultset.getString("LastName"), resultset.getString("Street") + " " + resultset.getString("Town") + " " + resultset.getString("ZipCode") + " " + resultset.getString("Country"), resultset.getString("Email"), resultset.getString("DateOfBirth"), resultset.getString("Phone")};
				table.addRow(row);
			}

		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
}
