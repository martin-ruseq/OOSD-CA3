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
	private JTable storeTable;
	private JTextField textFieldItemID;
	private JTextField textFieldItemName;
	private JTextField textFieldItemPrice;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	public CustomersPanel()
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		Panel panelDetails = new Panel();
		panelDetails.setName("");
		panelDetails.setBounds(10, 230, 605, 263);
		add(panelDetails);
		panelDetails.setLayout(null);
		
		JPanel selectedCustomerPanel = new JPanel();
		selectedCustomerPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CUSTOMER DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		selectedCustomerPanel.setBounds(1, 10, 297, 243);
		selectedCustomerPanel.setBackground(new Color(102, 153, 204));
		panelDetails.add(selectedCustomerPanel);
		selectedCustomerPanel.setLayout(null);
		
		JLabel lblCustomerFName = new JLabel("First Name:");
		lblCustomerFName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerFName.setBounds(10, 68, 130, 30);
		selectedCustomerPanel.add(lblCustomerFName);
		
		JLabel lblCustomerLName = new JLabel("Last Name:");
		lblCustomerLName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerLName.setBounds(10, 108, 130, 30);
		selectedCustomerPanel.add(lblCustomerLName);
		
		textFieldItemID = new JTextField();
		textFieldItemID.setEditable(false);
		textFieldItemID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldItemID.setBounds(113, 28, 50, 30);
		selectedCustomerPanel.add(textFieldItemID);
		textFieldItemID.setColumns(10);
		
		textFieldItemName = new JTextField();
		textFieldItemName.setEditable(false);
		textFieldItemName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldItemName.setBounds(113, 68, 175, 30);
		selectedCustomerPanel.add(textFieldItemName);
		textFieldItemName.setColumns(10);
		
		JLabel lblCusAddress = new JLabel("Address:");
		lblCusAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCusAddress.setBounds(10, 148, 97, 30);
		selectedCustomerPanel.add(lblCusAddress);
		
		textFieldItemPrice = new JTextField();
		textFieldItemPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldItemPrice.setEditable(false);
		textFieldItemPrice.setColumns(10);
		textFieldItemPrice.setBounds(113, 108, 175, 30);
		selectedCustomerPanel.add(textFieldItemPrice);
		
		JLabel lblCusomerId = new JLabel("ID:");
		lblCusomerId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCusomerId.setBounds(10, 28, 97, 30);
		selectedCustomerPanel.add(lblCusomerId);
		
		JTextArea textAreaCAddress = new JTextArea();
		textAreaCAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaCAddress.setEditable(false);
		textAreaCAddress.setText("");
		textAreaCAddress.setBounds(113, 148, 175, 85);
		selectedCustomerPanel.add(textAreaCAddress);
		
		JPanel selectedCustomerPanel_1 = new JPanel();
		selectedCustomerPanel_1.setLayout(null);
		selectedCustomerPanel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CUSTOMER DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		selectedCustomerPanel_1.setBackground(new Color(102, 153, 204));
		selectedCustomerPanel_1.setBounds(308, 10, 297, 146);
		panelDetails.add(selectedCustomerPanel_1);
		
		JLabel lblCustomerEmail = new JLabel("E-Mail:");
		lblCustomerEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerEmail.setBounds(10, 68, 130, 30);
		selectedCustomerPanel_1.add(lblCustomerEmail);
		
		JLabel lblCustomerPhone = new JLabel("Phone:");
		lblCustomerPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerPhone.setBounds(10, 108, 130, 30);
		selectedCustomerPanel_1.add(lblCustomerPhone);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(130, 28, 158, 30);
		selectedCustomerPanel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(113, 68, 175, 30);
		selectedCustomerPanel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(113, 108, 175, 30);
		selectedCustomerPanel_1.add(textField_2);
		
		JLabel lblDOB = new JLabel("Date of Birth:");
		lblDOB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDOB.setBounds(10, 28, 120, 30);
		selectedCustomerPanel_1.add(lblDOB);
		
		JScrollPane scrollPaneStoreTable = new JScrollPane();
		scrollPaneStoreTable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneStoreTable.setBounds(10, 40, 605, 177);
		add(scrollPaneStoreTable);
		
		storeTable = new JTable();
		storeTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		storeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		storeTable.setRowHeight(20);
		storeTable.setSelectionBackground(SystemColor.activeCaption);
		storeTable.setName("CustomersTable");
		storeTable.setFillsViewportHeight(true);
		storeTable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		storeTable.setModel(new DefaultTableModel(
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
				"ID", "First Name", "Last Name", "Address", "E-Mail", "DOB", "Phone"
			}
		){
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] 
			{
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) 
			{
				return columnEditables[column];
			}
		});
		storeTable.getColumnModel().getColumn(0).setResizable(false);
		storeTable.getColumnModel().getColumn(0).setPreferredWidth(35);
		storeTable.getColumnModel().getColumn(1).setResizable(false);
		storeTable.getColumnModel().getColumn(1).setPreferredWidth(120);
		storeTable.getColumnModel().getColumn(2).setResizable(false);
		storeTable.getColumnModel().getColumn(2).setPreferredWidth(120);
		storeTable.getColumnModel().getColumn(3).setResizable(false);
		storeTable.getColumnModel().getColumn(3).setPreferredWidth(120);
		storeTable.getColumnModel().getColumn(4).setResizable(false);
		storeTable.getColumnModel().getColumn(4).setPreferredWidth(120);
		storeTable.getColumnModel().getColumn(5).setResizable(false);
		storeTable.getColumnModel().getColumn(5).setPreferredWidth(100);
		storeTable.getColumnModel().getColumn(6).setResizable(false);
		storeTable.getColumnModel().getColumn(6).setPreferredWidth(110);
		scrollPaneStoreTable.setViewportView(storeTable);
		
		JLabel lblNewLabel = new JLabel("CUSTOMERS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(224, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 0, 605, 40);
		add(lblNewLabel);
		setVisible(true);
	}
}
