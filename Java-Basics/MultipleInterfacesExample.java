/*Java program that demonstrates multiple interfaces*/

public class MultipleInterfacesExample implements Flyable,  Eatable {

	public void fly() {
	System.out.println("flying...");
	}
	public void eat() {
	System.out.println("eating...");
	}
	
	public static void main(String[] args) {
		MultipleInterfacesExample bird = new MultipleInterfacesExample();
		bird.eat();
		bird.fly();
	}
}