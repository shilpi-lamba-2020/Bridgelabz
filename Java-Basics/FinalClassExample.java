/*Java program that demonstrates the final class*/

final class FinalClassExample { // creates a final class
	public void display() {
	    System.out.println("This is a final class");
	  }
	}
	// try to extend the final class
class Main extends FinalClassExample { //gives error that final class cannot be inherited
	public void display() {
	    System.out.println("Final class cannot be inherited");
	  }  
	public static void main(String[] args) {
	    Main obj = new Main();
	    obj.display();
	  }
}
