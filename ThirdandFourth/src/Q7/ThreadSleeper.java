package Q7;

public class ThreadSleeper {
	public static void sleep(long milliseconds) {

		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
