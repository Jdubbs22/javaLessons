package java_lessons;

import java.util.Scanner;

public class userInput_mathFns {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("What is your favorite number?");

		if (userInput.hasNextInt()) {
			int numberEntered = userInput.nextInt();

			System.out.println("you entered " + numberEntered);

			int numberEntX2 = numberEntered + numberEntered;
			System.out.println("your number times two is " + numberEntX2);

			int numberEntMin2 = numberEntered - 2;
			System.out.println("your number minus two is " + numberEntMin2);

			int numberMod2 = numberEntered % 2;
			System.out.println("your number mod 2 is " + numberMod2);

			int numPlus2 = (numberEntered += 2);
			System.out.println("Your number plus 2 is " + numPlus2);
			numberEntered -= 2;
			numberEntered--;
			System.out.println("Your number minus one is " + numberEntered);
			numberEntered++;

			int numABS = Math.abs(numberEntered);
			System.out.println("The absolute value of your number is " + numABS);

			int whichBigger = Math.max(numberEntered, 256);
			System.out.println("which is bigger, your number or 256...The answer is " + whichBigger);

			double sqrt = Math.sqrt((double) numberEntered);
			System.out.println("The square root of your number is " + sqrt);

			int numRndUp = (int) Math.ceil(sqrt);
			System.out.println("the square root of your number rounded up is " + numRndUp);

			int numRndDown = (int) Math.floor(sqrt);
			System.out.println("the square root of your number rounded down is " + numRndDown);

			int numRnd = (int) Math.round(sqrt);
			System.out.println("your sqare root rounded (up or down) is " + numRnd);

			int randomNum = (int) (Math.random() * 11);// random goes from 0 to
														// .99999
			// * 11 if you want it to go up to 10 (one larger)

			System.out.println("Here is a random number for ya..." + randomNum);

		} // end if
		else
			System.out.println("please enter an integer only");

	}// end main
}
