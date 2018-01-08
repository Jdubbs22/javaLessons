package java_lessons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling {

	static Scanner userInput = new Scanner(System.in); // system.in is the
														// keyboard

	public static void main(String[] args) {

		// divideByZero(2);

		/*
		 * System.out.print("How old are you?"); int age = checkValidAge(); if
		 * (age != 0) { System.out.println("You are " + age + " years old"); }
		 * // end if
		 */
		getAFile("./someStuff.txt"); // this file doesn't exist

	}// end main

	public static void getAFile(String fileName) // throws IOException,
													// FileNotFoundException
	// ^^^ above is a shortcut that does this
	// for you via java but then the try/catch needs to be put in main

	{ // begining of method bracket...moved to allow commented out code above

		try {
			FileInputStream file = new FileInputStream(fileName);
		} // end try
		catch (FileNotFoundException e) {
			System.out.println("Sorry but I cannot find that file.");
		} // end catch catch
		catch (IOException e) {
			System.out.println("Unknown IO error.");
		} // end catch
		catch (FileSystemNotFoundException e) {

		} // end catch
		catch (Exception e) { // catches all exceptions
			System.out.println("An error has occurred.");
		} // end catch

		// always put the most likely one first...it responds to that and //
		// ignores the others
		finally { // runs no matter what..used for clean
			// up..close database // connection, // close files left open ect.

			System.out.println("runs no matter what");
		} // end finally

	}// end getAFile method

	private static int checkValidAge() {
		// TODO Auto-generated method stub
		try {
			return userInput.nextInt();
		} // end try
		catch (InputMismatchException e) { // e is the object for the exception
			userInput.next();
			System.out.println("That isn't a whole number");
			return 0;
		} // end catch

	}// end checkValidAge method

	public static void divideByZero(int a) {
		// System.out.println(a / 0);

		try {
			System.out.println(a / 0);

		} // end try

		catch (ArithmeticException e) {
			System.out.println("You cannot divide by zero in arithmetic functions");
			System.out.println(e.getMessage()); // prints / by zero
			System.out.println(e.toString()); // prints
												// java.lang.ArithmeticException:
												// / by zero
			e.printStackTrace(); // prints above + at
									// java_lessons.exception_handling.divideByZero(exception_handling.java:15)
			// at
			// java_lessons.exception_handling.main(exception_handling.java:7)

		} // end catch

	}// end divideByZero

}// end exception handling class
