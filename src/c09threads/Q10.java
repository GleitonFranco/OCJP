package c09threads;

public class Q10 {

	public static void main(String[] args) {
		Thread t = new MyThread10() {	public void run() { System.out.print(" foo"); }		};
		t.start();
	}

}

class MyThread10 extends Thread {
	MyThread10() {
		System.out.print(" MyThread");
	}
	public void run() { System.out.print(" bar"); }
	public void run(String s) { System.out.print(" baz"); }
}
