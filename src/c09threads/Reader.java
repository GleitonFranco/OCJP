package c09threads;

public class Reader extends Thread {
	Calculator c;
	public Reader(Calculator calc) {
		c = calc;
	}
	public void run() {
		synchronized(c) {
			try {
				System.out.println("Waiting for calculation...");
				c.wait();
			} catch (InterruptedException e) {}
			System.out.println("Total is: " + c.total);
		}
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Reader(calculator).start();
		calculator.start();
	}

}

class Calculator extends Thread {
	int total;
	public void run() {
		synchronized(this) {
			for(int i=0;i<100;i++) {
				total += i;
			}
			notifyAll();
		}
	}
}