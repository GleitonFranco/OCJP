package c09threads;

public class Chess implements Runnable {

	@Override
	public void run() {
		move(Thread.currentThread().getId());
	}
	
//	synchronized void move(long id) {// I
	void move(long id) {// II
		System.out.print(id + " ");
		System.out.print(id + " ");
	}

	public static void main(String[] args) {
		Chess ch = new Chess();
		new Thread(ch).start();
		new Thread(new Chess()).start();
	}

}
