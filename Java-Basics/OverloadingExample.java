/*Java program to demonstrate Polymorphism with types method overloading*/

public class OverloadingExample {
	    int add(int n1, int n2) 
	    {
	        return n1+n2;
	    }
	    int add(int n1, int n2, int n3) 
	    {
	        return n1+n2+n3;
	    }
	    double add(double n1, double n2) { 
	    	return n1 + n2;
	    }
	    public static void main(String args[])
	    {
	    	OverloadingExample obj = new OverloadingExample();
	    	System.out.println("Sum of two integers: "+obj.add(20, 21));
	    	System.out.println("Sum of three integers: "+obj.add(20, 21, 22));
	    	System.out.println("Sum of two doubles: "+obj.add(20.22, 21.44));
	    	
	    }
}
