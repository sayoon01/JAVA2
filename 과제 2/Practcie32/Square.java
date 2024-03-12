
public class Square {
	private int width;
	private int height;
	
	public Square(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		return width * height;
	}
	
	public boolean isSmallerThan(Square s) {
		if(s.area() > this.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static Square getInstance(int width, int height) {
	    Square square = new Square(width, height);
	    return square;
	}
	
}
