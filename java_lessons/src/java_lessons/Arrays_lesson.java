package java_lessons;

import java.util.Arrays;

public class Arrays_lesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] randomArray; // no length set
		int[] numberArray = new int[10]; // length set at 10..once done it's
											// final

		randomArray = new int[20];
		randomArray[1] = 2;

		String[] stringArray = { "just", "random", "words" }; // sets it to
																// three

		// VVVV using a loop to set array values VVVV

		for (int i = 0; i < numberArray.length; i++) {

			numberArray[i] = i; // sets i to its array value 0 is 0 1 is 1 ect.
			// System.out.println(numberArray[i]);
		} // end for

		int k = 1;
		while (k <= 41) {
			System.out.print("-");// prints a straight line
			k++;
		} // end while
		System.out.println();

		for (int j = 0; j < numberArray.length; j++) {
			System.out.print("| " + j + " "); // creates and visual array

		} // end for
		System.out.println("|");

		String[][] multiArray = new String[10][10]; // multi dimensional array

		for (int i = 0; i < multiArray.length; i++) {

			for (int j = 0; j < multiArray[i].length; j++) {

				multiArray[i][j] = i + " " + j;

			} // end internal for

		} // end for
		k = 1;
		while (k <= 61) {
			System.out.print("-");// prints a straight line
			k++;
		} // end while
		System.out.println();
		for (int i = 0; i < multiArray.length; i++) {

			for (int j = 0; j < multiArray[i].length; j++) {
				System.out.print("| " + multiArray[i][j] + " ");

			} // end internal for
			System.out.println("|");
		} // end for
		k = 1;
		while (k <= 61) {
			System.out.print("-");// prints a straight line
			k++;
		} // end while
		System.out.println();

		for (int row : numberArray) {
			System.out.print(row); // will print out 0123456789
		} // end enhanced for
		System.out.println("\n"); // creates a new line

		for (String[] rows : multiArray) { // another way to print out a multi
											// dimensional array with enhanced
											// for
			for (String column : rows) {
				System.out.print("| " + column + " ");
			} // end internal for
			System.out.println("|");
		} // end enhanced for

		int[] numberCopy = Arrays.copyOf(numberArray, 5);
		// ^^^ copies the first 5 of numberArray into numberCopy
		for (int row : numberCopy) {
			System.out.print(row);
		} // end for
		System.out.println("\n");

		Arrays.copyOfRange(numberArray, 3, 6);
		// ^^^ copies an array from 3 to 6 or 345

		System.out.println(Arrays.toString(numberCopy));
		// ^^^ another way to print out an array

		int[] moreNumbers = new int[100];
		Arrays.fill(moreNumbers, 2); // will put 2 as the default value of every
										// array position

		char[][] boardGame = new char[10][10];
		for (char[] row : boardGame) {
			Arrays.fill(row, '*'); // fills with * char
		} // end for

		int[] numsToSort = new int[10];

		for (int i = 0; i < 10; i++) { // created an array of random #'s between
										// 0 and 100
			numsToSort[i] = (int) (Math.random() * 101);
		} // end for

		Arrays.sort(numsToSort); // sorts the #s small to big

		System.out.println(Arrays.toString(numsToSort));

		int whereIs50 = Arrays.binarySearch(numsToSort, 50);
		// ^^^ binary search returns index for search value or a negative number
		// (not a specific one) if not found
		System.out.println(whereIs50);

	}// end main

}// end array_lesson
