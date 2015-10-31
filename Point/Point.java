package Point;

public class Point {
	private int x;
	private int y;
	
	//Default constructor
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public void moveLeft() {
		x = x - 1;
	}
	
	public void moveRight() {
		x = x + 1;
	}
	
	public void moveUp() {
		y = y - 1;
	}
	
	public void moveDown() {
		y = y + 1;
	}
}
