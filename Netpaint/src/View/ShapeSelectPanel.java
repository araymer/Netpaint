/**
 * ShapeSelect is a class that extends JPanel and displays the radiobuttons for selecting what to draw on the canvas.
 * Each button is assigned a SelectedShape ENUM to determine which shape to draw. 
 * @author Aaron Raymer & Doug Wade
 */ 
 


package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Model.SelectedShape;

@SuppressWarnings("serial")
public class ShapeSelectPanel extends JPanel implements ActionListener {
	
	private JRadioButton lineBtn;
	private JRadioButton ellipseBtn;
	private JRadioButton rectBtn;
	private JRadioButton imageBtn;
	private ButtonGroup group;
	private final String line = "line";
	private final String ellipse = "ellipse";
	private final String rectangle = "rectangle";
	private final String image = "image";
	private SelectedShape current;
	
	/**
	 * constructs the ShapeSelectPanel, initializes variables and sets up 
	 * radio buttons
	 * @param none
	 * @return N/A
	 */
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
		
		lineBtn.addActionListener(this);
		ellipseBtn.addActionListener(this);
		rectBtn.addActionListener(this);
		imageBtn.addActionListener(this);
		
		lineBtn.setActionCommand(line);
		ellipseBtn.setActionCommand(ellipse);
		rectBtn.setActionCommand(rectangle);
		imageBtn.setActionCommand(image);
		
	}
	
	/**
	 * Returns currently selected shape
	 * @param none
	 * @return SelectedShape
	 */
	public SelectedShape getSelectedShape() {
		return current;
	}
	
	/**
	 * Sets the current shape to the one selected in the ShapeSelectPanel
	 * @param Action Event e
	 * @return void
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "line":		current = SelectedShape.LINE;
							break;
		case "ellipse":		current = SelectedShape.ELLIPSE;
							break;
		case "rectangle":	current = SelectedShape.RECT;
							break;
		case "image":		current = SelectedShape.IMAGE;
							break;
		}
		
		//System.out.println(current); //test code
	}

}