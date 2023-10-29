package StringManipulation;

public class StringOperations {

	public static void main(String[] args) {
		
		String s= "Joe Biden is the President of the United states";
		String s0="Joe Biden is the President of the United states";
		String s1="Joe Biden is the President of the United states";	
		String s2="Joe Biden is the President of the United states";
		
		//Common operations on String
	/*	
		System.out.println("length of String->"+s.length());
		
		System.out.println("Index of d-->"+s.indexOf('d'));
		
		System.out.println("Index of d after 9th postion-->"+s.indexOf('d',23));
		
		System.out.println("Second Index of d -->"+s.indexOf('d',s.indexOf('d')+1));

		

		System.out.println("Index of the-->"+s.indexOf("the"));
		
		System.out.println("Index of the after 36th postion-->"+s.indexOf("the",36));
		
		System.out.println("Second Index of the -->"+s.indexOf("the",s.indexOf("the")+1));
		
		System.out.println("Find the char at particular index-->"+s.charAt(6));
		
		System.out.println(s0.equals(s1));
		System.out.println(s0.equals(s2));
		System.out.println("S0.equalsIgnoreCase(s2");

		
		
	String s3="Joe Biden is the President of the United states";
	
	//Substring
	
	System.out.println(s3.substring(10));
	System.out.println(s3.substring(17,30));
	
	//Trim
	
	String s4="      Joe Biden is the President of the United states    ";
	System.out.println(s4);
	System.out.println(s4.trim());
	*/
	
	
	//Replace
	
	String s5="Joe Biden is the President of the United states";
	
	System.out.println(s5);

	System.out.println(s5.replace(" ", "_"));
	
	System.out.println(s5.replace("the", "their"));
		
	}

}





