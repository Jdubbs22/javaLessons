package java_lessons;

public class GetTheMail implements Runnable {
	// ^^ this is an INTERFACE ^^
	private int startTime;

	public GetTheMail(int startTime) {
		this.startTime = startTime;

	}// end constructor

	public void run() {

		try {
			Thread.sleep(startTime * 1000);
		} catch (InterruptedException e) {
		}
		System.out.println("Checking mail");

	}// end run method

}// end class
