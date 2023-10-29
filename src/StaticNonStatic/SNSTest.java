package StaticNonStatic;

public class SNSTest {
	
	public static void dropped() {
		StaticNonStatic.call();
		
		StaticNonStatic sns=new StaticNonStatic();
		sns.calling();
		
	}
	
	public void drop() {
		StaticNonStatic.call();
		StaticNonStatic sns=new StaticNonStatic();
		sns.calling();
		StaticNonStatic.call();
	}
	
	
	
	
	

}
