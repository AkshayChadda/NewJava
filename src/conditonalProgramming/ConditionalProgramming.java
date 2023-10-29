package conditonalProgramming;

public class ConditionalProgramming {

	public static void main(String[] args) {
	
		int balanceAmount = 700000;
		int withdrawalAmount = 100000;
		
		//1.You can write only one If Statement
		
		/*if(balanceAmount>=withdrawalAmount) {
			
			balanceAmount=balanceAmount-withdrawalAmount;
			System.out.println("Balance after deduction :"+balanceAmount);
			
	} */
		
		//2.You can write multiple If statement only
		
		
        /* if(balanceAmount<withdrawalAmount) {
			
		
			System.out.println("Insufficient balance!!!!!!!" );
         }
         if(balanceAmount==withdrawalAmount) {
        	 
        	 balanceAmount = 0;
        	 System.out.println("Balance after deduction :" + balanceAmount);
         }*/
         
         //3.If with and else
         
       /*  if (balanceAmount >= withdrawalAmount) {
        	 
        	balanceAmount = balanceAmount - withdrawalAmount;
        	System.out.println("Balance after deduction :" + balanceAmount);
         } else {
        	 
        	System.out.println("Insufficient balance!!!!"); 
         }*/
      
         //4. If - else - If
         
       /*  if (balanceAmount > withdrawalAmount) {
        	 
         	balanceAmount = balanceAmount - withdrawalAmount;
         	System.out.println("Balance after deduction :" + balanceAmount);
         	
          } else if (balanceAmount < withdrawalAmount){
         	 
         	System.out.println("Insufficient balance!!!!"); 
          } 
          else if(balanceAmount == withdrawalAmount) {
        	 
        	 balanceAmount=0;
        	 System.out.println("Balance after deduction :" + balanceAmount);
         }*/
         
         //5.Nested If else
         
      /*  if (balanceAmount >= withdrawalAmount) {
        	
        	if (balanceAmount == withdrawalAmount) {
        		balanceAmount = 0;
        	} else {
        		balanceAmount = balanceAmount - withdrawalAmount;
        	}
        	System.out.println("Balance after deduction :" + balanceAmount);
        }else {
        	System.out.println("Insufficient balance!!!");
        }*/
   
        
       
         //6.Sequencing
         
       System.out.println("Will be Executed Separately");  
      if(balanceAmount>=withdrawalAmount) {
    	   
    	   balanceAmount=balanceAmount-withdrawalAmount;
			System.out.println("Balance after deduction :"+balanceAmount);
			
       }
       
       System.out.println("Will be Executed Separately"); 
       
       if(balanceAmount==withdrawalAmount) {
      	 
      	 balanceAmount = 0;
      	 System.out.println("Balance after deduction :" + balanceAmount);
       }
       
       System.out.println("Will be Executed Separately"); 
       if (balanceAmount >= withdrawalAmount) {
      	 
       	balanceAmount = balanceAmount - withdrawalAmount;
       	System.out.println("Balance after deduction :" + balanceAmount);
        } else {
       	 
       	System.out.println("Insufficient balance!!!!"); 
        }
       
         
         
         
         
        
         
         
         
         
		
		

}
}