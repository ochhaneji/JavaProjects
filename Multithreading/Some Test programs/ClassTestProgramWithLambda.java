package multithreadig;

public class ClassTestProgramWithLambda {

	public static void main(String[] args) {

		Runnable r = ()->{
			for(int i=50;i>0;i--)
				System.out.println("MyRunnable :: "+i);
		};
		
		Thread th = new Thread(r);
		th.start();
		
		for(int i=1;i<=50;i++)
			System.out.println("Main Method :: "+i);
	}

}
