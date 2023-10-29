package StaticNonStatic;

public class StaticNonStatic {

	  static  int pin=7896;
	 int pin1=3465;
	
	public static void main(String[] args) {

		
		
		StaticNonStatic sns = new StaticNonStatic();
		
		System.out.println(sns.pin);
		
		StaticNonStatic sns1 = new StaticNonStatic();
		
		sns1.pin1=111;
		
		System.out.println("SNS1 Object reference..>"+sns1.pin1); // 111
		
		StaticNonStatic sns2 = new StaticNonStatic();
	
	
		
		System.out.println("SNS2 Object reference..>"+sns2.pin1); // 3465
		
		System.out.println(StaticNonStatic.pin);
		
		
		StaticNonStatic.pin=0000;
		
		
		sns1.call();
		StaticNonStatic.call();
		
		
	}

	public static void call() {
		called();
		
	}
	public void called() {
		calling();
		
	}
	public void called() {
		called();
	}
	public void caller() {
		calling();
		
	}
	
}
