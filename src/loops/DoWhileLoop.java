package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int whiler=0;
		int dowhile=0;
		
		// the basic difference between while and do while is that do while will execute the block atleast one time
		
		do {
			
			System.out.println(dowhile);
			dowhile++;
			
		
		}
		while(dowhile>3);
		System.out.println("Do While Loop ended");
		
		while(whiler>3) {
			
			System.out.println(whiler);
			whiler++;
		}
		
		
		System.out.println("While Loop ended");
		
		
	/*	int whiler=0;
		int dowhile=0;
		
		do {
			System.out.println(dowhile);
			dowhile++;
		}
		
		while(dowhile<9);
		
		while(whiler<10) {
			System.out.println(whiler);
			whiler++;
		}*/
		
		
		

	}

}


