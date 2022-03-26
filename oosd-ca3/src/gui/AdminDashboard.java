package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			08/03/2022

/**
 * This class creates administrator dashboar to allow the administrator to manage the shop.
 * @author Marcin Rusiecki
 * @version 1.0
 */
public class AdminDashboard extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private CustomersPanel customersPanel;
	private InvoicesPanel invoicesPanel;
	private ItemsPanel itemsPanel;
	
	/** 
	 * Runs the Admin Dashboard application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					AdminDashboard frame = new AdminDashboard();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 *  Builds the Admin Dashboard window.
	 */
	public AdminDashboard()
	{
		setVisible(true);
		setTitle("Admin Dashboard");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminDashboard.class.getResource("/resources/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(102, 153, 204));
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		customersPanel = new CustomersPanel();
		invoicesPanel = new InvoicesPanel();
		itemsPanel = new ItemsPanel();
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(Color.WHITE);
		menuPanel.setForeground(SystemColor.activeCaption);
		menuPanel.setBounds(0, 0, 195, 513);
		mainPanel.add(menuPanel);
		menuPanel.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBorder(new MatteBorder(2, 0, 2, 2, (Color) new Color(64, 64, 64)));
		logo.setIcon(new ImageIcon(UserDashboard.class.getResource("/resources/logoS.png")));
		logo.setBounds(0, 0, 195, 68);
		menuPanel.add(logo);
		
		JPanel menuBtnsPanel = new JPanel();
		menuBtnsPanel.setBorder(new MatteBorder(0, 0, 0, 2, (Color) Color.DARK_GRAY));
		menuBtnsPanel.setBackground(new Color(0, 116, 191));
		menuBtnsPanel.setBounds(0, 67, 195, 446);
		menuPanel.add(menuBtnsPanel);
		menuBtnsPanel.setLayout(null);
		
		JButton btnCustomers = new JButton("CUSTOMERS");
		btnCustomers.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(customersPanel);
			}
			public void mouseEntered(MouseEvent e) 
			{
				btnCustomers.setBackground(new Color(153, 204, 255));
			}
			public void mouseExited(MouseEvent e) 
			{
				btnCustomers.setBackground(new Color(240, 240, 240));
			}
		});
		btnCustomers.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCustomers.setBounds(10, 20, 173, 45);
		menuBtnsPanel.add(btnCustomers);
		
		JButton btnSignOut = new JButton("SIGN OUT");
		btnSignOut.setActionCommand("SIGN OUT");
		btnSignOut.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnSignOut.setBackground(new Color(255, 204, 204));
			}
			
			public void mouseExited(MouseEvent e) 
			{
				btnSignOut.setBackground(new Color(240, 240, 240));
			}
			@SuppressWarnings("static-access")
			public void mouseClicked(MouseEvent e)
			{
				JOptionPane signOut = new JOptionPane();
				int result = signOut.showConfirmDialog(null, "Do you want to Sign Out?", "Confirm", JOptionPane.YES_NO_OPTION);
				
				if (result == 0)
				{
					dispose();
				}
			}
		});
		btnSignOut.setForeground(new Color(204, 0, 0));
		btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSignOut.setBounds(10, 391, 173, 45);
		menuBtnsPanel.add(btnSignOut);
		
		JButton btnProducts = new JButton("PRODUCTS");
		btnProducts.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(itemsPanel);
			}
			public void mouseEntered(MouseEvent e) 
			{
				btnProducts.setBackground(new Color(153, 204, 255));
			}
			public void mouseExited(MouseEvent e) 
			{
				btnProducts.setBackground(new Color(240, 240, 240));
			}
		});
		btnProducts.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnProducts.setBounds(10, 84, 173, 45);
		menuBtnsPanel.add(btnProducts);
		
		JButton btnInvoices = new JButton("INVOICES");
		btnInvoices.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(invoicesPanel);
			}
			public void mouseEntered(MouseEvent e) 
			{
				btnInvoices.setBackground(new Color(153, 204, 255));
			}
			public void mouseExited(MouseEvent e) 
			{
				btnInvoices.setBackground(new Color(240, 240, 240));
			}
		});
		btnInvoices.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnInvoices.setBounds(10, 145, 173, 45);
		menuBtnsPanel.add(btnInvoices);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBounds(201, 10, 625, 493);
		contentPanel.setBackground(new Color(102, 153, 204));
		mainPanel.add(contentPanel);
		
		contentPanel.add(customersPanel);
		contentPanel.add(itemsPanel);
		contentPanel.add(invoicesPanel);
		contentPanel.setLayout(null);
		
		menuClicked(customersPanel);
	}
	/**
	 * Set the appropriate panel to be visible after the administrator selects an option in the AdminDashboard menu.
	 * @param panel is empty and will nest other panels.
	 */
	public void menuClicked(JPanel panel)
	{
		customersPanel.setVisible(false);
		itemsPanel.setVisible(false);
		invoicesPanel.setVisible(false);
		
		panel.setVisible(true);
	}
}
