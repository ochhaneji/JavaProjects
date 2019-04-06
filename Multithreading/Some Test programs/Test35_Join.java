package multithreadig;

class MyThread31 extends Thread {

	public  void run() {
		System.out.println("run() start");
		
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) {
		}
		System.out.println("run() stop");
	}	
}

public class Test35_Join {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		MyThread31 mt = new MyThread31();
		mt.start();
		
		//mt.join();
		//mt.join(5000);
		//mt.join(15000);
		mt.sleep(15000);
		
		System.out.println("main end");
	}
}
