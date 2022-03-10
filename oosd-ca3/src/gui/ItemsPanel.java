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

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

public class ItemsPanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JTable productsTable;

	@SuppressWarnings({})
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
		
		JLabel lblProducts = new JLabel("PRODUCTS");
		lblProducts.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducts.setForeground(new Color(224, 255, 255));
		lblProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProducts.setBounds(10, 0, 605, 40);
		add(lblProducts);
		setVisible(true);
	}
}
