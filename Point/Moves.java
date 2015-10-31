package Point;

public class Moves {
	private Point point;
	private boolean reverse;
	
	//Default constructor
	public Moves() {
		point = new Point();
		reverse = false;
	}
	
	public Moves(int x, int y) {
		point = new Point(x, y);
		reverse = false;
	}
	
	public void getDirections(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case '>':
				if (reverse) {
					point.moveLeft();
					break;
				}
				point.moveRight();
				break;
			case '<':
				if (reverse) {
					point.moveRight();
					break;
				}
				point.moveLeft();
				break;
			case '^':
				if(reverse) {
					point.moveDown();
					break;
				}
				point.moveUp();
				break;
			case 'v':
				if (reverse) {
					point.moveUp();
					break;
				}
				point.moveDown();
				break;
			case '~':
				if (reverse) {
					reverse = false;
					break;
				}
				reverse = true;
				break;
			}
		}
		System.out.println(point);
	}
}
