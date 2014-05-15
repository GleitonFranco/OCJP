package c09threads;


/*
 *  Access to static fields should be done from static synchronized methods. 
 *  Access to non- static fields should be done from non- static synchronized methods.
 */

public class SyncTest {

	static int count;

	public void doStuff() {
		System.out.println("not synchronized");
		synchronized(this) {
			System.out.println("synchronized");
		}
	}

	public static int getCount() {
		synchronized(SyncTest.class) {
			return count;
		}
	}
	
	public static int getCount2() {
		Class cl=null;
		try {
			cl = Class.forName("SyncTest");
		} catch (ClassNotFoundException e) {	e.printStackTrace();	}
		synchronized(cl) {
			return count;
		}
	}

}

