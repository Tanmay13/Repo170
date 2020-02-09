package Object_Creations_By_Inheritance;

public class Apple extends Fruit {
	
	public Apple() 
    { 
        System.out.println("Subclass constructor invoked"); 
        System.out.println("Sub class object hashcode :" + 
                           this.hashCode()); 
        System.out.println(this.hashCode() + "   " + 
                           super.hashCode()); 
  
        System.out.println(this.getClass().getName() + "  " + 
                           super.getClass().getName()); 
    } 

}
