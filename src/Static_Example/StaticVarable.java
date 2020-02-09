package Static_Example;

public class StaticVarable {
	
	static int a=m1();
	
	static
	{
		System.out.println("Static block execute sexcond");
		//System.out.println("Welcome inside the static block");
		
	}
	
	static int m1()
	{
		System.out.println("Static methode execute first");
	//	System.out.println("Welcome to static methode");
		return 20;
		
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(+a);
		System.out.println("Main Methode  get execute");
		
	}

}
