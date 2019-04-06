package multithreadig;

public class Test03_RunExecution {

	public static void main(String[] args) {

		/*
		 * Thread th1 = new Thread(); th1.start();
		 */
		
		/*
		 * MyThread mt = new MyThread(); mt.start();
		 */
		
		/*
		 * MyRunnable mr = new MyRunnable(); //mr.start();
		 * 
		 * 
		 * Thread th2 = new Thread(mr); th2.start();
		 */
		/*
		 * MyThread mt = new MyThread(); Thread th3 = new Thread(mt); th3.start()
		 */;
		 
		/*
		 * Thread th4 = new MyThread(); th4.start();
		 */
		 
		 //Thread th5 = new MyRunnable();
		 
		// Runnable r = new MyRunnable();
		// r.start();
		// r.run();
		 
		/*
		 * Thread th6 = new Thread(r); th6.start();
		 */
		 
		 Runnable r = new MyThread();
		// r.start();
		/*
		 * Thread th7 = new Thread(r); th7.start();
		 */
		 
		 MyRunnable mr2 = new MyRunnable();
		 MyThread mt2 = new MyThread(mr2);
		 mt2.start();
		
		System.out.println("Test03_RunExecution.main()");
		
	}

}
