//Evan White

import javax.swing.*;  
import java.util.Calendar;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class MajorFinalProject extends JFrame /*implements ActionListener*/{

	private JPanel mainPanel, sidePanel1, sidePanel2, sidePanel3;
	//private ImageIcon[] triviaPics = {  };// remember to add at end
	
//-----------------------------------------------------------
	public static void main(String[] args) {
		
		JFrame frame = new GuiProjectEW();
		frame.setPreferredSize(new Dimension(800, 650));
		frame.pack();
		frame.setVisible(true);
		
		WindowListener w = new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		};
		frame.addWindowListener(w);
	}

//-----------------------------------------------------------
	MajorFinalProject(){
		
		super("Geography Guessing Game");

		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setPreferredSize(new Dimension(800,650));
		mainPanel.setBorder(BorderFactory.createMatteBorder(20,20,20,20, Color.WHITE));
		
//==//

		sidePanel1 = new JPanel();
		sidePanel1.setLayout(new GridLayout(1,3));
		sidePanel1.setPreferredSize(new Dimension(100,100));
		sidePanel1.setBorder(BorderFactory.createMatteBorder(20,20,20,20, Color.WHITE));
		
//==//		
		
		sidePanel2 = new JPanel();
		sidePanel2.setLayout(new GridLayout(1,2));
		sidePanel2.setPreferredSize(new Dimension(100,100));
		sidePanel2.setBorder(BorderFactory.createMatteBorder(20,20,20,20, Color.WHITE));
		
//==//		
		
		sidePanel3 = new JPanel();
		sidePanel3.setLayout(new GridLayout(1,1));
		sidePanel3.setPreferredSize(new Dimension(100,100));
		sidePanel3.setBorder(BorderFactory.createMatteBorder(20,20,20,20, Color.WHITE));
		
//==//		
		mainPanel.add(sidePanel1, BorderLayout.NORTH);
		mainPanel.add(sidePanel2, BorderLayout.WEST);
		mainPanel.add(sidePanel3, BorderLayout.SOUTH);
		setContentPane(mainPanel);
	
		
	}
}
