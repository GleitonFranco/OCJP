package c09threads;

public class Exercise_9_2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(1);
		sb.append('A');
		
		DealLetter d1 = new DealLetter(sb);
		DealLetter d2 = new DealLetter(sb);
		DealLetter d3 = new DealLetter(sb);
		
		d1.start();
		d2.start();
		d3.start();
	}


}

class DealLetter extends Thread {
	StringBuffer sb;

	public DealLetter(StringBuffer sb) {
		super();
		this.sb = sb;
	}

	@Override
	public void run() {
		synchronized(sb) {
			for (int i =0; i<100; i++) {
				System.out.print(sb);
			}
			sb.setCharAt(0, (char)(sb.charAt(0)+1));
		}
	}

}
