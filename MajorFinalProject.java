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
	private JButton nextButton, checkButton, exitButton, topButton, picButton;
	private JTextField sideText, topText, checkText;
	private ImageIcon pic1 = new ImageIcon("Sahara-desert.jpg");
	private ImageIcon pic2 = new ImageIcon("tower.jpg");
	private ImageIcon pic3 = new ImageIcon("india-tajmahal.jpg");
	private ImageIcon pic4 = new ImageIcon("america.jpg");
	private int counter = 0;
	
	private ImageIcon[] Pics = {pic1, pic2, pic3, pic4 }; // remember to add at end
	
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
		sidePanel.setLayout(new GridLayout(8,1));
		sidePanel.setPreferredSize(new Dimension(300,100));
		sidePanel.setBorder(BorderFactory.createMatteBorder(5,0,0,5, Color.WHITE));
		
//==//		
		
		topPanel = new JPanel();
	    topPanel.setLayout(new GridLayout(1,2));
		topPanel.setPreferredSize(new Dimension(700,100));
		topPanel.setBorder(BorderFactory.createMatteBorder(0,0,5,0, Color.WHITE));
		
//==//		
		
		rightPanel = new JPanel();
	    rightPanel.setLayout(new GridLayout(1,2));
		rightPanel.setPreferredSize(new Dimension(300,100));
		rightPanel.setBorder(BorderFactory.createMatteBorder(5,5,0,0, Color.WHITE));
		
//==//
		 picButton = new JButton(Pics[0]);
		 rightPanel.add(picButton);
		 
		ButtonGroup placeGroup = new ButtonGroup();
		
		africa = new JRadioButton("Africa?", false);
		europe = new JRadioButton("Europe?", false);
		india = new JRadioButton("India?", false);
		america = new JRadioButton("America?", false);
		
		placeGroup.add(africa);
		placeGroup.add(europe);
		placeGroup.add(india);
		placeGroup.add(america);
		
		sideText = new JTextField("        Where Am I ?");
		sideText.setFont(new Font("Adobe Gothic Std B",0,15 ));
		sidePanel.add(sideText);
		sidePanel.add(europe);
		sidePanel.add(africa);
		sidePanel.add(india);
		sidePanel.add(america);
		
		africa.addActionListener(this);
		europe.addActionListener(this);
		india.addActionListener(this);
		america.addActionListener(this);
		
		checkButton = new JButton("Are You Right?");
		checkButton.addActionListener(this);
		sidePanel.add(checkButton);
		
		nextButton = new JButton("Next Place");
		nextButton.addActionListener(this);
		sidePanel.add(nextButton);
		
		exitButton = new JButton("EXIT");
		exitButton.addActionListener(this);
		sidePanel.add(exitButton);
		
//==//
		 
		topText = new JTextField(" Hello this is a Geography guessing game. This is where you will see if you are correct:");
		topText.setFont(new Font("Adobe Gothic Std B",0,14 ));
		topText.setSize(500,100);
		topPanel.add(topText);
		
		checkText = new JTextField("dlajd;flajs");
		checkText.setSize(200,100);
		topPanel.add(checkText);
		
//==//		
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(sidePanel, BorderLayout.WEST);
		mainPanel.add(rightPanel, BorderLayout.CENTER);
		setContentPane(mainPanel);
	
		
	}
	  public void actionPerformed(ActionEvent e)
	  
	  {        	
	       if(e.getSource() == exitButton ) {
	            System.exit(0);
	      }
	      else if(e.getSource() == nextButton){
	          picButton.setIcon(Pics[counter]);
	          counter++;
	          counter = counter%Pics.length;
	      }
	  }
}

