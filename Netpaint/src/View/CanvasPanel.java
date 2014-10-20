package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Model.SelectedShape;

public class CanvasPanel extends JPanel {
	
	private int x1, x2, y1, y2;
	private boolean isDrawing;
	private ShapeSelectPanel shape;
	
	public CanvasPanel() {
		super();
	
		x1 = y1 = x2 = y2 = 0;
		setLayout(new FlowLayout());
		
		addMouseListener(new ListenToMouse());
		
		setPreferredSize(new Dimension(800,400));
		
		
		
	}

	
	private class ListenToMouse implements MouseMotionListener, MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {

			isDrawing = !isDrawing;
			
			if(!isDrawing) {
				x1 = e.getX();
				y1 = e.getY();
			}
			else {
				x2 = e.getX();
				y2 = e.getY();
				
			}
			
			
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
			
				if(!isDrawing) {
					x2 = e.getX();
					y2 = e.getY();
					repaint();
				}
				
				
			}
			
		}
		

	
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		SelectedShape check = shape.getSelectedShape();
		
		if(isDrawing) {
			
		//	g.setColor(ColorPanel.getColor());
			
			if(check == SelectedShape.LINE) {
				g.drawLine(x1, y1, x2, y2);
			}
			else if(check == SelectedShape.RECT) {
				g.fillRect(x1, y1, x2-x1, y2-y1);
			}
			else if(check == SelectedShape.ELLIPSE) {
				g.fillOval(x1, y1, x2-x1, y2-y1);
			}
			else if(check == SelectedShape.IMAGE) {
				
				BufferedImage image = null;
				
				try {
					image = ImageIO.read(new File("doge.jpeg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				g.drawImage(image , x1, y1, x2-x1, y2-y1, null);
				
			}
			else {
				return;
			}
		
		
		
	}
	
	
}
	
}
