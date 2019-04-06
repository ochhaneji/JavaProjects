package multithreadig;



 class Example {

	 Example e;
	
	 Example() {
		
	}
	 Example(Example e){
		this.e=e;
	}
	void m1() {
		System.out.println("Ex M1 : "+this);
		if(e != null) {
			e.m1();
		}
	}
	
	
	void m2() {
		System.out.println("Ex M2 : "+this);
		m1();
	}
	
}


class Sample extends Example{
	
	Sample() {
		
	}
	Sample(Example e){
		super(e);	
	}
	void m1() {
		System.out.println("SA m1 : "+this);
		
	}
	
}

public class Test{
	public static void main(String[] args) {
		System.out.println("main start ");
		Sample e1 = new Sample();
		Sample e2 = new Sample(e1);
		e2.m1();
		System.out.println("main end ");
	}
}