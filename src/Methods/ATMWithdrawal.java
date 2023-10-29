package Methods;

public class ATMWithdrawal {
	
	
	public static void main(String[] args) {
		
		System.out.println("ATM Machine");
		
		ATMWithdrawal atmObj = new ATMWithdrawal();
		System.out.println("atmObj");
		System.out.println(atmObj.verifyCardDetails(12456, 455,"19/7/1998"));
		
	}
	

	public boolean verifyCardDetails(int cardNo,int cvv, String date) {
		
		System.out.println("A DB code where the cardNo all details will be fetched");
		int dbCardNo=12456;
		int dbCVV=455;
		String dbDOB="19/7/1998";
		
		if(cardNo==dbCardNo && cvv==dbCVV && date.equals(dbDOB)) {
			
			System.out.println("Customer verified");
			return true;
			
		} else {
			System.out.println("Invalid Card Details");
			return false;
		}
		
		
		
	}
	

}
