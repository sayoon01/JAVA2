//import java.util.Vector;

public class Point {
	private int x,y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() { // 재정의
		return "( " + x + "," + y +" )";
	}
}
