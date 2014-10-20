package Model;

import java.awt.Point;


public abstract class Shape{
	
	private Point pointUL;
	private Point pointBR;
	
	public Shape(int x1, int y1, int x2, int y2) {
		pointUL = new Point(x1, y1);
		pointBR = new Point(x2, y2);
	}
	
	public abstract double getArea();
	
	public Point getUpperLeft() {
		return getPointUL();
	}

	public Point getPointUL() {
		return pointUL;
	}

	public void setPointUL(Point point) {
		this.pointUL = point;
	}
	
	public Point getPointBR() {
		return pointBR;
	}

	public void setPointBR(Point point) {
		this.pointBR = point;
	}

	public abstract void paintIt();
	
}
