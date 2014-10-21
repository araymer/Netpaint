package Model;

import java.awt.Color;

/**
 * Represents an ellipse, with methods to construct, paint
 * and get the area. 
 * @author Doug Wade & Aaron Raymer
 */

public class Ellipse extends Shape {
	
	private int axisX, axisY;

	/**
	 * The constructor, take the four points from the canvas and draws an ellipse
	 * @param x1 x-coordinate
	 * @param y1 y-coordinate
	 * @param x2 x-coordinate
	 * @param y2 y-coordinate
	 * @return none
	 */
	public Ellipse(int x1, int y1, int x2, int y2, Color c) {
		super(x1, y1, x2, y2, c);
		// find the length of the x-axis and y-axis
		if(x1 >= x2) {
			axisX = (x1-x2)/2;
		} else {
			axisX = (x2-x1)/2;
		}
		if(y1 >= y2) {
			axisY = (y1-y2)/2;
		} else {
			axisX = (y2-y1)/2;
		}
	}
	
	/**
	 * Returns the area
	 * @param none
	 * @return double
	 */
	@Override
	public double getArea() {
		return Math.PI * axisX * axisY;
	}
	
	/**
	 * Paints the shape
	 * @param none
	 * @return none
	 */
	@Override
	public void paintIt() {
		// TODO Auto-generated method stub
		
	}

}