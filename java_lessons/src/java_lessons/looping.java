package java_lessons;

import java.util.Scanner;

public class looping {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * int i = 1;
		 * 
		 * while (i <= 20) {
		 * 
		 * if (i == 3) { i += 2; continue; } // end if
		 * 
		 * if ((i % 2) != 0) {// only the positive #s i++; } // end if
		 * 
		 * if (i > 10) { break;// breaks out of the loop altogether } // end if
		 * System.out.println(i); i++;
		 * 
		 * } // end while
		 */

		/*
		 * double myPi = 4.0;
		 * 
		 * double j = 3.0; // formula to figure out pi is 4 - 4/3 + 4/5 - 4/7 +
		 * 4/9.....ect. while (j < 100001) { // value of pi to x points
		 * 
		 * myPi = myPi - (4 / j) + (4 / (j + 2)); j += 4;
		 * System.out.println(myPi); } // end while
		 */

		// System.out.println("The value of pi is " + Math.PI);
		/*
		 * String contYorN = "Y"; int h = 1; while
		 * (contYorN.equalsIgnoreCase("y")) { System.out.println(h);
		 * System.out.println("Do you want to continue Y or N?"); contYorN =
		 * userInput.nextLine(); h++; } // end while
		 */

		int k = 10;
		do {
			System.out.println(k);
			k++;
		} // end do
		while (k < 10);

		int m, n;
		for (m = 1, n = 2; m <= 9; m += 2, n += 2) {
			System.out.println(m + "\n" + n);
		} // end for

	}// end main

}// end class
