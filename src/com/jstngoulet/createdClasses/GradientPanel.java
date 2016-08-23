/**
 * 
 */
package com.jstngoulet.createdClasses;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;

/**
 * @author @see http://stackoverflow.com/q/12220853/230513
 * Edited by Justin Goulet
 *
 */
public class GradientPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int N = 32;

    public GradientPanel() {
        this.setBorder(BorderFactory.createEmptyBorder(N, N, N, N));
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Color color1 = new Color(42, 221, 147);
        Color color2 = new Color(25, 192, 191);
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(
            0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }

}
