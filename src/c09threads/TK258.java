package c09threads;

public class TK258 {
	private boolean isReady = false;
	
	public synchronized void produce() {
		isReady = true;
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void consume() {
		while(!isReady) {
			notifyAll();
			isReady = true;
		}
	}

}
