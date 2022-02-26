package gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

public class OrdersHisPanel extends JPanel
{
	private JTable OrdersTable;
	private JTextField textFieldInvoiceID;
	private JTextField textFieldProductName;
	private JTextField textFieldPaymentType;
	private JTextField textFieldQuantity;
	private JTextField textFieldTotalPrice;
	public OrdersHisPanel()
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		JScrollPane scrollPaneOrdersTable = new JScrollPane();
		scrollPaneOrdersTable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPaneOrdersTable.setBounds(10, 40, 605, 177);
		add(scrollPaneOrdersTable);
		
		OrdersTable = new JTable();
		OrdersTable.setFillsViewportHeight(true);
		OrdersTable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		OrdersTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Invoice ID", "Product Name", "Payment Type", "Quantity", "Total Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		OrdersTable.getColumnModel().getColumn(0).setResizable(false);
		OrdersTable.getColumnModel().getColumn(1).setResizable(false);
		OrdersTable.getColumnModel().getColumn(2).setResizable(false);
		OrdersTable.getColumnModel().getColumn(3).setResizable(false);
		OrdersTable.setRowHeight(20);
		scrollPaneOrdersTable.setViewportView(OrdersTable);
		
		Panel panelDetails = new Panel();
		panelDetails.setLayout(null);
		panelDetails.setName("");
		panelDetails.setBounds(10, 230, 605, 263);
		add(panelDetails);
		
		JPanel invoideDetailsPanel = new JPanel();
		invoideDetailsPanel.setLayout(null);
		invoideDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "INVOICE DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		invoideDetailsPanel.setBackground(new Color(102, 153, 204));
		invoideDetailsPanel.setBounds(1, 10, 346, 231);
		panelDetails.add(invoideDetailsPanel);
		
		JLabel lblProductName = new JLabel("Product Name:");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProductName.setBounds(10, 68, 130, 30);
		invoideDetailsPanel.add(lblProductName);
		
		JLabel lblPaymentType = new JLabel("Payment Type:");
		lblPaymentType.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPaymentType.setBounds(10, 108, 130, 30);
		invoideDetailsPanel.add(lblPaymentType);
		
		textFieldInvoiceID = new JTextField();
		textFieldInvoiceID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldInvoiceID.setEditable(false);
		textFieldInvoiceID.setColumns(10);
		textFieldInvoiceID.setBounds(138, 28, 198, 30);
		invoideDetailsPanel.add(textFieldInvoiceID);
		
		textFieldProductName = new JTextField();
		textFieldProductName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldProductName.setEditable(false);
		textFieldProductName.setColumns(10);
		textFieldProductName.setBounds(138, 68, 198, 30);
		invoideDetailsPanel.add(textFieldProductName);
		
		JLabel lblQuantity = new JLabel("Quantity: ");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuantity.setBounds(10, 148, 97, 30);
		invoideDetailsPanel.add(lblQuantity);
		
		textFieldPaymentType = new JTextField();
		textFieldPaymentType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPaymentType.setEditable(false);
		textFieldPaymentType.setColumns(10);
		textFieldPaymentType.setBounds(138, 108, 198, 30);
		invoideDetailsPanel.add(textFieldPaymentType);
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldQuantity.setEditable(false);
		textFieldQuantity.setColumns(10);
		textFieldQuantity.setBounds(138, 148, 198, 30);
		invoideDetailsPanel.add(textFieldQuantity);
		
		JLabel lblInvoiceId = new JLabel("Invoice ID:");
		lblInvoiceId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInvoiceId.setBounds(10, 28, 97, 30);
		invoideDetailsPanel.add(lblInvoiceId);
		
		textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldTotalPrice.setEditable(false);
		textFieldTotalPrice.setColumns(10);
		textFieldTotalPrice.setBounds(138, 188, 198, 30);
		invoideDetailsPanel.add(textFieldTotalPrice);
		
		JLabel lblQuantity_1 = new JLabel("Total Price: ");
		lblQuantity_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuantity_1.setBounds(10, 188, 97, 30);
		invoideDetailsPanel.add(lblQuantity_1);
		
		JLabel lblOrdersHistory = new JLabel("ORDERS HISTORY");
		lblOrdersHistory.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrdersHistory.setForeground(new Color(224, 255, 255));
		lblOrdersHistory.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOrdersHistory.setBounds(10, 0, 605, 40);
		add(lblOrdersHistory);
	}
}
