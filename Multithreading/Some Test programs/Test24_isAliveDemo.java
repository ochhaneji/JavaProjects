package multithreadig;

class MyThread24 extends Thread{
	public void run() {
		System.out.println("From run method mt state after start call: "+this.isAlive());//true
		
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run end");
	}
}

public class Test24_isAliveDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread24 mt = new MyThread24();
		System.out.println("From main method mt state after obj creation: "+mt.isAlive());//false
		mt.start();
		System.out.println("From main method mt state after start call: "+mt.isAlive());//true
		Thread.sleep(500);
		System.out.println("From main method mt state after mt.sleep() call: "+mt.isAlive());//true
		Thread.sleep(6000);
		System.out.println("From main method mt state after run completed: "+mt.isAlive());//false
		

	}

}
