package c09threads;

public class DudesChat implements Runnable {
	static Dudes d;
	public static void main(String[] args) {
		new DudesChat().go();

	}

	private void go() {
		d = new Dudes();
		new Thread(new DudesChat()).start();
		new Thread(new DudesChat()).start();
	}

	@Override
	public void run() {
		d.chat(Thread.currentThread().getId());
	}

}

class Dudes {
	static long flag = 0;
	// insert code here
	synchronized void chat(long id) {
//	void chat(long id) {
		if(flag == 0) flag = id;
		for(int x = 1; x < 3; x++) {
			if(flag == id) System.out.print("yo ");
			else System.out.print("dude ");
		}
	}
}
