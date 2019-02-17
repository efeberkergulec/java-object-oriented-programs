import java.awt.*;
import java.util.*;
import java.text.*;

public abstract class Shape implements Movable {
	protected Point leftTop;
	protected Point rightTop;
	protected Point rightBottom;
	protected Point leftBottom;
	protected boolean isCircular;
	protected ArrayList<Point> points = new ArrayList<Point>();
	protected double area;
	protected double perimeter;
	protected DecimalFormat fmt = new DecimalFormat("0.#");

	public void calculatePoints(Point leftTop, boolean isCircular) {
		this.leftTop = leftTop;
		this.isCircular = isCircular;
	}

	public double calculateArea() {
		return 0.0;
	}

	public double calculatePerimeter() {
		return 0.0;
	}

	public String toString() {
		return "";
	}

	public void move(int xCoord, int yCoord) {

	}

	public Point getLeftTop() {
		return leftTop;
	}

	public void setLeftTop(Point leftTop) {
		this.leftTop = leftTop;
	}

	public Point getRightTop() {
		return rightTop;
	}

	public void setRightTop(Point rightTop) {
		this.rightTop = rightTop;
	}

	public Point getRightBottom() {
		return rightBottom;
	}

	public void setRightBottom(Point rightBottom) {
		this.rightBottom = rightBottom;
	}

	public Point getLeftBottom() {
		return leftBottom;
	}

	public void setLeftBottom(Point leftBottom) {
		this.leftBottom = leftBottom;
	}

	public boolean isCircular() {
		return isCircular;
	}

	public void setCircular(boolean isCircular) {
		this.isCircular = isCircular;
	}

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
}
