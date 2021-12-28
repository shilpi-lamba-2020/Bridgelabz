/*Java program to implement interface inheritance*/
public class MultipleInheritanceExample implements Calculator{
	public int add(int x, int y) {
		return x+y;
	}
	public int subtract(int x, int y) {
		return x-y;
	}
	public int multiply(int x, int y) {
		return x*y;	
	}
	public int divide(int x, int y) {
		return x/y;
	}
	public void printResult(int i) {
		System.out.println("Result is "+i);
	}
	
public static void main(String[] args) {
	MultipleInheritanceExample mie = new MultipleInheritanceExample();
	int a = mie.add(22, 11);
	int b = mie.subtract(48, 24);
	int c = mie.multiply(4, 9);
	int d = mie.divide(100, 25);
	mie.printResult(a);
	mie.printResult(b);
	mie.printResult(c);
	mie.printResult(d);
	
}
}
