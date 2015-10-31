package Point;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do you want to set point coordinates?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		
		Moves moves;
		
		if (answer.equals("yes")) {
			System.out.println("Enter coordinates:");
			System.out.print("Enter x: ");
			int x = scanner.nextInt();
			System.out.print("Enter y: ");
			int y = scanner.nextInt();
			System.out.println();
			
			moves = new Moves(x, y);
		} else {
			System.out.println("You will use default coordinates.");
			moves = new Moves();
		}
		
		System.out.print("Enter directions (><^v~):");
		char [] directions = scanner.next().toCharArray();
		
		moves.getDirections(directions);
		
		scanner.close();
	}

}
