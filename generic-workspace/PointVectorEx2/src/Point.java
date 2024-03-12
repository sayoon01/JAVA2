public class Point {
	private int x,y;
	
	public Point(int x,int y) {
		this.x = x;
		this.x = y;
	}
	
	public String toString() {
		return "( " + x + " , " + y + " )";
	}
	
	public boolean equals(Object o) {
		Point p = (Point) o;
		return (x == p.x && y == p.y);
	}
}
