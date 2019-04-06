package multithreadig;



public class ClassTestProgramNormal {

	public static void main(String[] args) {

		//Case 1 with MyThread
		 
		  MyThread mt = new MyThread();
		  System.out.println(mt.getState());
		  mt.start();
		  System.out.println(mt.getState());
		 
		
		//Case 2 with MyRunnable
		/*
		 * MyRunnable1 mr = new MyRunnable1(); Thread th = new Thread(mr); th.start();
		 */
		
		for(int i=1;i<=50;i++)
			System.out.println("Main Method :: "+i);
	}

}

//MyThread
/*
 * class MyThread1 extends Thread {
 * 
 * @Override public void run() { for(int i=50;i>0;i--)
 * System.out.println("MyThread Method :: "+i); } }
 */

//MyRunnable
class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=50;i>0;i--)
			 System.out.println("MyRunnable Method :: "+i);
		
	}
	
}


