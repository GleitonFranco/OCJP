package c09threads;

public class ThreadDemo {

	synchronized void a() { actBusy(); }
	
	static synchronized void b() { actBusy(); }
	
	static void actBusy() {
		try { Thread.sleep(1000); }
		catch (InterruptedException e) {}
	}
	
	public static void main(String[] args) {
		final ThreadDemo x = new ThreadDemo();
		final ThreadDemo y = new ThreadDemo();
		Runnable runnable = new Runnable() {
			public void run() {
				int option = (int) (Math.random() * 4);
				switch (option) {
				case 0: x.a(); break;
				case 1: x.b(); break;
				case 2: y.a(); break;
				case 3: y.b(); break;
				} }
		};
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread2.start();	
	}

}
//Q11
// Which of the following pairs of method invocations could NEVER be executing at the same time?(Choose all that apply.)
// A. x.a() in thread1, and x.a() in thread2
// B. x.a() in thread1, and x.b() in thread2
// C. x.a() in thread1, and y.a() in thread2
// D. x.a() in thread1, and y.b() in thread2
// E. x.b() in thread1, and x.a() in thread2
// F. x.b() in thread1, and x.b() in thread2
// G. x.b() in thread1, and y.a() in thread2
// H. x.b() in thread1, and y.b() in thread2
