package View;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Model.SelectedShape;

public class ShapeSelectPanel extends JPanel {
	
	private JRadioButton lineBtn;
	private JRadioButton ellipseBtn;
	private JRadioButton rectBtn;
	private JRadioButton imageBtn;
	private ButtonGroup group;
	private SelectedShape current;
	
	public ShapeSelectPanel() {
		
		group = new ButtonGroup();
		
		lineBtn = new JRadioButton();
		rectBtn = new JRadioButton();
		ellipseBtn = new JRadioButton();
		imageBtn = new JRadioButton();
		
		lineBtn.setText("Line");
		ellipseBtn.setText("Ellipse");
		rectBtn.setText("Rectangle");
		imageBtn.setText("Image");
		
		this.setPreferredSize(new Dimension(800, 50));
		this.setLayout(new FlowLayout());
		
		
		group.add(lineBtn);
		group.add(ellipseBtn);
		group.add(rectBtn);
		group.add(imageBtn);
		
		this.add(lineBtn);
		this.add(ellipseBtn);
		this.add(rectBtn);
		this.add(imageBtn);
	}

}
