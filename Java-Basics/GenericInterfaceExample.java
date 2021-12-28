/*Java program that demonstrates the Generic Interfaces*/

public class GenericInterfaceExample {

	public static void main(String[] args) {
		Power<Float> p = new Power<Float>();
		System.out.println(p.powerOfThree(8f));

	}

}
