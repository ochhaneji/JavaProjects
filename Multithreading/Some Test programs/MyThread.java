package multithreadig;

public class MyThread extends Thread {

	public MyThread() {
		super();
	}

	public MyThread(Runnable arg0) {
		super(arg0);
		
	}
	
	public  void run() {
		System.out.println("MyThread.run()");
	}

	
}
