package gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

public class StorePanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JTable storeTable;
	private JTextField textFieldItemID;
	private JTextField textFieldItemName;
	private JTextField textFieldTotalPrice;
	private JTextField textFieldCardNo;
	private JTextField textFieldItemPrice;
	private JTextField textFieldItemStock;

	@SuppressWarnings({"rawtypes", "unchecked"})
	public StorePanel()
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		Panel panelDetails = new Panel();
		panelDetails.setName("");
		panelDetails.setBounds(10, 230, 605, 263);
		add(panelDetails);
		panelDetails.setLayout(null);
		
		JButton btnBuy = new JButton("BUY");
		btnBuy.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBuy.setBounds(1, 224, 605, 39);
		panelDetails.add(btnBuy);
		
		JPanel selectedDetailsPanel = new JPanel();
		selectedDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "SELECTED ITEM", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		selectedDetailsPanel.setBounds(1, 10, 297, 199);
		selectedDetailsPanel.setBackground(new Color(102, 153, 204));
		panelDetails.add(selectedDetailsPanel);
		selectedDetailsPanel.setLayout(null);
		
		JLabel lblItemName = new JLabel("Item Name:");
		lblItemName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblItemName.setBounds(10, 68, 130, 30);
		selectedDetailsPanel.add(lblItemName);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrice.setBounds(10, 108, 130, 30);
		selectedDetailsPanel.add(lblPrice);
		
		textFieldItemID = new JTextField();
		textFieldItemID.setEditable(false);
		textFieldItemID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldItemID.setBounds(113, 28, 89, 30);
		selectedDetailsPanel.add(textFieldItemID);
		textFieldItemID.setColumns(10);
		
		textFieldItemName = new JTextField();
		textFieldItemName.setEditable(false);
		textFieldItemName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldItemName.setBounds(113, 68, 174, 30);
		selectedDetailsPanel.add(textFieldItemName);
		textFieldItemName.setColumns(10);
		
		JLabel lblStock = new JLabel("Stock:");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStock.setBounds(10, 148, 97, 30);
		selectedDetailsPanel.add(lblStock);
		
		textFieldItemPrice = new JTextField();
		textFieldItemPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldItemPrice.setEditable(false);
		textFieldItemPrice.setColumns(10);
		textFieldItemPrice.setBounds(113, 108, 174, 30);
		selectedDetailsPanel.add(textFieldItemPrice);
		
		textFieldItemStock = new JTextField();
		textFieldItemStock.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldItemStock.setEditable(false);
		textFieldItemStock.setColumns(10);
		textFieldItemStock.setBounds(113, 148, 89, 30);
		selectedDetailsPanel.add(textFieldItemStock);
		
		JLabel lblItemId = new JLabel("Item ID:");
		lblItemId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblItemId.setBounds(10, 28, 97, 30);
		selectedDetailsPanel.add(lblItemId);
		
		JPanel itemDetailsPanel = new JPanel();
		itemDetailsPanel.setLayout(null);
		itemDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		itemDetailsPanel.setBackground(new Color(102, 153, 204));
		itemDetailsPanel.setBounds(308, 10, 297, 199);
		panelDetails.add(itemDetailsPanel);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuantity.setBounds(10, 26, 89, 30);
		itemDetailsPanel.add(lblQuantity);
		
		JLabel lblTotalPrice = new JLabel("Total Price:");
		lblTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalPrice.setBounds(10, 146, 105, 30);
		itemDetailsPanel.add(lblTotalPrice);
		
		JComboBox comboBoxQuantity = new JComboBox();
		comboBoxQuantity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxQuantity.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBoxQuantity.setBounds(96, 26, 191, 30);
		itemDetailsPanel.add(comboBoxQuantity);
		
		textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldTotalPrice.setEditable(false);
		textFieldTotalPrice.setBounds(137, 146, 150, 30);
		itemDetailsPanel.add(textFieldTotalPrice);
		textFieldTotalPrice.setColumns(10);
		
		JLabel lblPaymentType = new JLabel("Payment type:");
		lblPaymentType.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPaymentType.setBounds(10, 66, 130, 30);
		itemDetailsPanel.add(lblPaymentType);
		
		JComboBox comboBoxPaymentType = new JComboBox();
		comboBoxPaymentType.setModel(new DefaultComboBoxModel(new String[] {"Card", "PayPal", "Google Pay"}));
		comboBoxPaymentType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxPaymentType.setBounds(137, 66, 150, 30);
		itemDetailsPanel.add(comboBoxPaymentType);
		
		JLabel lblCardNo = new JLabel("Card No.:");
		lblCardNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCardNo.setBounds(10, 106, 130, 30);
		itemDetailsPanel.add(lblCardNo);
		
		textFieldCardNo = new JTextField();
		textFieldCardNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCardNo.setColumns(10);
		textFieldCardNo.setBounds(96, 106, 191, 30);
		itemDetailsPanel.add(textFieldCardNo);
		
		JScrollPane scrollPaneStoreTable = new JScrollPane();
		scrollPaneStoreTable.setBounds(10, 40, 605, 177);
		add(scrollPaneStoreTable);
		
		storeTable = new JTable();
		storeTable.setRowHeight(20);
		storeTable.setSelectionBackground(SystemColor.activeCaption);
		storeTable.setName("StoreTable");
		storeTable.setFillsViewportHeight(true);
		storeTable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		storeTable.setModel(new DefaultTableModel(
			new Object[][] 
			{
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			
			new String[] 
			{
				"Item ID", "Item Name", "Price", "Stock"
			}
		){

			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] 
			{
				Integer.class, String.class, Double.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) 
			{
				return columnTypes[columnIndex];
			}
		});
		scrollPaneStoreTable.setViewportView(storeTable);
		
		JLabel lblNewLabel = new JLabel("STORE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(224, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 0, 605, 40);
		add(lblNewLabel);
		setVisible(true);
	}
}
