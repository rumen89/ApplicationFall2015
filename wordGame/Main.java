package wordGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = {{'i', 'v', 'a', 'n'},
						{'e', 'v', 'n', 'h'},
						{'i', 'n', 'a', 'v'},
						{'m', 'v', 'v', 'n'},
						{'q', 'r', 'i', 't'}};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter searched word:");
		char[] searchedWord = scanner.next().toCharArray();
//		char[] word = {'i', 'v', 'a', 'n'};
//		System.out.println(FindWord.charCompare(searchedWord, word));
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == searchedWord[0]) {
					FindWord.wordsCompare(arr, searchedWord, i, j);
				}
			}
		}
		System.out.println("The word is founded " + FindWord.counter + " times.");
		scanner.close();
	}
}
