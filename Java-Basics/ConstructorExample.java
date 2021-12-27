
/*Program to define the Default constructor (no-arg constructor) and Parameterized constructor*/

public class ConstructorExample{
	
	public static void main(String[] args)
	{
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(5);
		System.out.println("Object 1 = "+mc1.x+ " Object 2 = "+mc2.x);
	}
}
