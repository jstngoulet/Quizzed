/**
 * 
 */
package com.jstngoulet.createdClasses;

import java.awt.BorderLayout;
import java.awt.Graphics;

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
		gp.setBounds(0, 0, WIDTH, HEIGHT);
		gp.repaint();
		mainBackground.add(gp);
		mainBackground.setVisible(true);
	}
	
	/**
	 * @param stringToPrint prints a string to the console
	 */
	public static void NSLog(String stringToPrint){
		System.out.println(stringToPrint);
	}

}
