package c09threads;

public class ThreadA {
	public static void main(String [] args) {
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b) {// in order to call wait() on the object, ThreadA must own a lock on b.
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {}
			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread {
	int total;
	public void run() {
		synchronized(this) {
			for(int i=0;i<100;i++) {
				total += i;
			}
			notify();
		}
	}
}

// When the thread waits, it temporarily releases the lock for other threads to use, but
// it will need it again to continue execution

// The lock can be acquired much earlier in the code, such as in the calling method.
// If the thread calling wait() does not own the lock, it will throw an
// IllegalMonitorStateException (unchecked exception)
 