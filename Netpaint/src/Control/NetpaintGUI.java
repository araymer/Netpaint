/**
 * NetpaintGUI is the controller class to compile necessary application elements, including GUI, in a single class.
 * @Author: Aaron Raymer & Doug Wade
 * 
 */


package Control;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import Model.SelectedShape;
import View.CanvasPanel;
import View.ColorPanel;
import View.ShapeSelectPanel;

public class NetpaintGUI extends JFrame {

	
	private CanvasPanel canvas;
	private ColorPanel colors;
	private ShapeSelectPanel shapeSelect;


	
	public static void main(String[] args) {
		new NetpaintGUI();
	}
	
	public NetpaintGUI() {
		
		canvas = new CanvasPanel();
		colors = new ColorPanel();
		shapeSelect = new ShapeSelectPanel();
	
		
		setupJFrame();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	
/**
 * @param none
 * @return none
 * setupJFrame sets the JFrame and adds the JPanel classes to it for display.
 */
	private void setupJFrame() {
		
		
		setLocation(100, 0);
		setLayout(new FlowLayout());
		add(canvas);
		add(shapeSelect);
		add(colors);
		this.setSize(800, 800);
		
	
	}
	
	
	
	
	
	
}
