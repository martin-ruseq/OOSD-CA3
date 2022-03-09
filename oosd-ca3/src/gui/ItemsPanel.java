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

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

public class ItemsPanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JTable storeTable;

	@SuppressWarnings({"rawtypes", "unchecked"})
	public ItemsPanel()
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		Panel panelDetails = new Panel();
		panelDetails.setName("");
		panelDetails.setBounds(10, 230, 605, 263);
		add(panelDetails);
		panelDetails.setLayout(null);
		
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
		
		JLabel lblItems = new JLabel("ITEMS");
		lblItems.setHorizontalAlignment(SwingConstants.CENTER);
		lblItems.setForeground(new Color(224, 255, 255));
		lblItems.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblItems.setBounds(10, 0, 605, 40);
		add(lblItems);
		setVisible(true);
	}
}
