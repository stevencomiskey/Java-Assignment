/* 
 *  Search Engine 
 *  Author: Steven Comiskey
 *  GUI Class
 */
package com.test.searchengine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener 
{

	
	// GUI Components
	private JPanel 		panel;
	private JTextField 	tf1; 
	String answer = "";
	FileManager file1 = new FileManager();

	// constructor
	GUI(String title)
	{

		super(title);
		setSize(300,300);
		setLayout(new FlowLayout());

		//  GUI components created
		tf1 = new JTextField("");
		tf1.setPreferredSize( new Dimension( 200, 24 ) );

		tf1.setToolTipText("Enter your word and press enter");
		tf1.addActionListener(this);

		// add the GUI components to the frame
		add(tf1);

		// add panel 
		panel = new JPanel(new FlowLayout());
		panel.setBackground(Color.gray);
		JLabel label = new JLabel("Enter your word above");
		panel.add(label);
		add(panel);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if (event.getSource() == tf1)
		{
			try {
				answer = file1.Search(tf1.getText());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			try {
				JOptionPane.showMessageDialog(this, "You entered " + tf1.getText() +"\n"+ answer);
			} catch (HeadlessException e) {
				
				e.printStackTrace();
			}

		}
	}


}