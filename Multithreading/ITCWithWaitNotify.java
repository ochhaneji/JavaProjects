
class Factory {

	int items;
	boolean itemsInFactory;

	synchronized void produce(int items) {

		if (itemsInFactory) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.items = items;
		itemsInFactory = true;
		
		System.out.println("items produce : "+items);
		notify();

	}// produce

	synchronized int consume() {

		if (!itemsInFactory) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("items consumed : "+items);
		itemsInFactory = false;
		notify();
		
		
		return items;

	}// consume

}//factory 

//Producer.java
class Producer implements Runnable{
	Factory fa;
	
	Producer(Factory fa){
		this.fa = fa;
		new Thread(this,"Producer").start();;
	}
	
	
	@Override
	public void run() {
		int i =1;
		while(i<=10) {
			fa.produce(i++);
		}
	}
	
}//Producer.java

//Consumer.java
class Consumer implements  Runnable {
	Factory fa;
	Consumer(Factory fa){
		this.fa = fa;
		new Thread(this,"Consumer").start();
	}
	
	
	public void run() {
		int i = 1;
		while(i<=10) {
			fa.consume();
			i++;
		}
	}
}

public class ITCWithWaitNotify {

	public static void main(String[] args) {
		Factory bajaj = new Factory();
		
		new Producer(bajaj);
		new Consumer(bajaj);

	}

}
