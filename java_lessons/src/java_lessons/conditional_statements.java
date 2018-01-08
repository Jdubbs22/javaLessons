package java_lessons;

import java.util.Random;
import java.util.Scanner;

public class conditional_statements {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		int randNum = (int) (Math.random() * 51);

		if (randNum > 25 && randNum < 40) {

			System.out.println("The random number is greater than 25...it's " + randNum);
		} // end if

		else if (randNum > 40) {
			System.out.println("The random number is greater than 40...it's " + randNum);
		} // end else if

		else {
			System.out.println("The random number is less than 25... it's " + randNum);
		} // end else
		int value1 = 1;
		int value2 = 2;
		// : is otherwise
		int biggestValue = (value1 > value2) ? value1 : value2;
		// if above is true assign^^^ else ^^^assign to biggestValue
		System.out.println(biggestValue);

		// char theGrade = 'A';
		Random r = new Random(); // random char generated
		char theGrade = (char) (r.nextInt(26) + 'a');

		switch (theGrade) {

		case 'a':
		case 'A':
			System.out.println("Great job!");
			break;
		case 'b':
			System.out.println("Really good but you can do better");
			break;
		case 'c':
			System.out.println("Not bad but you can do better");
			break;
		case 'd':
			System.out.println("You really need to do better");
			break;
		default:
			System.out.println("Unexceptable!");
			break;
		}// end switch
		System.out.println("Please enter your name");
		String yourName = null;
		while (userInput.hasNext()) {
			yourName = userInput.next();

			System.out.println("Well hello " + yourName);
		} // end while

	}// end main
}
