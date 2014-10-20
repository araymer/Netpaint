/**
 * NetpaintGUI is the controller class to compile necessary application elements, including GUI, in a single class.
 * @Author: Aaron Raymer & Doug Wade
 * 
 */


package Control;

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
	private int x1, x2, y1, y2;
	private boolean isDrawing;

	
	public static void main(String[] args) {
		new NetpaintGUI().setVisible(true);
	}
	
	public NetpaintGUI() {
		
		isDrawing = false;
		x1 = y1 = x2 = y2 = 0;
		canvas = new CanvasPanel();
		canvas.addMouseListener(new ListenToMouse());
		colors = new ColorPanel();
		shapeSelect = new ShapeSelectPanel();
	
		
		setupJFrame();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
/**
 * @param none
 * @return none
 * setupJFrame sets the JFrame and adds the JPanel classes to it for display.
 */
	private void setupJFrame() {
		
		this.setSize(800, 800);
		setLocation(100, 0);
		setLayout(new FlowLayout());
		add(canvas);
		add(shapeSelect);
		add(colors);
	
	}
	
	
	private class ListenToMouse implements MouseMotionListener, MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			x1 = e.getX();
			y1 = e.getY();
			
			isDrawing = !isDrawing;
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			SelectedShape check = shapeSelect.getSelectedShape();
			if(isDrawing) {
				if(check == SelectedShape.LINE) {
					//TODO: implement drawing a line
				}
				else if(check == SelectedShape.RECT) {
					//TODO: implement drawing a rectangle
				}
				else if(check == SelectedShape.ELLIPSE) {
					//TODO: implement drawing an ellipse
				}
				else if(check == SelectedShape.IMAGE) {
					//TODO: implement drawing default image
				}
				else {
					
				}
				
				
				
			}
			
		}
		
		
		
	}
	
	
	
}
