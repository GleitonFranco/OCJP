package c09threads;

public class ChicksYack implements Runnable {
	Chicks c;
	public static void main(String[] args) {
		new ChicksYack().go();
	}

	private void go() {
		c = new Chicks();
		new Thread(new ChicksYack()).start();
		new Thread(new ChicksYack()).start();
	}

	@Override
	public void run() {
		c.yack(Thread.currentThread().getId());
	}

}

class Chicks {
	synchronized void yack(long id) {
		for(int x = 1; x < 3; x++) {
			System.out.print(id + " ");
			Thread.yield();
		}
	}
}
