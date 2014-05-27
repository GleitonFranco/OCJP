package c09threads;

public class Q09 {

	public static synchronized void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		t.start();
		System.out.print("X");
		t.wait(10000);
		System.out.print("Y");
	}

}
