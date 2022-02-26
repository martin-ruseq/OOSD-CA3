package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			21/02/2022

public class SettingsPanel extends JPanel
{
	private static final long serialVersionUID = 1L;

	public SettingsPanel()
	{
		setBounds(0, 0, 625, 493);
		setBackground(new Color(102, 153, 204));
		setLayout(null);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSettings.setFont(new Font("Tahoma", Font.BOLD, 52));
		lblSettings.setBounds(81, 163, 457, 146);
		add(lblSettings);
	}
}
