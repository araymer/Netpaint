/**
 * Rectangle extends Shape
 * @Author Aaron Raymer & Doug Wade
 */

package Model;

import java.awt.Color;

public class Rectangle extends Shape{

	/**
	 * Rectangle Constructor
	 * @param x1 - X coordinate of upper-left corner
	 * @param y1 - Y coordinate of upper-left corner
	 * @param x2 - X coordinate of bottom-right corner
	 * @param y2 - Y coordinate of bottom-right corner
	 * @return none
	 */
	public Rectangle(int x1, int y1, int x2, int y2, Color c) {
		super(x1, y1, x2, y2, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void paintIt() {
		// TODO Auto-generated method stub
		
	}

}
