/**
 * NetpaintGUI is the controller class to compile necessary application elements, including GUI, in a single class.
 * @Author: Aaron Raymer & Doug Wade
 * 
 */


package Control;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

import Model.*;

import View.CanvasPanel;
import View.ColorPanel;
import View.ShapeSelectPanel;

public class NetpaintGUI extends JFrame {

	
	private CanvasPanel canvas;
	private ArrayList<Shape> shapes;
	private static NetpaintGUI GUI;


	
	public static void main(String[] args) {
		NetpaintGUI.getInstance().setVisible(true);
	}
	
	private NetpaintGUI() {
		shapes = new ArrayList<Shape>();
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
	
	public void addShape(int x1, int y1, int x2, int y2, SelectedShape s, Color c) {
		if(s == SelectedShape.LINE)
			shapes.add(new Line(x1,y1,x2,y2,c));
		else if(s == SelectedShape.ELLIPSE)
			shapes.add(new Ellipse(x1,y1,x2,y2,c));
		else if(s == SelectedShape.RECT)
			shapes.add(new Rectangle(x1,y1,x2,y2,c));
		else if(s == SelectedShape.IMAGE)
			shapes.add(new Image(x1,y1,x2,y2));
	}
	
	public ArrayList<Shape> getArray() {
		return shapes;
	}
	
	public static synchronized NetpaintGUI getInstance() {
		if(GUI == null)
			GUI = new NetpaintGUI();
		
		return GUI;
	}
	
	
	
	
	
}
