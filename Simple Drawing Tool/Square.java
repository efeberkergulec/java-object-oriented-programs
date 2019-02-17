import java.awt.Point;

public class Square extends Shape {
	private int edge;

	public Square(Point leftTop, boolean isCircular, int edge) {
		calculatePoints(leftTop, isCircular);
		this.edge = edge;
	}

	public void calculateSquarePoints() {
		leftTop = new Point((int) this.getLeftTop().getX(), (int) this.getLeftTop().getY());
		rightTop = new Point((int) (this.getLeftTop().getX() + this.getEdge()), (int) this.getLeftTop().getY());
		rightBottom = new Point((int) (this.getLeftTop().getX() + this.getEdge()),
				(int) (this.getLeftTop().getY() + this.getEdge()));
		leftBottom = new Point((int) this.getLeftTop().getX(), (int) (this.getLeftTop().getY() + this.getEdge()));
	}

	public double calculateArea() {
		area = Math.pow(this.getEdge(), 2);
		return area;
	}

	public double calculatePerimeter() {
		area = 4 * this.getEdge();
		return area;
	}

	public String toString() {
		calculateSquarePoints();
		String result = "Square[e=" + this.getEdge() + "]\n";
		result += "Points[(" + (int) this.getLeftTop().getX() + "," + (int) this.getLeftTop().getY() + ")("
				+ (int) this.getRightTop().getX() + "," + (int) this.getRightTop().getY() + ")("
				+ (int) this.getRightBottom().getX() + "," + (int) this.getRightBottom().getY() + ")("
				+ (int) this.getLeftBottom().getX() + "," + (int) this.getLeftBottom().getY() + ")]\n";
		result += "Area=" + this.calculateArea() + "\n";
		result += "Perimeter=" + this.calculatePerimeter();
		return result;
	}

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}

	public void move(int x, int y) {
		this.leftTop = new Point(x, y);
	}
}