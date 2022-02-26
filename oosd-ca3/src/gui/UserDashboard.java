package gui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

public class UserDashboard extends JFrame
{
	private JPanel mainPanel;
	
	private StorePanel storePanel;
	private OrdersHisPanel ordersHisPanel;
	private MyAccPanel myAccPanel;
	private SettingsPanel settingsPanel;
	

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					UserDashboard frame = new UserDashboard();
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
	 * Create the frame.
	 */
	public UserDashboard()
	{
		setVisible(true);
		setTitle("User Dashboard");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserDashboard.class.getResource("/resources/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(102, 153, 204));
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		storePanel = new StorePanel();
		ordersHisPanel = new OrdersHisPanel();
		myAccPanel = new MyAccPanel();
		settingsPanel = new SettingsPanel();	
		
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
		
		JButton btnStore = new JButton("Store");
		btnStore.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(storePanel);
			}
			public void mouseEntered(MouseEvent e) 
			{
				btnStore.setBackground(new Color(153, 204, 255));
			}
			public void mouseExited(MouseEvent e) 
			{
				btnStore.setBackground(new Color(240, 240, 240));
			}
		});
		btnStore.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnStore.setBounds(10, 20, 173, 45);
		menuBtnsPanel.add(btnStore);
		
		JButton btnOrdersHis = new JButton("Orders History");
		btnOrdersHis.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(ordersHisPanel);
			}
			public void mouseEntered(MouseEvent e) 
			{
				btnOrdersHis.setBackground(new Color(153, 204, 255));
			}
			public void mouseExited(MouseEvent e) 
			{
				btnOrdersHis.setBackground(new Color(240, 240, 240));
			}
		});
		btnOrdersHis.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOrdersHis.setBounds(10, 91, 173, 45);
		menuBtnsPanel.add(btnOrdersHis);
		
		JButton btnSignOut = new JButton("Sign Out");
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
		btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSignOut.setBounds(10, 391, 173, 45);
		menuBtnsPanel.add(btnSignOut);
		
		JButton btnMyAcc = new JButton("My Account");
		btnMyAcc.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(myAccPanel);
			}
			public void mouseEntered(MouseEvent e) 
			{
				btnMyAcc.setBackground(new Color(153, 204, 255));
			}
			public void mouseExited(MouseEvent e) 
			{
				btnMyAcc.setBackground(new Color(240, 240, 240));
			}
		});
		btnMyAcc.setBounds(10, 164, 173, 45);
		menuBtnsPanel.add(btnMyAcc);
		btnMyAcc.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(settingsPanel);
			}
			public void mouseEntered(MouseEvent e) 
			{
				btnSettings.setBackground(new Color(153, 204, 255));
			}
			public void mouseExited(MouseEvent e) 
			{
				btnSettings.setBackground(new Color(240, 240, 240));
			}
		});
		btnSettings.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSettings.setBounds(10, 238, 173, 45);
		menuBtnsPanel.add(btnSettings);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBounds(201, 10, 625, 493);
		contentPanel.setBackground(new Color(102, 153, 204));
		mainPanel.add(contentPanel);
		
		contentPanel.add(storePanel);
		contentPanel.add(ordersHisPanel);
		contentPanel.add(myAccPanel);
		contentPanel.add(settingsPanel);
		contentPanel.setLayout(null);
		
		menuClicked(storePanel);
	
	}
	public void menuClicked(JPanel panel)
	{
		storePanel.setVisible(false);
		ordersHisPanel.setVisible(false);
		myAccPanel.setVisible(false);
		settingsPanel.setVisible(false);
		
		panel.setVisible(true);
	}
}
