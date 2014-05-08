package c09threads;

/*
 *  Trhead == (1)An instance of class java.lang.Thread; (2)A thread of execution
 *  
 *  thread: the one doing the work
 *  runnable: the job
 *  
 *  constructors:
 *  ■ Thread()
 *	■ Thread(Runnable target)
 *	■ Thread(Runnable target, String name)
 *	■ Thread(String name)
 *
 *
 *  Estados: NEW->RUNNABLE<-->RUNNING->DEAD
 *                     A         V
 *                   WAITING/BLOCKING 
 */                    

public class TestThreads {

	public static void main(String[] args) {
		
		
		MyRunnable r = new MyRunnable();
		Thread foo = new Thread(r);
		Thread bar = new Thread(r);
		Thread bat = new Thread(r);
		
		Thread t = new MyThread();
		Thread t2 = new Thread(t); // idiota mas legal pq toda Thread tb implementa Runnable
		
//		To get an actual thread — a new call stack — we still have to start the thread.
//		when start() method is called, the thread is considered to be alive
//		You start a Thread, not a Runnable.
//		OBS: Calling a run() method directly goes onto the current call stack rather than at the beginning of a new call stack
		t.setName("Fred");
		t.run(); // Legal, but does not start a new thread. It's still in the thread "main"
		t.start();
		foo.start();
		t2.start();
		t.start(); // NAO! Vai dar RTE (java.lang.IllegalThreadStateException) O estado terminated é irreversivel
//		OBS2: a ordem nao e previsivel
	}

}

// Duas possiveis opcoes ao criar threads:

// 1: 
class MyRunnable implements Runnable {
	public void run() { // tem q ser implementado
		System.out.println("Important job running in MyRunnable");
	}
}

// 2: Extend the java.lang.Thread class AND  Override the run() method.
class MyThread extends Thread {
	public void run() {  // o metodo ja existe mas tem q ser overriden
		System.out.println("Important job running in MyThread. Run by: "+ Thread.currentThread().getName());
//		A mesma coisa que apenas getName() (nao-estatico)
	}
}
