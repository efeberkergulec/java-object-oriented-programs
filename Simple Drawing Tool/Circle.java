import java.awt.Point;

public class Circle extends Shape {
	private int radius;

	public Circle(Point leftTop, boolean isCircular, int radius) {
		calculatePoints(leftTop, isCircular);
		this.radius = radius;
	}

	public void calculateCirclePoints() {
		leftTop = new Point((int) this.getLeftTop().getX(), (int) this.getLeftTop().getY());
		rightBottom = new Point((int) (this.getLeftTop().getX() + (this.getRadius() * 2)),
				(int) (this.getLeftTop().getY() + (this.getRadius() * 2)));
	}

	public double calculateArea() {
		area = Math.PI * (Math.pow(this.getRadius(), 2));
		return area;
	}

	public double calculatePerimeter() {
		perimeter = 2 * Math.PI * this.getRadius();
		return perimeter;
	}

	public void move(int x, int y) {
		this.leftTop = new Point(x, y);
	}

	public String toString() {
		calculateCirclePoints();
		String result = "Circle[r=" + this.getRadius() + "]\n";
		result += "Points[(" + (int) this.getLeftTop().getX() + "," + (int) this.getLeftTop().getY() + ")("
				+ (int) this.getRightBottom().getX() + "," + (int) this.getRightBottom().getY() + ")]" + "\n";
		result += "Area=" + (Integer.parseInt(fmt.format(this.calculateArea())) + 0.0) + "\n";
		result += "Perimeter=" + (fmt.format(this.calculatePerimeter()));
		return result;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}