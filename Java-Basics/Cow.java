/*Java program that demonstrates the final method*/
public class Cow extends FinalMethodExample {
	final void sound() {
	System.out.println();
	System.out.println("Additional Characteristics:");
	System.out.println("Sound: Moo Moo");
	}
	void characteristics() {}//method declared as final cannot be overridden
public static void main(String[] args) {
	Cow c = new Cow();
	c.characteristics();
	c.sound();
 }
}