package View;

import java.awt.Color;
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

import Control.NetpaintGUI;

import Model.*;


@SuppressWarnings("serial")
public class CanvasPanel extends JPanel {
	
	private int x1, x2, y1, y2;
	private boolean isDrawing;

	
	public CanvasPanel() {
		super();
		
		
	
		x1 = y1 = x2 = y2 = 0;
		isDrawing = false;
		
		setLayout(new FlowLayout());
		setBackground(Color.WHITE);
		addMouseListener(new ListenToMouse());
		addMouseMotionListener(new ListenToMouse());
		
		setPreferredSize(new Dimension(800,400));
		
	}

	
	private class ListenToMouse implements MouseMotionListener, MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {

			
			
			if(!isDrawing) {
				x1 = e.getX();
				y1 = e.getY();
				//System.out.println("COORD1 " + x1 + ", " + y1);
			}
			else {
				x2 = e.getX();
				y2 = e.getY();
				//System.out.println("COORD2 " + x2 + ", " + y2);
				
				NetpaintGUI.getInstance().addShape(x1,y1,x2,y2,ShapeSelectPanel.getInstance().getSelectedShape(),ColorPanel.getInstance().getColor());
				
				repaint();
				
			}
			
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
			
				if(isDrawing) {
					x2 = e.getX();
					y2 = e.getY();
					//System.out.println("MOVED TO " + x2 + ", "+ y2);
					repaint();
				}
				
				
			}
			
		}
		

	
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
for(Shape s : NetpaintGUI.getInstance().getArray()) {
			
			int n1 = s.getX1();
			int n2 = s.getX2();
			int t1 = s.getY1();
			int t2 = s.getY2();
			
			g.setColor(s.getColor());
			
			if(s instanceof Line ) {
				g.drawLine(n1, t1, n2, t2);
			}
			else if(s instanceof Rectangle) {
					if(n2-n1>=0 && t2-t1>=0)
						g.fillRect(n1, t1, n2-n1, t2-t1);
					else if(n2-n1<0 && t2-t1>=0)
						g.fillRect(n2, t1, n1-n2, t2-t1);
					else if(n2-n1>=0 && t2-t1<0)
						g.fillRect(n1, t2, n2-n1, t1-t2);
					else if(n2-n1<0 && t2-t1<0)
						g.fillRect(n2,t2, n1-n2, t1-t2);
				
			}
			else if(s instanceof Ellipse) {
					if(n2-n1>=0 && t2-t1>=0)
						g.fillOval(n1, t1, n2-n1, t2-t1);
					else if(n2-n1<0 && t2-t1>=0)
						g.fillOval(n2, t1, n1-n2, t2-t1);
					else if(n2-n1>=0 && t2-t1<0)
						g.fillOval(n1, t2, n2-n1, t1-t2);
					else if(n2-n1<0 && t2-t1<0)
						g.fillOval(n2, t2, n1-n2, t1-t2);
			}
			else if(s instanceof Image) {
				
				BufferedImage image = null;
				
				try {
					image = ImageIO.read(new File("doge.jpeg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				g.drawImage(image, n1, t1, n2-n1, t2-t1, null);
				
			}
			
		}

		if(isDrawing) {
			SelectedShape sh = ShapeSelectPanel.getInstance().getSelectedShape();
			g.setColor(ColorPanel.getInstance().getColor());
			
			if(sh == SelectedShape.LINE) {
				g.drawLine(x1, y1, x2, y2);
			}
			else if(sh == SelectedShape.RECT) {
					if(x2-x1>=0 && y2-y1>=0)
						g.fillRect(x1, y1, x2-x1, y2-y1);
					else if(x2-x1<0 && y2-y1>=0)
						g.fillRect(x2, y1, x1-x2, y2-y1);
					else if(x2-x1>=0 && y2-y1<0)
						g.fillRect(x1, y2, x2-x1, y1-y2);
					else if(x2-x1<0 && y2-y1<0)
						g.fillRect(x2, y2, x1-x2, y1-y2);
				
			}
			else if(sh == SelectedShape.ELLIPSE) {
					if(x2-x1>=0 && y2-y1>=0)
						g.fillOval(x1, y1, x2-x1, y2-y1);
					else if(x2-x1<0 && y2-y1>=0)
						g.fillOval(x2, y1, x1-x2, y2-y1);
					else if(x2-x1>=0 && y2-y1<0)
						g.fillOval(x1, y2, x2-x1, y1-y2);
					else if(x2-x1<0 && y2-y1<0)
						g.fillOval(x2, y2, x1-x2, y1-y2);
			}
			else if(sh == SelectedShape.IMAGE) {
				
				BufferedImage image = null;
				
				try {
					image = ImageIO.read(new File("doge.jpeg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				g.drawImage(image , x1, y1, x2-x1, y2-y1, null);
				
			}
			
		}
		
		
			
			
	
	}

}
