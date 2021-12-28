/*Java program that demonstrates the Pass by Value and Pass by Reference method*/

public class CallByValAndRefExample {
	int a = 10;
	void call(int a) {         
		// this local variable a is subject to change in its value
	    a = a+10;
	 }
	void call(CallByValAndRefExample eg) {
        eg.a = eg.a+10;
    }
	     
	 public static void main(String[] args) {
	 CallByValAndRefExample eg = new CallByValAndRefExample();
	 System.out.println("Before call-by-value: " + eg.a);
	         
	  //Passing an integer 50510 to the call() method. The value of 'a' will still be unchanged since the passing parameter is a primitive type.*/
	  eg.call(50510);
	  System.out.println("After call-by-value: " + eg.a);
	         
	  CallByValAndRefExample eg1 = new CallByValAndRefExample();
      System.out.println("Before call-by-reference: " + eg1.a);
       
      // passing the object as a value using pass-by-reference
      eg1.call(eg1);
      System.out.println("After call-by-reference: " + eg1.a);
           
	    }

}
