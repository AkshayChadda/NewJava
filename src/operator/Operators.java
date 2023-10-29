package operator;

public class Operators {

	public static void main(String[] args) {
	
		//1.Arithmatic Operators

		int a = 98;
		int b = 78;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // Quotient
		System.out.println(a%b); // Remainder

		// Plus sign is used to add one or more than one word/character/sentence
		
		String s1="Tell ";
		String s2="Me ";
		String s3="Something ";
		String s4="About ";
		String s5="Yourself ";
		
		String s6=s1+s2+s3+s4+s5;
		
		System.out.println(s6);
		
		int num1=16;
		int num2=10;
		
		System.out.println("Akshay is"+num1+num2+"Years old");
		System.out.println("Akshay is "+(num1+num2)+"Years old");
		
		
		//2.Unary Operators
		
		int n=23;
		
		System.out.println(n++); //Increments by 1
		
		System.out.println(n);
		
		System.out.println(++n);
		
System.out.println(n--); //Decrement by 1
		
		System.out.println(n);
		
		System.out.println(--n);
			
			// 3. Comparison operators
		
		System.out.println(!true);
		System.out.println(!false);
		
		int balanceFromScreen=25000;
		int balanceFromDb=27000;
		
		System.out.println(balanceFromScreen==balanceFromDb);
		System.out.println(balanceFromScreen!=balanceFromDb);
		System.out.println(balanceFromScreen>balanceFromDb);
		System.out.println(balanceFromScreen<balanceFromDb);
		System.out.println(balanceFromScreen>=balanceFromDb);
		System.out.println(balanceFromScreen<=balanceFromDb);
		
		System.out.println(balanceFromScreen);
		balanceFromScreen=balanceFromDb;
		System.out.println(balanceFromScreen);
		
		
		//4. Logical Operator
		
		// &&-AND operator
		// || -Or operator
		
		System.out.println(balanceFromScreen==balanceFromDb || balanceFromScreen>balanceFromDb);
		
		System.out.println(balanceFromScreen!=balanceFromDb && balanceFromScreen<balanceFromDb);
		
		
		
		
		
		
		
	}

}
