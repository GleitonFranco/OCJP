package c09threads;

public class Leader implements Runnable {

	@Override
	public void run() {
		System.out.print("r1 ");
		System.out.print("r2 ");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Leader());
		t.start();
		System.out.print("m1 ");
//		t.join();
		System.out.print("m2 ");
	}

}
