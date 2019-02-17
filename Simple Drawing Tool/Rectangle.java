import java.awt.Point;

public class Rectangle extends Shape {
	private int height;
	private int width;

	public Rectangle(Point leftTop, boolean isCircular, int height, int width) {
		calculatePoints(leftTop, isCircular);
		this.height = height;
		this.width = width;
	}

	public void calculateRectanglePoints() {
		leftTop = new Point((int) this.getLeftTop().getX(), (int) this.getLeftTop().getY());
		rightTop = new Point(((int) this.getLeftTop().getX() + this.getWidth()), (int) this.getLeftTop().getY());
		rightBottom = new Point((int) (this.getLeftTop().getX() + this.getWidth()),
				(int) (this.getLeftTop().getY() + this.getHeight()));
		leftBottom = new Point((int) this.getLeftTop().getX(), (int) (this.getLeftTop().getY() + this.getHeight()));
	}

	public double calculateArea() {
		area = this.getWidth() * this.getHeight();
		return area;
	}

	public double calculatePerimeter() {
		perimeter = 2 * (this.getHeight() + this.getWidth());
		return perimeter;
	}

	public String toString() {
		calculateRectanglePoints();
		String result = "Rectangle[h=" + (int) this.getHeight() + ",w=" + (int) this.getWidth() + "]\n";
		result += "Points[(" + (int) this.getLeftTop().getX() + "," + (int) this.getLeftTop().getY() + ")("
				+ (int) this.getRightTop().getX() + "," + (int) this.getRightTop().getY() + ")("
				+ (int) this.getRightBottom().getX() + "," + (int) this.getRightBottom().getY() + ")("
				+ (int) this.getLeftBottom().getX() + "," + (int) this.getLeftBottom().getY() + ")]\n";
		result += "Area=" + this.calculateArea() + "\n";
		result += "Perimeter=" + this.calculatePerimeter();
		return result;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void move(int x, int y) {
		this.leftTop = new Point(x, y);
	}
}
