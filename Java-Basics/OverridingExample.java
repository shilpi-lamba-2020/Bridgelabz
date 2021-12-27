/*Java Program to demonstrate Polymorphism with Method overriding*/

public class OverridingExample {
	 public static void main(String args[])
	    {
	    	Car obj = new Ford();
	    	int num= obj.speedLimit();
	    	System.out.println("Speed Limit is: "+num);	
	    	
	    }
}
