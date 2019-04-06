package multithreadig;

public class Test16_toString {

	public static void main(String[] args) {
		Thread th1 = new Thread();
		System.out.println(th1);
		
		//Thread[Thread-0,5,"main"]
		
		Thread th2 = new Thread("Child1");
		System.out.println(th2);
		
		//Thread[Child1,5,"main"]
		
		
		Thread th3 = Thread.currentThread();
		System.out.println(th3);
		//Thread[main,5,"main"]
		
		th3.setPriority(7);
		
		

	}

}
