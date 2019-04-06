
class BankAccount {
	private long accNum;
	private String accHName;
	private double balance;

	public BankAccount(long accNum, String accHName, double balance) {
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance = balance;
	}

	public void deposit(double amt) {
		this.balance = balance + amt;
	}

	public String toString() {
		return accNum + ", " + accHName + ", " + balance;
	}
}

class DepositerThread implements Runnable{
	private BankAccount acc;
	private double amt;
	private Thread th;
	
	public Thread getThread() {
		return this.th;
	}
	public DepositerThread(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
		
		th = new Thread(this);
		th.start();
	}
	public void  run() {
		acc.deposit(amt);
	}
	
}

public class Test48_BankLogic {

	public static void main(String[] args) throws InterruptedException{
		
		BankAccount acc1 = new BankAccount(1234, "Omi", 1200);
		BankAccount acc2 = new BankAccount(1345, "Jay", 1500);
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println();
		
		DepositerThread dt1 = new DepositerThread(acc1, 2000);
		DepositerThread dt2 = new DepositerThread(acc2, 3000);
		
		dt1.getThread().join();
		dt2.getThread().join();
		
		System.out.println(acc1);
		System.out.println(acc2);
		
		
		
	}

}
	