
public class Test {

	public static void main(String[] args) {
		// will stack block will be going to be executed with final variable
		
		System.out.println(Main.x);
		
	}
}
class Main{
	
	public static final int x=100;/*
	
	* if we declare final keywaor then it will not going to initiate main class
	*
	*/
	
	static {
		System.out.println("main --- class static block");
	}
}