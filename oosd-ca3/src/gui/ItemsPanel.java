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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022 

/**
 * This class creates a panel used in the Admin Dashboard that is showing all products in the database and allow adding new products.
 * @author Marcin Rusiecki
 * @version 1.0
 */
public class ItemsPanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JTable productsTable;
	private JTextField txtUpProductId;
	private JTextField txtUpProductName;
	private JTextField txtUpProductPrice;
	private JTextField txtUpProductStock;
	private JTextField txtAddProductName;
	private JTextField txtAddProductPrice;
	private JTextField txtAddProductStock;

	@SuppressWarnings({})
	
	/**
	 * Builds the panel with all products in the database for administrator.
	 */
	public ItemsPanel()
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		Panel panelDetails = new Panel();
		panelDetails.setName("");
		panelDetails.setBounds(10, 220, 605, 263);
		add(panelDetails);
		panelDetails.setLayout(null);
		
		JPanel updateProductPanel = new JPanel();
		updateProductPanel.setLayout(null);
		updateProductPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "UPDATE PRODUCT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		updateProductPanel.setBackground(new Color(102, 153, 204));
		updateProductPanel.setBounds(1, 0, 297, 263);
		panelDetails.add(updateProductPanel);
		
		JLabel lblUpProductId = new JLabel("Product ID:");
		lblUpProductId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUpProductId.setBounds(10, 23, 118, 30);
		updateProductPanel.add(lblUpProductId);
		
		txtUpProductId = new JTextField();
		txtUpProductId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUpProductId.setEditable(false);
		txtUpProductId.setColumns(10);
		txtUpProductId.setBounds(135, 24, 50, 30);
		updateProductPanel.add(txtUpProductId);
		
		JLabel lblUpProductName = new JLabel("Product Name:");
		lblUpProductName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUpProductName.setBounds(10, 63, 128, 30);
		updateProductPanel.add(lblUpProductName);
		
		txtUpProductName = new JTextField();
		txtUpProductName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUpProductName.setEditable(false);
		txtUpProductName.setColumns(10);
		txtUpProductName.setBounds(135, 63, 153, 30);
		updateProductPanel.add(txtUpProductName);
		
		JLabel lblUpProductPrice = new JLabel("Product Price:");
		lblUpProductPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUpProductPrice.setBounds(10, 103, 118, 30);
		updateProductPanel.add(lblUpProductPrice);
		
		txtUpProductPrice = new JTextField();
		txtUpProductPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUpProductPrice.setEditable(false);
		txtUpProductPrice.setColumns(10);
		txtUpProductPrice.setBounds(135, 103, 153, 30);
		updateProductPanel.add(txtUpProductPrice);
		
		JLabel lblUpProductStock = new JLabel("Product Stock:");
		lblUpProductStock.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUpProductStock.setBounds(10, 143, 118, 30);
		updateProductPanel.add(lblUpProductStock);
		
		txtUpProductStock = new JTextField();
		txtUpProductStock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUpProductStock.setEditable(false);
		txtUpProductStock.setColumns(10);
		txtUpProductStock.setBounds(135, 143, 153, 30);
		updateProductPanel.add(txtUpProductStock);
		
		JButton btnUpdateProduct = new JButton("UPDATE");
		btnUpdateProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdateProduct.setBounds(10, 213, 115, 40);
		updateProductPanel.add(btnUpdateProduct);
		
		JButton btnDeleteProduct = new JButton("DELETE");
		btnDeleteProduct.setBackground(Color.RED);
		btnDeleteProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDeleteProduct.setBounds(172, 213, 115, 40);
		updateProductPanel.add(btnDeleteProduct);
		
		JToggleButton tglBtnEdit = new JToggleButton("EDIT OFF");
		tglBtnEdit.setBounds(135, 183, 153, 20);
		updateProductPanel.add(tglBtnEdit);
		
		tglBtnEdit.addItemListener(new ItemListener() 
		{
			/**
			 * This method enables the fields to be editable or non-editable.
			 * @param e the event to be processed
			 */
			public void itemStateChanged(ItemEvent e)
			{
				if(tglBtnEdit.isSelected())
				{
					tglBtnEdit.setText("EDIT ON");
					txtUpProductName.setEditable(true);
					txtUpProductPrice.setEditable(true);
					txtUpProductStock.setEditable(true);
				}
				else
				{
					tglBtnEdit.setText("EDIT OFF");
					txtUpProductName.setEditable(false);
					txtUpProductPrice.setEditable(false);
					txtUpProductStock.setEditable(false);
				}
			}

		});
		
		JPanel addProductPanel = new JPanel();
		addProductPanel.setLayout(null);
		addProductPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ADD PRODUCT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		addProductPanel.setBackground(new Color(102, 153, 204));
		addProductPanel.setBounds(308, 0, 297, 263);
		panelDetails.add(addProductPanel);
		
		JLabel lblAddProductName = new JLabel("Product Name:");
		lblAddProductName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddProductName.setBounds(10, 24, 128, 30);
		addProductPanel.add(lblAddProductName);
		
		txtAddProductName = new JTextField();
		txtAddProductName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAddProductName.setColumns(10);
		txtAddProductName.setBounds(135, 24, 153, 30);
		addProductPanel.add(txtAddProductName);
		
		JLabel lblAddProductPrice = new JLabel("Product Price:");
		lblAddProductPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddProductPrice.setBounds(10, 64, 118, 30);
		addProductPanel.add(lblAddProductPrice);
		
		txtAddProductPrice = new JTextField();
		txtAddProductPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAddProductPrice.setColumns(10);
		txtAddProductPrice.setBounds(135, 64, 153, 30);
		addProductPanel.add(txtAddProductPrice);
		
		JLabel lblAddProductStock = new JLabel("Product Stock:");
		lblAddProductStock.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddProductStock.setBounds(10, 104, 118, 30);
		addProductPanel.add(lblAddProductStock);
		
		txtAddProductStock = new JTextField();
		txtAddProductStock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAddProductStock.setColumns(10);
		txtAddProductStock.setBounds(135, 104, 153, 30);
		addProductPanel.add(txtAddProductStock);
		
		JButton btnAddProduct = new JButton("ADD PRODUCT");
		btnAddProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAddProduct.setBounds(50, 213, 200, 40);
		addProductPanel.add(btnAddProduct);
		
		JScrollPane scrollPaneProductsTable = new JScrollPane();
		scrollPaneProductsTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPaneProductsTable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneProductsTable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneProductsTable.setBounds(10, 37, 605, 177);
		add(scrollPaneProductsTable);
		
		productsTable = new JTable();
		productsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		productsTable.setFillsViewportHeight(true);
		productsTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		productsTable.setRowHeight(20);
		productsTable.setSelectionBackground(SystemColor.activeCaption);
		productsTable.setName("");
		productsTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		productsTable.setModel(new DefaultTableModel(
			new Object[][] {
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
			new String[] {
				"Product ID", "Product Name", "Product Price", "Stock"
			}
		));
		productsTable.getColumnModel().getColumn(0).setResizable(false);
		productsTable.getColumnModel().getColumn(0).setMinWidth(75);
		productsTable.getColumnModel().getColumn(0).setMaxWidth(75);
		productsTable.getColumnModel().getColumn(1).setResizable(false);
		productsTable.getColumnModel().getColumn(1).setPreferredWidth(120);
		productsTable.getColumnModel().getColumn(1).setMinWidth(120);
		productsTable.getColumnModel().getColumn(2).setResizable(false);
		productsTable.getColumnModel().getColumn(2).setPreferredWidth(120);
		productsTable.getColumnModel().getColumn(2).setMinWidth(120);
		productsTable.getColumnModel().getColumn(3).setResizable(false);
		productsTable.getColumnModel().getColumn(3).setMinWidth(75);
		productsTable.getColumnModel().getColumn(3).setMaxWidth(75);
		scrollPaneProductsTable.setViewportView(productsTable);
		DefaultTableModel table = (DefaultTableModel)productsTable.getModel();
		table.setRowCount(0);
		
		JLabel lblProducts = new JLabel("PRODUCTS");
		lblProducts.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducts.setForeground(new Color(224, 255, 255));
		lblProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProducts.setBounds(10, 0, 605, 40);
		add(lblProducts);
		setVisible(true);
		
		try
		{
			final String DATABASE_URL = "jdbc:mysql://localhost/oosd_ca3";
			Connection connection = null ;
			ResultSet resultset = null;
			PreparedStatement prepstat = null ;
			
			connection = DriverManager.getConnection(DATABASE_URL, "root", "");

			prepstat = connection.prepareStatement("SELECT * FROM product");
			
			resultset = prepstat.executeQuery();
			while(resultset.next())
			{
				Object row [] = {resultset.getInt("ProductID") + "  ", resultset.getString("ProductName"), resultset.getDouble("ProductPrice"), resultset.getInt("ProductStock")};
				table.addRow(row);
			}

		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
}
