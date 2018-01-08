package java_lessons;

import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable {
	// interface

	private String checkWhat;

	ReentrantLock lock = new ReentrantLock();

	public PerformSystemCheck(String checkWhat) {

		this.checkWhat = checkWhat;
	}// end performancSys

	// synchronized public void run(){
	// ^^^ used to lock down any method to keep competing threads from accessing
	// at same time
	// ^^ it slows java down so another way is vvv
	public void run() {
		lock.lock();
		System.out.println("Checking " + this.checkWhat);
		lock.unlock();

	}// end run

}// end class
