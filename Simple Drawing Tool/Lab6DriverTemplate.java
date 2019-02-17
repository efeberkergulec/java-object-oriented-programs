import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;

//Draws simple shapes
public class Lab6DriverTemplate {

	public static void main(String[] args) {
		// TODO: Implement your own Shape class according to the Lab3 description
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		// GRAPHICS: The next line will be removed or commented out before submission to
		// Moodle, we will provide
		// and talk about the DrawingTool class during lab hours to introduce graphics
		// support
		// DrawingTool window = new DrawingTool(shapes);

		Scanner scan = new Scanner(System.in);
		String userCommand = "";

		for (;;) {
			System.out.println("Enter the command: ");
			userCommand = scan.nextLine();

			String[] parameters = userCommand.split(" ");
			int len = parameters.length;
			String command = parameters[0];
			int[] nums;

			if (command.equals("exit"))
				break;

			if (len == 5)
				nums = new int[4];
			else if (len == 4)
				nums = new int[3];
			else
				nums = new int[1];

			for (int count = 0; count < len - 1; count++) {
				nums[count] = Integer.parseInt(parameters[count + 1]);
			}

			Point referencePoint = new Point(nums[0], nums[1]);

			if (command.equals("addR")) {
				shapes.add(new Rectangle(referencePoint, false, nums[2], nums[3]));
				System.out.println(shapes.get(shapes.size() - 1).toString());

			} else if (command.equals("addS")) {
				shapes.add(new Square(referencePoint, false, nums[2]));
				System.out.println(shapes.get(shapes.size() - 1).toString());
			} else if (command.equals("addC")) {
				shapes.add(new Circle(referencePoint, false, nums[2]));
				System.out.println(shapes.get(shapes.size() - 1).toString());
			} else if (command.equals("move")) {
				int shapeNo = nums[0];
				int x = nums[1];
				int y = nums[2];

				Movable shapeMove = shapes.get(shapeNo - 1);

				shapeMove.move(x, y);

				System.out.println(shapeMove);
			} else
				System.exit(0);

			// GRAPHICS: The next line will be removed or commented out before submission to
			// Moodle
			// window.repaint();

		}
		scan.close();
		System.exit(0);
	}

}