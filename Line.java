package lineComparison;

public class Line {
	Point p1;
	Point p2;
	Double length;
	

	double getLength() {
		double length;
		length = Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
		this.length= length;
		return length;
	}
		
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Line other = (Line) obj;
		if (other.length == null) 
				return false;
		if (this.length == null) 
				return false;
		if (!this.length.equals(other.length))
			return false;
		return true;
	}
	
}





