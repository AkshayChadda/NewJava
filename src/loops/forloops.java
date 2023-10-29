package loops;

public class forloops {

	public static void main(String[] args) {
		
		String str = "Akshay";
		
		String[] strArray = new String[5]; // Declaration
		
		strArray[0] = "Akshay";
		strArray[1] = "Deepak";
		strArray[2] = "Rahul";
		strArray[3] = "Suresh";
		strArray[4] = "Arman";
		
		System.out.println(strArray.toString());
		
		System.out.println(strArray);
		
		
		// 1.Traditional For Loop
		System.out.println("*******Tradtional For Loop*******");
		
		for(int i=0;i<5;i++) {
			
		System.out.println(strArray[i]);	
			
			
		}
		
		//2.For Each Loop
		
		System.out.println("*******For Each Loop*****");
		
		for(String tempVar : strArray) {
			
			System.out.println(tempVar);
			
		}
		//3.For Each using Lambda
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
