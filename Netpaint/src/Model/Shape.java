/**
 * Shape abstract class will be extended by other shape objects
 * NOTE: "upper left" refers to first coordinate on a mouseclick, "bottom right" refers to the subsequent mouseclick.
 * 		They may not be upper-left and bottom-right graphically.
 * @author Aaron Raymer & Doug Wade
 */

package Model;

import java.awt.Point;


public abstract class Shape{
	
	private Point pointUL;
	private Point pointBR;
	
	/**
	 * Shape constructor
	 * @param x1 - X coordinate of upper-left corner
	 * @param y1 - Y coordinate of upper-left corner
	 * @param x2 - X coordinate of bottom-right corner
	 * @param y2 - Y coordinate of bottom-right corner
	 * @return none
	 */
	public Shape(int x1, int y1, int x2, int y2) {
		pointUL = new Point(x1, y1);
		pointBR = new Point(x2, y2);
	}
	
	/**
	 * @param none
	 * @return double - the area of the shape drawn. 
	 */
	public abstract double getArea();
	
	/**
	 * @param none
	 * @return Point object - represents the upper left corner of the shapes drawing area.
	 */
	public Point getPointUL() {
		return pointUL;
	}

	/**
	 * 
	 * @param point - sets upper-left point with a new point object
	 * @return none
	 */
	public void setPointUL(Point point) {
		this.pointUL = point;
	}
	
	/**
	 * @param none
	 * @return Point object - represents the bottom-right corner of the shapes drawing area.
	 */
	public Point getPointBR() {
		return pointBR;
	}

	/**
	 * 
	 * @param point - sets bottom-right point with a new point object.
	 * @return none
	 */
	public void setPointBR(Point point) {
		this.pointBR = point;
	}

	/**
	 * Draws the shape on the canvas
	 * @param none
	 * @return none
	 * 
	 */
	public abstract void paintIt();
	
}
