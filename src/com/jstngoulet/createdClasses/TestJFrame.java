/**
 * 
 */
package com.jstngoulet.createdClasses;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * @author Justin
 *
 */
public class TestJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NSLog("Printing a new JFrame");
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame mainBackground = new JFrame("Rounded Button Example");
		mainBackground.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainBackground.setLayout(new BorderLayout());
		mainBackground.setSize(900, 500);
		mainBackground.setLocationRelativeTo(null);
		
		NSLog("Adding a gradient to the Frame");
		JPanel gp = new GradientPanel();
		gp.setLayout(null);
		gp.setBounds(0, 0, WIDTH, HEIGHT);
		gp.repaint();
		mainBackground.add(gp);
		mainBackground.setVisible(true);
		
		NSLog("Adding the title frame");
		JPanel titleFrame = new TitlePane("Quizzed", new Rectangle(0,0, WIDTH, HEIGHT/3));
		titleFrame.setOpaque(true);
		titleFrame.setBackground(Color.blue);
		gp.add(titleFrame);
		
		gp.revalidate();
		mainBackground.revalidate();
	}
	
	/**
	 * @param stringToPrint prints a string to the console
	 */
	public static void NSLog(String stringToPrint){
		System.out.println(stringToPrint);
	}

}
