public class CompareString {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String x = "SOFTWARETESTINGBLOG";
      String y = "softwaretestingblog";
      /**
       * We cannot use '==' operator to compare two strings.
       * We have to use equals() method.
       */
      if(x.equals(y))
      {
         System.out.println(x+" And " + y + " Both strings are equal.");
      } 
      else
      {
         System.out.println(x+" And " + y + " Both strings are not equal.");
      }
      /**
       * We can ignore case with equalsIgnoreCase() method
       */
      if(x.equalsIgnoreCase(y))
      {
         System.out.println(x+" And " + y + " Both strings are equal.");
      } 
      else
      {
         System.out.println(x+" And " + y + " Both strings are not equal.");
      }
   }
}
