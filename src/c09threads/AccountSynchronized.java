package c09threads;

public class AccountSynchronized implements Runnable {

	private Account acct = new Account();
	
	public static void main(String[] args) {
		AccountSynchronized r = new AccountSynchronized();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();
	}

	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	// A unica alteracao do codigo
	private synchronized void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName()+ " is going to withdraw");
			try {
				Thread.sleep(500);
			} catch(InterruptedException ex) { }
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+ " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for "
					+ Thread.currentThread().getName()
					+ " to withdraw " + acct.getBalance());
		}
	}
	

}