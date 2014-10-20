package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ColorPanel extends JPanel {
	
	private JColorChooser chooser;
	
	public ColorPanel() {
		
		chooser = new JColorChooser();
		
		setPreferredSize(new Dimension(800, 250));
		setLayout(new BorderLayout());
		
		add(chooser, BorderLayout.PAGE_END);
		
	}

}
