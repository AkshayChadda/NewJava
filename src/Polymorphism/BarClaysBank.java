package Polymorphism;

public class BarClaysBank {

	public static void main(String[] args) {
		BarClaysBank bb= new BarClaysBank();
		
		bb.withdrawalAmount(58.36,85);
		

	}
	public static void main(String op) {
		
	}
	
	public void withdrawalAmount(int withdrawalAmount, int availableAmount) {
		withdrawalAmount(90.56, 85);
		System.out.println("int + int");
		
	}
	
	public void withdrawalAmount(double withdrawalAmount, int availableAmount) {
		System.out.println("double + int");
	}

	public void withdrawalAmount(int withdrawalAmount, double availableAmount) {
		System.out.println("int + double");
	}
	
	public void withdrawalAmount(double withdrawalAmount, double availableAmount) {
		System.out.println("double + double");
	}
	
	
	
}
