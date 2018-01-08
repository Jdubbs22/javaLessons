package java_lessons;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//^^^ time schedule for using your threads
public class Threads {

	public static void main(String[] args) {
		/*
		 * Thread getTime = new GetTime20_threadsLesson(); // ^^^ constructor
		 * Runnable getMail = new GetTheMail(10); Runnable getMailAgain = new
		 * GetTheMail(20);
		 * 
		 * getTime.start();
		 * 
		 * new Thread(getMail).start(); new Thread(getMailAgain).start();
		 * //previous lesson code ^^^
		 */

		addThreadsToPool();

	}// end main

	public static void addThreadsToPool() {
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);

		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("mail"), 5, 5, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("calender"), 10, 1, TimeUnit.SECONDS);

		System.out.println("Number of threads running: " + Thread.activeCount());

		Thread[] listOfThreads = new Thread[Thread.activeCount()];
		// using this to see what threads are running...hint main is the other
		// thread
		Thread.enumerate(listOfThreads);
		// throws the threads into the array

		for (Thread i : listOfThreads) {
			System.out.println(i.getName());
		} // end for

		for (Thread i : listOfThreads) {
			System.out.println(i.getPriority());
			// ^^^ shows what the thread has priority
			// default priority for main is 5....and main has priority over
			// other threads it creates

		} // end for

		try { // use this to shutdown threads
			Thread.sleep(5000);// this is 5 sec
		} // end try
		catch (InterruptedException e) {
		}
		eventPool.shutdown();// this has to follow the try/catch or you could
								// use it before but it will immediatly shut it
								// down

		// threadName.setPriority....used to set priority

	}// end method

}// end class
