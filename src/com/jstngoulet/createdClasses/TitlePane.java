/**
 * 
 */
package com.jstngoulet.createdClasses;


import java.awt.Rectangle;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * @author Justin
 *This class shows the title label (in a label that adjusts wth the screen so that an image does not need to be attached in teh file)
 */
public class TitlePane extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TitlePane(String titleOfApp, Rectangle thisFrame){
		
		//Set the layout to null
		setLayout(null);
		
		//Create a JLabel
		System.out.println("Creating Title Label");
		JLabel titleLabel = new JLabel (titleOfApp);
		titleLabel.setBounds(thisFrame);
		titleLabel.setHorizontalTextPosition(WIDTH/2);
		add(titleLabel);
		setVisible(true);
		
	}
	
	

}
