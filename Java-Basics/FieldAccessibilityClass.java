/*Java program to access the interface fields*/

public class FieldAccessibilityClass implements FieldAccessibility{
	   public int num = 10000;
	   public void print() {
	      System.out.println(num);
	   }
	   public static void main(String args[]) {
		  FieldAccessibilityClass obj = new FieldAccessibilityClass();
	      System.out.println("Value of num of the interface "+FieldAccessibility.num);
	      System.out.println("Value of num of the class "+obj.num);
	   }
}
