package java_lessons;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTime20_threadsLesson extends Thread {
	// ^^ now a subclass of thread class..you can only extend one class
	public  void run() {  

		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;

		for (int i = 1; i <= 20; i++) {
			rightNow = new Date();
			currentLocale = new Locale("en"); // en is for english

			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);

			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);

			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();

			try { // must do a sleep for threads
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			// ^^^ must do this exception
		} // end for

		
		
			
		
	}// end run
	
}//end class
