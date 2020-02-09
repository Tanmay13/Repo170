package StaticControlFlowParentChild;

public class Derived extends Base {
	
	static int x=100;
	static
	{
		m2();
		System.out.println("First static block");
		
	}
	static void m2()
	{
		System.out.println("static method m1 is exeute:"+j);
		
	}
	public static void main(String[] args) {
		m2();
		System.out.println("Main methode get execute");
	}
	static
	{
		System.out.println("Second static block");
		
	}
	static int y=200;

//Total Static member in base and derived class is 11
}
