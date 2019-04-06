package multithreadig;

class MyThread23 extends Thread{
	public void run() {
		System.out.println("From run method mt state after start call: "+this.getState());//Runnable
		
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run end");
	}
}

public class Test23_ThreadState {

	public static void main(String[] args) throws InterruptedException {
		MyThread23 mt = new MyThread23();
		System.out.println("From main method mt state after obj creation: "+mt.getState());//NEW
		mt.start();
		System.out.println("From main method mt state after start call: "+mt.getState());//Runnable
		Thread.sleep(500);
		System.out.println("From main method mt state after mt.sleep() call: "+mt.getState());//TIMED_WAITING
		Thread.sleep(6000);
		System.out.println("From main method mt state after run completed: "+mt.getState());//TERMINATED
		

	}

}
