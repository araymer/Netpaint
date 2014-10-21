package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ColorPanel extends JPanel {
	
	private JColorChooser chooser;
	private static ColorPanel panel;
	private ColorPanel() {
		
		chooser = new JColorChooser();
		
		setPreferredSize(new Dimension(800, 250));
		setLayout(new BorderLayout());
		
		add(chooser, BorderLayout.PAGE_END);
		
	}

	public static synchronized ColorPanel getInstance() {
		if(panel == null)
			panel = new ColorPanel();
	
			return panel;
			
	}
	
	public Color getColor() {

		return chooser.getColor();
		
	}

}
