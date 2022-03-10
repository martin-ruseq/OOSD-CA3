package gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

public class InvoicesPanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JTable invoicesTable;
	private JTextField textFieldCustomerId;
	private JTextField textFieldCustomerFName;
	private JTextField textFieldCustomerLName;
	private JTextField textFieldCustomerEmail;
	private JTextField textFieldInvoiceId;
	private JTextField textFieldProductId;
	private JTextField textFieldProductName;
	private JTextField textFieldPaymentType;
	private JTextField textFieldProductQuantity;
	private JTextField textFieldCustomerPhone;
	private JTextField textFieldTotalPrice;

	@SuppressWarnings({})
	public InvoicesPanel()
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		Panel panelDetails = new Panel();
		panelDetails.setName("");
		panelDetails.setBounds(10, 220, 605, 263);
		add(panelDetails);
		panelDetails.setLayout(null);
		
		JPanel customerDetailsPanel = new JPanel();
		customerDetailsPanel.setLayout(null);
		customerDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CUSTOMER DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		customerDetailsPanel.setBackground(new Color(102, 153, 204));
		customerDetailsPanel.setBounds(0, 0, 297, 263);
		panelDetails.add(customerDetailsPanel);
		
		JLabel lblCustomerFName = new JLabel("First Name:");
		lblCustomerFName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerFName.setBounds(10, 63, 118, 30);
		customerDetailsPanel.add(lblCustomerFName);
		
		JLabel lblCustomerLName = new JLabel("Last Name:");
		lblCustomerLName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerLName.setBounds(10, 103, 118, 30);
		customerDetailsPanel.add(lblCustomerLName);
		
		textFieldCustomerId = new JTextField();
		textFieldCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldCustomerId.setEditable(false);
		textFieldCustomerId.setColumns(10);
		textFieldCustomerId.setBounds(125, 23, 50, 30);
		customerDetailsPanel.add(textFieldCustomerId);
		
		textFieldCustomerFName = new JTextField();
		textFieldCustomerFName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldCustomerFName.setEditable(false);
		textFieldCustomerFName.setColumns(10);
		textFieldCustomerFName.setBounds(125, 63, 163, 30);
		customerDetailsPanel.add(textFieldCustomerFName);
		
		JLabel lblCustomerEmail = new JLabel("Email:");
		lblCustomerEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerEmail.setBounds(10, 143, 118, 30);
		customerDetailsPanel.add(lblCustomerEmail);
		
		textFieldCustomerLName = new JTextField();
		textFieldCustomerLName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldCustomerLName.setEditable(false);
		textFieldCustomerLName.setColumns(10);
		textFieldCustomerLName.setBounds(125, 103, 163, 30);
		customerDetailsPanel.add(textFieldCustomerLName);
		
		JLabel lblCustomerId = new JLabel("Customer ID:");
		lblCustomerId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerId.setBounds(10, 23, 118, 30);
		customerDetailsPanel.add(lblCustomerId);
		
		textFieldCustomerEmail = new JTextField();
		textFieldCustomerEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldCustomerEmail.setEditable(false);
		textFieldCustomerEmail.setColumns(10);
		textFieldCustomerEmail.setBounds(125, 143, 163, 30);
		customerDetailsPanel.add(textFieldCustomerEmail);
		
		textFieldCustomerPhone = new JTextField();
		textFieldCustomerPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldCustomerPhone.setEditable(false);
		textFieldCustomerPhone.setColumns(10);
		textFieldCustomerPhone.setBounds(125, 183, 163, 30);
		customerDetailsPanel.add(textFieldCustomerPhone);
		
		JLabel lblCustomerPhone = new JLabel("Phone:");
		lblCustomerPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerPhone.setBounds(10, 183, 118, 30);
		customerDetailsPanel.add(lblCustomerPhone);
		
		JPanel ivoiceDetailsPanel = new JPanel();
		ivoiceDetailsPanel.setLayout(null);
		ivoiceDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "IVOICE DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		ivoiceDetailsPanel.setBackground(new Color(102, 153, 204));
		ivoiceDetailsPanel.setBounds(308, 0, 297, 263);
		panelDetails.add(ivoiceDetailsPanel);
		
		JLabel lblProductId = new JLabel("Product ID:");
		lblProductId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProductId.setBounds(11, 63, 130, 30);
		ivoiceDetailsPanel.add(lblProductId);
		
		JLabel lblProductName = new JLabel("Product Name:");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProductName.setBounds(11, 103, 130, 30);
		ivoiceDetailsPanel.add(lblProductName);
		
		textFieldInvoiceId = new JTextField();
		textFieldInvoiceId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldInvoiceId.setEditable(false);
		textFieldInvoiceId.setColumns(10);
		textFieldInvoiceId.setBounds(140, 23, 50, 30);
		ivoiceDetailsPanel.add(textFieldInvoiceId);
		
		textFieldProductId = new JTextField();
		textFieldProductId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldProductId.setEditable(false);
		textFieldProductId.setColumns(10);
		textFieldProductId.setBounds(140, 63, 50, 30);
		ivoiceDetailsPanel.add(textFieldProductId);
		
		JLabel lblPaymentType = new JLabel("Payment Type:");
		lblPaymentType.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPaymentType.setBounds(11, 143, 130, 30);
		ivoiceDetailsPanel.add(lblPaymentType);
		
		textFieldProductName = new JTextField();
		textFieldProductName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldProductName.setEditable(false);
		textFieldProductName.setColumns(10);
		textFieldProductName.setBounds(140, 103, 148, 30);
		ivoiceDetailsPanel.add(textFieldProductName);
		
		JLabel lblInvoiceId = new JLabel("Invoice ID:");
		lblInvoiceId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInvoiceId.setBounds(11, 23, 130, 30);
		ivoiceDetailsPanel.add(lblInvoiceId);
		
		textFieldPaymentType = new JTextField();
		textFieldPaymentType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPaymentType.setEditable(false);
		textFieldPaymentType.setColumns(10);
		textFieldPaymentType.setBounds(140, 143, 149, 30);
		ivoiceDetailsPanel.add(textFieldPaymentType);
		
		JLabel lblProductQuantity = new JLabel("Quantity:");
		lblProductQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProductQuantity.setBounds(10, 183, 119, 30);
		ivoiceDetailsPanel.add(lblProductQuantity);
		
		textFieldProductQuantity = new JTextField();
		textFieldProductQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldProductQuantity.setEditable(false);
		textFieldProductQuantity.setColumns(10);
		textFieldProductQuantity.setBounds(140, 183, 149, 30);
		ivoiceDetailsPanel.add(textFieldProductQuantity);
		
		textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldTotalPrice.setEditable(false);
		textFieldTotalPrice.setColumns(10);
		textFieldTotalPrice.setBounds(140, 223, 149, 30);
		ivoiceDetailsPanel.add(textFieldTotalPrice);
		
		JLabel lblTotalPrice = new JLabel("Total Price:");
		lblTotalPrice.setForeground(Color.RED);
		lblTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalPrice.setBounds(11, 222, 119, 30);
		ivoiceDetailsPanel.add(lblTotalPrice);
		
		JScrollPane scrollPaneInvoicesTable = new JScrollPane();
		scrollPaneInvoicesTable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneInvoicesTable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneInvoicesTable.setBounds(10, 37, 605, 177);
		add(scrollPaneInvoicesTable);
		
		invoicesTable = new JTable();
		invoicesTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		invoicesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		invoicesTable.setRowHeight(20);
		invoicesTable.setSelectionBackground(SystemColor.activeCaption);
		invoicesTable.setName("");
		invoicesTable.setFillsViewportHeight(true);
		invoicesTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		invoicesTable.setModel(new DefaultTableModel(
			new Object[][] 
			{
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
			new String[] 
			{
				"Invoice ID", "Product Name", "Product ID", "Payment Type", "Quantity", "Total Price", "Ordered by"
			}
		) {
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] 
			{
				true, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column)
			{
				return columnEditables[column];
			}
		});
		invoicesTable.getColumnModel().getColumn(0).setMinWidth(75);
		invoicesTable.getColumnModel().getColumn(0).setMaxWidth(75);
		invoicesTable.getColumnModel().getColumn(1).setResizable(false);
		invoicesTable.getColumnModel().getColumn(1).setPreferredWidth(150);
		invoicesTable.getColumnModel().getColumn(1).setMinWidth(150);
		invoicesTable.getColumnModel().getColumn(2).setResizable(false);
		invoicesTable.getColumnModel().getColumn(2).setMinWidth(75);
		invoicesTable.getColumnModel().getColumn(2).setMaxWidth(75);
		invoicesTable.getColumnModel().getColumn(3).setResizable(false);
		invoicesTable.getColumnModel().getColumn(3).setPreferredWidth(100);
		invoicesTable.getColumnModel().getColumn(3).setMinWidth(100);
		invoicesTable.getColumnModel().getColumn(3).setMaxWidth(100);
		invoicesTable.getColumnModel().getColumn(4).setResizable(false);
		invoicesTable.getColumnModel().getColumn(4).setPreferredWidth(60);
		invoicesTable.getColumnModel().getColumn(4).setMinWidth(60);
		invoicesTable.getColumnModel().getColumn(4).setMaxWidth(60);
		invoicesTable.getColumnModel().getColumn(5).setResizable(false);
		invoicesTable.getColumnModel().getColumn(5).setPreferredWidth(80);
		invoicesTable.getColumnModel().getColumn(5).setMinWidth(80);
		invoicesTable.getColumnModel().getColumn(5).setMaxWidth(80);
		invoicesTable.getColumnModel().getColumn(6).setResizable(false);
		invoicesTable.getColumnModel().getColumn(6).setPreferredWidth(150);
		invoicesTable.getColumnModel().getColumn(6).setMinWidth(150);
		scrollPaneInvoicesTable.setViewportView(invoicesTable);
		
		JLabel lblInvoices = new JLabel("IVOICES");
		lblInvoices.setHorizontalAlignment(SwingConstants.CENTER);
		lblInvoices.setForeground(new Color(224, 255, 255));
		lblInvoices.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInvoices.setBounds(10, 0, 605, 40);
		add(lblInvoices);
		setVisible(true);
	}
}
