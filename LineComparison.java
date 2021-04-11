package lineComparison;

public class LineComparison {
	public static void main(String[] argv) {
		Point p1 = new Point(1, 4);
		Point p2 = new Point(2, 3);

		Point p3 = new Point(1, 4);
		Point p4 = new Point(2, 3);

		Line line_1 = new Line(p1, p2);
		Line line_2 = new Line(p3, p4);
		
		line_1.getLength();
		line_2.getLength();

		
		if (line_1.equals(line_2))
			System.out.println("l1 and l2 are equal");
		else
			System.out.println("l1 and l2 different");
	}

}
