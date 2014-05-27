package c09threads;

public class Starter implements Runnable {

	void go(long id) {
		System.out.println(id);
	}
	public static void main(String[] args) {
		System.out.print(Thread.currentThread().getId() + " ");
		// insert code here
//		new Starter().run();
//		new Starter().start();
//		new Thread(new Starter());
//		new Thread(new Starter()).run();
//		new Thread(new Starter()).start();
	}
	
	public void run() { go(Thread.currentThread().getId()); }

}

//When the five fragments are inserted, one at a time at line 9, which are true? (Choose all that apply.)
//A. All five will compile
//B. Only one might produce the output 4 4
//C. Only one might produce the output 4 2
//D. Exactly two might produce the output 4 4
//E. Exactly two might produce the output 4 2
//F. Exactly three might produce the output 4 4
//G. Exactly three might produce the output 4 2