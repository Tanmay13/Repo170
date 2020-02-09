package StaticControlFlowParentChild;

public class Base {
	
	static int a=10;
	static
	{
		m1();
		System.out.println("First static block");
		
	}
	static void m1()
	{
		System.out.println("static method m1 is exeute:"+j);
		
	}
	public static void main(String[] args) {
		m1();
		System.out.println("Main methode get execute");
	}
	static
	{
		System.out.println("Second static block");
		
	}
	static int j=20;


}
