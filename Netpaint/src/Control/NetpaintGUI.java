/**
 * Author: Aaron Raymer, Doug 
 */


package Control;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import View.CanvasPanel;
import View.ColorPanel;
import View.ShapeSelectPanel;

public class NetpaintGUI extends JFrame {

	
	private CanvasPanel canvas;
	private ColorPanel colors;
	private ShapeSelectPanel shapeSelect;

	
	public static void main(String[] args) {
		new NetpaintGUI().setVisible(true);
	}
	
	public NetpaintGUI() {
		
		canvas = new CanvasPanel();
		colors = new ColorPanel();
		shapeSelect = new ShapeSelectPanel();
	
		
		setupJFrame();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

	private void setupJFrame() {
		
		this.setSize(800, 800);
		setLocation(100, 0);
		setLayout(new FlowLayout());
		add(canvas);
		add(shapeSelect);
		add(colors);
	
	}
	
	
	
}
