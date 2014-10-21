/**
 * NetpaintGUI is the controller class to compile necessary application elements, including GUI, in a single class.
 * @Author: Aaron Raymer & Doug Wade
 * 
 */


package Control;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import View.CanvasPanel;
import View.ColorPanel;
import View.ShapeSelectPanel;

public class NetpaintGUI extends JFrame {

	
	private CanvasPanel canvas;
	private ColorPanel colors;
	//private ShapeSelectPanel shapeSelect;


	
	public static void main(String[] args) {
		new NetpaintGUI().setVisible(true);
	}
	
	public NetpaintGUI() {
		
		canvas = new CanvasPanel();
		ColorPanel.getInstance();
		ShapeSelectPanel.getInstance();
	
		
		setupJFrame();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}

	
/**
 * @param none
 * @return none
 * setupJFrame sets the JFrame and adds the JPanel classes to it for display.
 */
	private void setupJFrame() {
		
		setPreferredSize(new Dimension(600,800));
		setLocation(100, 0);
		setLayout(new FlowLayout());
		add(canvas);
		add(ShapeSelectPanel.getInstance());
		add(ColorPanel.getInstance());

	}
	
	
	
	
	
	
}
