//Evan White

import javax.swing.*;  
import java.util.Calendar;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class MajorFinalProject extends JFrame implements ActionListener{

	private JPanel mainPanel, sidePanel, topPanel, rightPanel;
	private JRadioButton africa, europe, india, america;
	//private ImageIcon[] triviaPics = {  };// remember to add at end
	
//-----------------------------------------------------------
	public static void main(String[] args) {
		
		JFrame frame = new MajorFinalProject();
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

		sidePanel = new JPanel();
		sidePanel.setLayout(new GridLayout(4,1));
		sidePanel.setPreferredSize(new Dimension(300,100));
		sidePanel.setBorder(BorderFactory.createMatteBorder(5,0,0,5, Color.WHITE));
		
//==//		
		
		topPanel = new JPanel();
	    topPanel.setLayout(new GridLayout(1,2));
		topPanel.setPreferredSize(new Dimension(200,75));
		topPanel.setBorder(BorderFactory.createMatteBorder(0,0,5,0, Color.WHITE));
		
//==//		
		
		rightPanel = new JPanel();
	    rightPanel.setLayout(new GridLayout(1,2));
		rightPanel.setPreferredSize(new Dimension(300,100));
		rightPanel.setBorder(BorderFactory.createMatteBorder(5,5,0,0, Color.WHITE));
		
//==//
		ButtonGroup placeGroup = new ButtonGroup();
		
		africa = new JRadioButton("Africa?", false);
		europe = new JRadioButton("Europe?", false);
		india = new JRadioButton("India?", false);
		america = new JRadioButton("America?", false);
		
		placeGroup.add(africa);
		placeGroup.add(europe);
		placeGroup.add(india);
		placeGroup.add(america);
		
		sidePanel.add(africa);
		sidePanel.add(europe);
		sidePanel.add(india);
		sidePanel.add(america);
		
		africa.addActionListener(this);
		europe.addActionListener(this);
		india.addActionListener(this);
		america.addActionListener(this);
		
		
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(sidePanel, BorderLayout.WEST);
		mainPanel.add(rightPanel, BorderLayout.CENTER);
		setContentPane(mainPanel);
	
		
	}
}
