/**
 * Shape abstract class will be extended by other shape objects
 * NOTE: "upper left" refers to first coordinate on a mouseclick, "bottom right" refers to the subsequent mouseclick.
 * 		They may not be upper-left and bottom-right graphically.
 * @author Aaron Raymer & Doug Wade
 */

package Model;

import java.awt.Color;
import java.awt.Point;


public abstract class Shape{
	
	private int x1,y1,x2,y2;
	private Color color;
	/**
	 * Shape constructor
	 * @param x1 - X coordinate of upper-left corner
	 * @param y1 - Y coordinate of upper-left corner
	 * @param x2 - X coordinate of bottom-right corner
	 * @param y2 - Y coordinate of bottom-right corner
	 * @return none
	 */
	public Shape(int x1, int y1, int x2, int y2, Color c) {
		
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
		color = c;
	}
	
	/**
	 * @param none
	 * @return double - the area of the shape drawn. 
	 */
	public abstract double getArea();
	
	/**
	 * @param none
	 * @return return int x1
	 */
	public int getX1() {
		return x1;
	}


	
	/**
	 * @param none
	 * @return return int x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * 
	 * @param none
	 * @return return int y1
	 */
	public int getY1() {
		return y1;
	}
	
	/**
	 * 
	 * @param none
	 * @return return int y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Draws the shape on the canvas
	 * @param none
	 * @return none
	 * 
	 */
	public abstract void paintIt();
	
	public Color getColor()  {
		return color;
		
	}
	
}
