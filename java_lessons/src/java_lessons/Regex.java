package java_lessons;

//regular expressions
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";

		// looking for a word that is 2 to 28 chars in length

		// [A-Za-z]{2,20} or \\w{2,20

		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);

	}// end main

	public static void regexChecker(String theRegex, String str2Check) {

		Pattern checkRegex = Pattern.compile(theRegex);

		Matcher regexMatcher = checkRegex.matcher(str2Check);

		while (regexMatcher.find()) {
			if (regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());// trim gets rid
																// of whitespace
			} // end if
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());

		} // end while

	}// end regexChecker

}// end class
