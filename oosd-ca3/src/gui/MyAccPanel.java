package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

public class MyAccPanel extends JPanel
{
	public MyAccPanel()
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		JLabel lblMyAccount = new JLabel("MY ACCOUNT");
		lblMyAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyAccount.setForeground(new Color(224, 255, 255));
		lblMyAccount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMyAccount.setBounds(10, 0, 605, 40);
		add(lblMyAccount);
		
		Panel panelDetails = new Panel();
		panelDetails.setLayout(null);
		panelDetails.setName("");
		panelDetails.setBounds(10, 46, 605, 437);
		add(panelDetails);
	}
}
