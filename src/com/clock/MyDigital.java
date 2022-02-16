package com.clock;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.Timer;
import java.util.Date;


public class MyDigital extends JFrame    //Here, we inheriting the JFrame class
{
	private JLabel heading;
	private JLabel clockLabel;
	
	
	
	private Font font = new Font("",Font.BOLD,35);
	
	
	
	
	
	MyDigital()                  //creating constructor
	{
		
		
		setTitle("My Digital Clock"); //for setting title of the frame 
		setSize(400,400);                //for size i.e length and breadth
		setLocation(400,50);            // set location on the x-axis and y-axis
        this.createGUI();
        this.startClock();
		setVisible(true);           // for making the frame visible
		
	}
	
	  // creating GUI
	
	
	
	public void createGUI()
	{
		heading = new JLabel("My Clock");
		
	    clockLabel = new JLabel("clock");
		
	    
	    heading.setFont(font);
	    clockLabel.setFont(font);
	    
	    
	    this.setLayout(new GridLayout(2,1));
	    
	    this.add(heading);
	    this.add(clockLabel);
	    
	}
	
	
	public void startClock()
	{
		Timer timer = new Timer(1000,new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent e) {
			//	String dateTime=new Date().toString();
				
				Date d = new Date();
				
				SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss a");
				
			String dateTime = sdf.format(d);
				
				clockLabel.setText(dateTime);
				
			} 
		 });
		
		
		timer.start();
		
	}
}
	
	

