package c09threads;

public class ManyNames {

	public static void main(String[] args) {
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr,"Fred");
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		two.setName("Lucy");
		three.setName("Ricky");
		one.start();
		two.start();
		three.start();
	}

}

class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x <= 3; x++) {
			System.out.println("Run by "
					+ Thread.currentThread().getName()
					+ ", x is " + x);
		}
	}
}

/*
 * Methods from the java.lang.Thread Class
 * public static void sleep(long millis) throws InterruptedException
public static void yield()
public final void join() throws InterruptedException
public final void setPriority(int newPriority)

 * Methods from the java.lang.Object Class
public final void wait() throws InterruptedException
public final void notify()
public final void notifyAll()

 */



